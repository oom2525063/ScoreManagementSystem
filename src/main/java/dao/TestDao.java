package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;
import bean.Subject;
import bean.Test;

public class TestDao extends Dao {

    public String baseSql = "SELECT t.STUDENT_NO, s.NAME AS STUDENT_NAME, t.CLASS_NUM, t.SUBJECT_CD, sub.NAME AS SUBJECT_NAME, t.NO, t.POINT FROM TEST AS t "
            + "JOIN STUDENT s ON t.STUDENT_NO = s.NO "
            + "JOIN SUBJECT sub ON t.SUBJECT_CD = sub.CD AND t.SCHOOL_CD = sub.SCHOOL_CD ";

    // 特定の成績を取得
    public Test get(Student student, Subject subject, School school, int no) throws Exception {

        Test test = null;

        String sql = baseSql + "WHERE t.STUDENT_NO = ? AND t.SUBJECT_CD = ? AND t.NO = ? AND t.SCHOOL_CD = ?;";

        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, student.getNo());
            statement.setString(2, subject.getCd());
            statement.setInt(3, no);
            statement.setString(4, school.getCd());

            try (ResultSet rSet = statement.executeQuery()) {
                if (rSet.next()) {
                    test = postFilter(rSet, school);
                }

                return test;
            }

        } catch (Exception e) {
            throw e;
        }
    }

    // ResultSetからTestを作成
    private Test postFilter(ResultSet rSet, School school) throws SQLException {

        Test test = new Test();

        Student student = new Student();
        student.setNo(rSet.getString("STUDENT_NO"));
        student.setName(rSet.getString("STUDENT_NAME"));
        student.setSchool(school);

        Subject subject = new Subject();
        subject.setCd(rSet.getString("SUBJECT_CD"));
        subject.setName(rSet.getString("SUBJECT_NAME"));
        subject.setSchool(school);

        test.setStudent(student);
        test.setSubject(subject);
        test.setSchool(school);
        test.setNo(rSet.getInt("NO"));
        test.setPoint(rSet.getInt("POINT"));
        test.setClassNum(rSet.getString("CLASS_NUM"));

        return test;
    }

    // 指定された条件に一致する全成績を取得
    public List<Test> filter(int entYear, String classNum, Subject subject, int num, School school) throws Exception {

        List<Test> list = new ArrayList<>();

        String sql = baseSql
                + "WHERE s.ENT_YEAR = ? AND t.CLASS_NUM = ? AND t.SUBJECT_CD = ? AND t.NO = ? AND t.SCHOOL_CD = ?;";

        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, entYear);
            statement.setString(2, classNum);
            statement.setString(3, subject.getCd());
            statement.setInt(4, num);
            statement.setString(5, school.getCd());

            try (ResultSet rSet = statement.executeQuery()) {
                while (rSet.next()) {
                    list.add(postFilter(rSet, school));
                }
            }

            return list;

        } catch (Exception e) {
            throw e;
        }
    }

    // 成績を保存 (リスト)
    public boolean save(List<Test> list, School school) throws Exception {
        for (Test test : list) {
            if (!this.save(test, school)) {
                return false; // 保存可否。失敗→終了
            }
        }
        return true;// 保存可否。成功
    }

    // 成績を保存 (単体)
    private boolean save(Test test, School school) throws Exception {

        // 存在確認
        Test exists = this.get(test.getStudent(), test.getSubject(), school, test.getNo());

        String sql;

        if (exists == null) {
            // 存在しない → 追加
            sql = "INSERT INTO TEST (POINT, STUDENT_NO, SUBJECT_CD, NO, SCHOOL_CD, CLASS_NUM) VALUES (?, ?, ?, ?, ?, ?)";
        } else {
            // 存在 → 更新
            sql = "UPDATE TEST SET POINT = ? WHERE STUDENT_NO = ? AND SUBJECT_CD = ? AND NO = ? AND SCHOOL_CD = ?;";
        }

        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            if (exists == null) {
                // 存在しない。INSERT
                statement.setInt(1, test.getPoint());
                statement.setString(2, test.getStudent().getNo());
                statement.setString(3, test.getSubject().getCd());
                statement.setInt(4, test.getNo());
                statement.setString(5, school.getCd());
                statement.setString(6, test.getClassNum());
            } else {
                // 存在。UPDATE
                statement.setInt(1, test.getPoint());
                statement.setString(2, test.getStudent().getNo());
                statement.setString(3, test.getSubject().getCd());
                statement.setInt(4, test.getNo());
                statement.setString(5, school.getCd());
            }

            return statement.executeUpdate() >= 1; // 登録可否

        } catch (Exception e) {
            throw e;
        }
    }

}

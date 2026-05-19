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

    public String baseSql = "SELECT s.*, " // 学生テーブルの全カラムを展開
            + "t.CLASS_NUM AS TEST_CLASS_NUM, t.SUBJECT_CD AS TEST_SUBJECT_CD, t.NO AS TEST_NO, t.POINT AS TEST_POINT, " // テストテーブルの一部カラム
            + "sub.NAME AS SUBJECT_NAME "
            + "FROM TEST AS t " // FROM
            + "JOIN STUDENT s ON t.STUDENT_NO = s.NO " // 学生JOIN
            + "JOIN SUBJECT sub ON t.SUBJECT_CD = sub.CD AND t.SCHOOL_CD = sub.SCHOOL_CD "; // 科目JOIN

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
                    test = this.postFilter(rSet, subject, school, no);
                }

                return test;
            }

        } catch (Exception e) {
            throw e;
        }
    }

    // ResultSetからTestを作成
    private Test postFilter(ResultSet rSet, Subject subject, School school, int no) throws SQLException, Exception {

        Test test = new Test();

        Student student = StudentDao._studentCreateFromQueryResult(rSet);
        test.setStudent(student);

        test.setSubject(subject);
        test.setSchool(school);
        test.setNo(no);

        // 得点をセット
        int point = rSet.getInt("TEST_POINT");
        if (!rSet.wasNull()) {
            test.setPoint(Integer.valueOf(point));
        } else {
            test.setPoint(null);
        }

        String testClassNum = rSet.getString("TEST_CLASS_NUM");
        if (testClassNum == null || testClassNum.isEmpty()) {
            test.setClassNum(student.getClassNum());
        } else {
            test.setClassNum(testClassNum);
        }

        return test;

    }

    // 指定された条件に一致する全成績を取得
    public List<Test> filter(int entYear, String classNum, Subject subject, int num, School school) throws Exception {

        List<Test> list = new ArrayList<>();

        // ベース
        String sql = "SELECT s.*, t.CLASS_NUM AS TEST_CLASS_NUM, t.NO AS TEST_NO, t.POINT AS TEST_POINT "
                + "FROM STUDENT s "
                + "LEFT JOIN TEST t ON s.NO = t.STUDENT_NO AND t.NO = ? AND t.SUBJECT_CD = ? AND t.SCHOOL_CD = ? "
                + "WHERE s.SCHOOL_CD = ? ";

        ArrayList<Object> otherParams = new ArrayList<>();
        if (entYear != 0) {
            sql += "AND s.ENT_YEAR = ? ";
            otherParams.add(entYear);
        }
        if (classNum != null && !classNum.isEmpty()) {
            sql += "AND s.CLASS_NUM = ? ";
            otherParams.add(classNum);
        }

        sql += "ORDER BY s.NO ASC;";

        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, num);
            statement.setString(2, subject.getCd());
            statement.setString(3, school.getCd());
            statement.setString(4, school.getCd());

            // 追加パラメーターをセット
            for (int i = 0; i < otherParams.size(); i++) {
                Object param = otherParams.get(i);
                if (param instanceof Integer) {
                    statement.setInt(5 + i, (Integer) param);
                } else if (param instanceof String) {
                    statement.setString(5 + i, (String) param);
                }
            }

            try (ResultSet rSet = statement.executeQuery()) {
                while (rSet.next()) {
                    list.add(this.postFilter(rSet, subject, school, num));
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
                // 存在しない → INSERT
                // 得点: nullを区別
                if (test.getPoint() == null) {
                    statement.setNull(1, java.sql.Types.INTEGER);
                } else {
                    statement.setInt(1, test.getPoint());
                }
                statement.setString(2, test.getStudent().getNo());
                statement.setString(3, test.getSubject().getCd());
                statement.setInt(4, test.getNo());
                statement.setString(5, school.getCd());
                statement.setString(6, test.getClassNum());
            } else {
                // 存在 → UPDATE
                // 得点: nullを区別
                if (test.getPoint() == null) {
                    statement.setNull(1, java.sql.Types.INTEGER);
                } else {
                    statement.setInt(1, test.getPoint());
                }
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

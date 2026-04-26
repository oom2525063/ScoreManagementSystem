package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;

public class StudentDao extends Dao {

    public String baseSql = "SELECT * FROM STUDENT "; // WHERE句前までの汎用SQL文

    // dbのクエリーからStudentオブジェクトを生成する汎用メソッド
    public Student _studentCreateFromQueryResult(ResultSet rs) throws Exception {

        Student s = new Student();

        s.setNo(rs.getString("NO"));
        s.setName(rs.getString("NAME"));
        s.setEntYear(rs.getInt("ENT_YEAR"));
        s.setClassNum(rs.getString("CLASS_NUM"));
        s.setAttend(rs.getBoolean("IS_ATTEND"));

        s.setSchool(new SchoolDao().get(rs.getString("SCHOOL_CD")));

        return s;
    }

    // 学生noからStudentを取得
    public Student get(String no) throws Exception {

        try (Connection con = getConnection();
                PreparedStatement st = con
                        .prepareStatement(baseSql + "WHERE NO = ?;");) {

            st.setString(1, no);

            try (ResultSet rs = st.executeQuery();) {

                if (rs.next()) { // 結果が存在
                    return this._studentCreateFromQueryResult(rs); // Studentオブジェクトを生成して返して終了
                }

                return null; // 結果が存在しない

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // filterの各オーバーロードメソッドの基底となる、クエリから一致する学校のStudentオブジェクトを抽出するメソッド
    public List<Student> postFilter(ResultSet resultSet, School school) {

        List<Student> students = new ArrayList<>();

        try (ResultSet rs = resultSet) {

            while (rs.next()) { // 全レコードを抽出
                if (school.getCd().equals(rs.getString("SCHOOL_CD"))) { // 学校コードが一致するか
                    students.add(this._studentCreateFromQueryResult(rs)); // 一致 → Studentオブジェクトを生成してリストに追加
                }
            }

            return students; // フィルタリングした全Studentオブジェクトを返す

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // filter, 絞り込み条件: 多 → 少

    // 全条件
    public List<Student> filter(School school, int entYear, String classNum, boolean isAttend) throws Exception {

        try (Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(baseSql
                        + "WHERE ENT_YEAR = ? AND CLASS_NUM = ? AND IS_ATTEND = ?;");) {

            st.setInt(1, entYear);
            st.setString(2, classNum);
            st.setBoolean(3, isAttend);

            return this.postFilter(st.executeQuery(), school); // クエリの結果から学校コードでフィルタリングして返す

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // - classNum
    public List<Student> filter(School school, int entYear, boolean isAttend) throws Exception {

        try (Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(baseSql
                        + "WHERE ENT_YEAR = ? AND IS_ATTEND = ?;");) {

            st.setInt(1, entYear);
            st.setBoolean(2, isAttend);

            return this.postFilter(st.executeQuery(), school); // クエリの結果から学校コードでフィルタリングして返す

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // - entYear
    public List<Student> filter(School school, boolean isAttend) throws Exception {

        try (Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(baseSql
                        + "WHERE IS_ATTEND = ?;");) {

            st.setBoolean(1, isAttend);

            return this.postFilter(st.executeQuery(), school); // クエリの結果から学校コードでフィルタリングして返す

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 未登録→INSERT、登録済み→UPDATE に分岐
    public boolean save(Student s) throws Exception {

        // 学生取得
        Student existing_student = this.get(s.getNo());

        if (existing_student != null) { // 存在確認
            // 存在 → UPDATE(更新)
            try (Connection con = getConnection();
                    PreparedStatement st = con.prepareStatement(
                            "UPDATE STUDENT SET NAME = ?, ENT_YEAR = ?, CLASS_NUM = ?, IS_ATTEND = ?, SCHOOL_CD = ? WHERE NO = ?;");) {

                st.setString(1, s.getName());
                st.setInt(2, s.getEntYear());
                st.setString(3, s.getClassNum());
                st.setBoolean(4, s.isAttend());
                st.setString(5, s.getSchool().getCd());

                st.setString(6, s.getNo()); // 絞り込み条件

                return st.executeUpdate() >= 1; // db更新可否。1件以上のレコードが更新されたか

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            // 存在しない → INSERT(追加)
            try (Connection con = getConnection();
                    PreparedStatement st = con.prepareStatement(
                            "INSERT INTO STUDENT (NO, NAME, ENT_YEAR, CLASS_NUM, IS_ATTEND, SCHOOL_CD) VALUES (?, ?, ?, ?, ?, ?);");) {

                st.setString(1, s.getNo());
                st.setString(2, s.getName());
                st.setInt(3, s.getEntYear());
                st.setString(4, s.getClassNum());
                st.setBoolean(5, s.isAttend());
                st.setString(6, s.getSchool().getCd());

                return st.executeUpdate() >= 1; // db登録可否。1件以上のレコードが追加されたか

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}

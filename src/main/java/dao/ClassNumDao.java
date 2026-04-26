package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.ClassNum;
import bean.School;

public class ClassNumDao extends Dao {

    // 取得
    public ClassNum get(String class_num, School school) throws Exception {

        try (Connection con = getConnection();
                PreparedStatement st = con
                        .prepareStatement("SELECT * FROM CLASS_NUM WHERE SCHOOL_CD = ?, CLASS_NUM = ?;");) {

            st.setString(1, school.getCd());
            st.setString(2, class_num);

            try (ResultSet rs = st.executeQuery();) {

                if (rs.next()) { // 値の存在で分岐

                    // 結果が存在

                    ClassNum c = new ClassNum();

                    SchoolDao school_dao = new SchoolDao();
                    c.setSchool(school_dao.get(rs.getString("SCHOOL_CD")));

                    c.setClass_num(rs.getString("CLASS_NUM"));

                    return c;
                }

                return null; // 結果が存在しなかった

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 学校の全クラス番号を取得
    public List<String> filter(School school) throws Exception {

        List<String> class_numbers = new ArrayList<>(); // 返すクラス番号のリスト

        try (Connection con = getConnection();
                PreparedStatement st = con
                        .prepareStatement("SELECT * FROM CLASS_NUM WHERE SCHOOL_CD = ?");) {

            st.setString(1, school.getCd());

            try (ResultSet rs = st.executeQuery();) { // 取得

                while (rs.next()) { // 全レコードを抽出
                    class_numbers.add(rs.getString("CLASS_NUM"));
                }

                return class_numbers;

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // クラス番号の保存
    public boolean save(ClassNum class_num) throws Exception {

        try (
                Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(
                        "INSERT INTO CLASS_NUM (SCHOOL_CD, CLASS_NUM) VALUES (?, ?);");) {

            st.setString(1, class_num.getSchool().getCd());
            st.setString(2, class_num.getClass_num());

            int lines = st.executeUpdate();

            if (lines >= 1) { // 挿入に成功
                return true;
            }

            return false; // 挿入に失敗

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // クラス番号の更新
    public boolean save(ClassNum class_num, String newClassNum) throws Exception {

        try (
                Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(
                        "UPDATE CLASS_NUM SET CLASS_NUM = ? WHERE SCHOOL_CD = ?;");) {

            st.setString(1, newClassNum);
            st.setString(2, class_num.getSchool().getCd());

            int lines = st.executeUpdate();

            if (lines >= 1) {// 更新に成功
                return true;
            }

            return false; // 更新に失敗

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

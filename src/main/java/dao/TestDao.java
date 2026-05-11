package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;
import bean.Subject;
import bean.Test;

public class TestDao extends Dao{
	public String baseSql = "SELECT t.*, s.NAME AS STUDENT_NAME FROM TEST t JOIN STUDENT s ON t.STUDENT_NO = s.NO";  

	
	
public Test get(Student student,Subject subject,School school,int no) throws Exception {
	Test test =null;
	Connection connection = getConnection();
    try {
    }
    	
    
    	
    
    	  
}

// filterの各オーバーロードメソッドの基底となる、クエリから一致する学校のStudentオブジェクトを抽出するメソッド
public List<Student> postFilter(ResultSet resultSet, School school) {

    List<Student> students = new ArrayList<>();

    try (ResultSet rs = resultSet) {

        while (rs.next()) { // 全レコードを抽出
            if (school.getCd().equals(rs.getString("SCHOOL_CD"))) {
                students.add(this._testCreateFromQueryResult(rs)); 
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
                        "UPDATE TEST SET STUDENT_NO = ?, SUBJECT_CD = ?, SCHOOL_CD = ?, NO = ?, POINT = ?, CLASS_NUM = ?,;");) {

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
                        "INSERT INTO TEST (STUDENT_NO, SUBJECT_CD, SCHOOL_CD, CLASS_NUM, NO, POINT, CLASS_NUM) VALUES (?, ?, ?, ?, ?, ?);");) {

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
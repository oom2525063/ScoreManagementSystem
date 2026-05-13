package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.TestListStudent;

public class TestListStudentDao extends Dao{

	public String baseSql = "SELECT\n"
			+ "    SUBJECT.CD, SUBJECT.NAME, TEST.NO, TEST.POINT\n"
			+ "FROM\n"
			+ "    TEST LEFT JOIN SUBJECT ON SUBJECT.CD = TEST.SUBJECT_CD\n"
			+ "WHERE\n"
			+ "    TEST.STUDENT_NO = ?;";


	public List<TestListStudent> postFilter(ResultSet rSet) {

        List<TestListStudent> testList = new ArrayList<>();

        try (ResultSet rs = rSet) {

            while (rs.next()) {

                TestListStudent studentTest = new TestListStudent();

                studentTest.setSubjectName(rs.getString("SUBJECT_NAME"));
                studentTest.setSubjectCd(rs.getString("SUBJECT_CD"));
                studentTest.setNum(rs.getInt("NUM"));
                studentTest.setPoint(rs.getInt("POINT"));

                testList.add(studentTest);
            }

            return testList;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


	public List<TestListStudent> filter(School school) throws Exception {

        try (Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(this.baseSql);) {

            st.setString(1, school.getCd());

            return this.postFilter(st.executeQuery());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

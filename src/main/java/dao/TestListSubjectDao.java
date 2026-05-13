package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Subject;
import bean.TestListSubject;

public class TestListSubjectDao extends Dao{
	
	public String baseSql = "SELECT\n"
			+ "    ENT_YEAR, STUDENT.NO, STUDENT.NAME, STUDENT.CLASS_NUM, TEST.POINT\n"
			+ "FROM\n"
			+ "    STUDENT LEFT JOIN TEST ON TEST.STUDENT_NO = STUDENT.NO\n"
			+ "WHERE\n"
			+ "    STUDENT.ENT_YEAR = ? AND STUDENT.CLASS_NUM = ? AND STUDENT.SCHOOL_CD = ?;";
	
	public List<TestListSubject> postFilter(ResultSet resultSet) throws Exception {

        List<TestListSubject> testList = new ArrayList<>();

        try (ResultSet rs = resultSet) {

            while (rs.next()) { 
            	 TestListSubject bean = new TestListSubject();
                 bean.setStudentNo(rs.getString("NO"));
                 bean.setStudentName(rs.getString("NAME"));
                 bean.setEntYear(rs.getInt("ENT_YEAR"));
                 bean.setClassNum(rs.getString("CLASS_NUM"));
                
                 
                 int testNo = rs.getInt("TEST_COUNT");
                 int point = rs.getInt("POINT");
                 if (!rs.wasNull()) {
                     bean.putPoint(testNo, point);
                }
                 testList.add(bean);
            }
            return testList; 
            } 
	}
	
	public List<TestListSubject> filter(int entYear, String classNum, Subject subject, School school) throws Exception {

		List<TestListSubject> testList = new ArrayList<>();

        try (Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(baseSql)) {

            st.setInt(1, entYear);
            st.setString(2, classNum);
        	st.setString(3, school.getCd());

            try (ResultSet rs = st.executeQuery()) {
                // ResultSetからBeanへの変換処理（postFilter的な役割）
                testList = this.postFilter(rs);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return testList;
        }
	}
}
	


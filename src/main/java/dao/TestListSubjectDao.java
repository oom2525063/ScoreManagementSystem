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
			+ "    STUDENT.ENT_YEAR = '2022' AND STUDENT.CLASS_NUM = '201' AND STUDENT.SCHOOL_CD = 'oom';";
	
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
	
	public List<TestListSubject> filter(School school ,int entYear, String classNum ,Subject subject) throws Exception {
		 List<TestListSubject> testList = new ArrayList<>();
        try (Connection con = getConnection();
                PreparedStatement st = con.prepareStatement(baseSql)) {

        	st.setString(1, subject.getCd());
        	st.setString(2, school.getCd());
            st.setInt(3, entYear);
            st.setString(4, classNum);

            try (ResultSet rs = st.executeQuery()) {
                // ResultSetからBeanへの変換処理（postFilter的な役割）
                testList = postFilter(rs);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return testList;
        }
	}
}
	


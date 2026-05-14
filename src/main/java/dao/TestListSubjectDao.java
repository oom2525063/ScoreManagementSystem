package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.School;
import bean.Subject;
import bean.TestListSubject;

public class TestListSubjectDao extends Dao{
	
	public String baseSql = "SELECT\n"
			+ "    ENT_YEAR, STUDENT.NO, STUDENT.NAME, STUDENT.CLASS_NUM, TEST.NO AS T_NO, TEST.POINT\n"
			+ "FROM\n"
			+ "    STUDENT LEFT JOIN TEST ON TEST.STUDENT_NO = STUDENT.NO\n"
			+ "WHERE\n"
			+ "    STUDENT.ENT_YEAR = ? AND STUDENT.CLASS_NUM = ? AND STUDENT.SCHOOL_CD = ?\n"
			+ "ORDER BY\n"
			+ "  STUDENT.NO ASC, TEST.NO ASC;";
		
    public List<TestListSubject> postFilter(ResultSet rSet) throws Exception {

        List<TestListSubject> testList = new ArrayList<>(); // 結果
        Map<String, TestListSubject> studentMap = new HashMap<>(); // pointを入れるための一時的な保管
 
        while (rSet.next()) { // データ取り出し
 
            String studentNo = rSet.getString("NO");
 
            TestListSubject bean; // 追加するobj
 
            if (studentMap.containsKey(studentNo)) {
                // 作成済み → 点数追加のみ
                bean = studentMap.get(studentNo);
            } else {
                // 未作成 → 基本情報をセット
                bean = new TestListSubject();
                bean.setEntYear(rSet.getInt("ENT_YEAR"));
                bean.setStudentNo(studentNo);
                bean.setStudentName(rSet.getString("NAME"));
                bean.setClassNum(rSet.getString("CLASS_NUM"));
               
                // 得点格納用Mapを初期化
                bean.setPoints(new HashMap<Integer, Integer>());
                studentMap.put(studentNo, bean);

                testList.add(bean);
            }
 
            // テスト回数と得点をオブジェクトに追加
            int testNo = rSet.getInt("T_NO");
            if (!rSet.wasNull()) {
                int point = rSet.getInt("POINT");
                bean.putPoint(testNo, point);
            }
        }
 
        return testList;
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

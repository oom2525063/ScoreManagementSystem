package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Subject;

public class SubjectDao extends Dao {

	/**
	 * 科目検索
	 */
	public Subject get(String cd, School school) throws Exception {

		Subject subject = null;

		Connection con = getConnection();

		String sql =
			"select * from subject where cd = ? and school_cd = ?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, cd);
		st.setString(2, school.getCd());

		ResultSet rs = st.executeQuery();

		if (rs.next()) {

			subject = new Subject();

			subject.setCd(rs.getString("cd"));
			subject.setName(rs.getString("name"));
			subject.setSchool(school);
		}

		st.close();
		con.close();

		return subject;
	}

	/**
	 * 科目一覧取得
	 */
	public List<Subject> filter(School school) throws Exception {

		List<Subject> list = new ArrayList<>();

		Connection con = getConnection();

		String sql =
			"select * from subject where school_cd = ? order by cd";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, school.getCd());

		ResultSet rs = st.executeQuery();

		while (rs.next()) {

			Subject subject = new Subject();

			subject.setCd(rs.getString("cd"));
			subject.setName(rs.getString("name"));
			subject.setSchool(school);

			list.add(subject);
		}

		st.close();
		con.close();

		return list;
	}

	/**
	 * 科目登録
	 */
	public boolean insert(Subject subject) throws Exception {

		Connection con = getConnection();

		String sql =
			"insert into subject(cd, name, school_cd) values(?, ?, ?)";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, subject.getCd());
		st.setString(2, subject.getName());
		st.setString(3, subject.getSchool().getCd());

		int count = st.executeUpdate();

		st.close();
		con.close();

		return count > 0;
	}

	/**
	 * 科目変更
	 */
	public boolean update(Subject subject) throws Exception {

		Connection con = getConnection();

		String sql =
			"update subject set name=? where cd=? and school_cd=?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, subject.getName());
		st.setString(2, subject.getCd());
		st.setString(3, subject.getSchool().getCd());

		int count = st.executeUpdate();

		st.close();
		con.close();

		return count > 0;
	}

	/**
	 * 科目削除
	 */
	public boolean delete(Subject subject) throws Exception {

		Connection con = getConnection();

		String sql =
			"delete from subject where cd = ? and school_cd = ?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, subject.getCd());
		st.setString(2, subject.getSchool().getCd());

		int count = st.executeUpdate();

		st.close();
		con.close();

		return count > 0;
	}
}
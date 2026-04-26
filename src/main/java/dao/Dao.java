package dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Dao {

	/**
	 * データソース:DataSource:クラスフィールド
	 */
	static DataSource ds;

	/**
	 * getConnectionメソッド データベースへのコネクションを返す
	 *
	 * @return データベースへのコネクション:Connection
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception {

		if (ds == null) {  // データソースがnullの場合

			InitialContext ic = new InitialContext();

			// データベースに接続
			ds = (DataSource) ic.lookup("java:/comp/env/jdbc/exam");
		}

		// データベースへのコネクションを返却
		return ds.getConnection();
	}

}

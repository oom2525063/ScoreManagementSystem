# Score Management System - プロジェクト内容

**生成日時**: 2026-04-28 14:44:09
**生成回数**: 2
**Commit Hash**: `5818628`

## プロジェクト概要

このプロジェクトはJavaベースの成績管理システムです。
Spring MVC的なフロントコントローラーパターンを採用し、
Servletを使用したMVC アーキテクチャで実装されています。

## ファイル統計

- 総ファイル数: 57
- ソースファイル数: 54
- バイナリファイル数: 3

## ディレクトリ構造

```
├── .classpath
├── .gitignore
├── .project
├── 1_c697f75_PROJECT_SUMMARY.md
├── generate_project_summary.py
└── src/
    └── main/
        ├── java/
        │   ├── bean/
        │   │   ├── ClassNum.java
        │   │   ├── School.java
        │   │   ├── Student.java
        │   │   ├── Subject.java
        │   │   ├── Teacher.java
        │   │   ├── Test.java
        │   │   ├── TestListStudent.java
        │   │   └── User.java
        │   ├── dao/
        │   │   ├── ClassNumDao.java
        │   │   ├── Dao.java
        │   │   ├── SchoolDao.java
        │   │   ├── StudentDao.java
        │   │   └── TeacherDao.java
        │   ├── scoremanager/
        │   │   ├── LoginAction.java
        │   │   ├── LoginExecuteAction.java
        │   │   └── main/
        │   │       ├── LogoutAction.java
        │   │       ├── MenuAction.java
        │   │       ├── StudentCreateAction.java
        │   │       ├── StudentCreateDoneAction.java
        │   │       ├── StudentCreateExecuteAction.java
        │   │       ├── StudentListAction.java
        │   │       ├── StudentUpdateAction.java
        │   │       ├── StudentUpdateDoneAction.java
        │   │       ├── StudentUpdateExecuteAction.java
        │   │       ├── TestRegistAction.java
        │   │       ├── TestRegistDoneAction.java
        │   │       └── TestRegistExecuteAction.java
        │   └── tool/
        │       ├── Action.java
        │       ├── EncodingFilter.java
        │       └── FrontController.java
        └── webapp/
            ├── META-INF/
            │   ├── MANIFEST.MF
            │   └── context.xml
            ├── WEB-INF/
            │   ├── lib/
            │   │   ├── h2-2.1.214.jar (binary)
            │   │   ├── jakarta.servlet.jsp.jstl-3.0.1.jar (binary)
            │   │   └── jakarta.servlet.jsp.jstl-api-3.0.0.jar (binary)
            │   └── web.xml
            ├── common/
            │   ├── base.jsp
            │   ├── footer.jsp
            │   ├── header.jsp
            │   └── navigation.jsp
            ├── error.jsp
            └── scoremanager/
                ├── index.jsp
                ├── login.jsp
                └── main/
                    ├── logout.jsp
                    ├── menu.jsp
                    ├── student_create.jsp
                    ├── student_create_done.jsp
                    ├── student_list.jsp
                    ├── student_update.jsp
                    ├── student_update_done.jsp
                    ├── test_regist.jsp
                    └── test_regist_done.jsp
```

## ファイル構成

### Java Source Files

- `src/main/java/bean/ClassNum.java`
- `src/main/java/bean/School.java`
- `src/main/java/bean/Student.java`
- `src/main/java/bean/Subject.java`
- `src/main/java/bean/Teacher.java`
- `src/main/java/bean/Test.java`
- `src/main/java/bean/TestListStudent.java`
- `src/main/java/bean/User.java`
- `src/main/java/dao/ClassNumDao.java`
- `src/main/java/dao/Dao.java`
- `src/main/java/dao/SchoolDao.java`
- `src/main/java/dao/StudentDao.java`
- `src/main/java/dao/TeacherDao.java`
- `src/main/java/scoremanager/LoginAction.java`
- `src/main/java/scoremanager/LoginExecuteAction.java`
- `src/main/java/scoremanager/main/LogoutAction.java`
- `src/main/java/scoremanager/main/MenuAction.java`
- `src/main/java/scoremanager/main/StudentCreateAction.java`
- `src/main/java/scoremanager/main/StudentCreateDoneAction.java`
- `src/main/java/scoremanager/main/StudentCreateExecuteAction.java`
- `src/main/java/scoremanager/main/StudentListAction.java`
- `src/main/java/scoremanager/main/StudentUpdateAction.java`
- `src/main/java/scoremanager/main/StudentUpdateDoneAction.java`
- `src/main/java/scoremanager/main/StudentUpdateExecuteAction.java`
- `src/main/java/scoremanager/main/TestRegistAction.java`
- `src/main/java/scoremanager/main/TestRegistDoneAction.java`
- `src/main/java/scoremanager/main/TestRegistExecuteAction.java`
- `src/main/java/tool/Action.java`
- `src/main/java/tool/EncodingFilter.java`
- `src/main/java/tool/FrontController.java`

### JSP View Files

- `src/main/webapp/common/base.jsp`
- `src/main/webapp/common/footer.jsp`
- `src/main/webapp/common/header.jsp`
- `src/main/webapp/common/navigation.jsp`
- `src/main/webapp/error.jsp`
- `src/main/webapp/scoremanager/index.jsp`
- `src/main/webapp/scoremanager/login.jsp`
- `src/main/webapp/scoremanager/main/logout.jsp`
- `src/main/webapp/scoremanager/main/menu.jsp`
- `src/main/webapp/scoremanager/main/student_create.jsp`
- `src/main/webapp/scoremanager/main/student_create_done.jsp`
- `src/main/webapp/scoremanager/main/student_list.jsp`
- `src/main/webapp/scoremanager/main/student_update.jsp`
- `src/main/webapp/scoremanager/main/student_update_done.jsp`
- `src/main/webapp/scoremanager/main/test_regist.jsp`
- `src/main/webapp/scoremanager/main/test_regist_done.jsp`

### Configuration Files (XML)

- `src/main/webapp/META-INF/context.xml`
- `src/main/webapp/WEB-INF/web.xml`

### Binary Files

- `src/main/webapp/WEB-INF/lib/h2-2.1.214.jar`
- `src/main/webapp/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar`
- `src/main/webapp/WEB-INF/lib/jakarta.servlet.jsp.jstl-api-3.0.0.jar`

## ソースコード詳細

### File: `1_c697f75_PROJECT_SUMMARY.md`

```md
# Score Management System - プロジェクト内容

**生成日時**: 2026-04-27 11:02:15
**生成回数**: 1
**Commit Hash**: `c697f75`

## プロジェクト概要

このプロジェクトはJavaベースの成績管理システムです。
Spring MVC的なフロントコントローラーパターンを採用し、
Servletを使用したMVC アーキテクチャで実装されています。

## ファイル統計

- 総ファイル数: 48
- ソースファイル数: 45
- バイナリファイル数: 3

## ディレクトリ構造

```
├── .classpath
├── .gitignore
├── .project
├── generate_project_summary.py
└── src/
    └── main/
        ├── java/
        │   ├── bean/
        │   │   ├── ClassNum.java
        │   │   ├── School.java
        │   │   ├── Student.java
        │   │   ├── Teacher.java
        │   │   └── User.java
        │   ├── dao/
        │   │   ├── ClassNumDao.java
        │   │   ├── Dao.java
        │   │   ├── SchoolDao.java
        │   │   ├── StudentDao.java
        │   │   └── TeacherDao.java
        │   ├── scoremanager/
        │   │   ├── LoginAction.java
        │   │   ├── LoginExecuteAction.java
        │   │   └── main/
        │   │       ├── LogoutAction.java
        │   │       ├── MenuAction.java
        │   │       ├── StudentCreateAction.java
        │   │       ├── StudentCreateDoneAction.java
        │   │       ├── StudentCreateExecuteAction.java
        │   │       ├── StudentListAction.java
        │   │       ├── StudentUpdateAction.java
        │   │       ├── StudentUpdateDoneAction.java
        │   │       └── StudentUpdateExecuteAction.java
        │   └── tool/
        │       ├── Action.java
        │       ├── EncodingFilter.java
        │       └── FrontController.java
        └── webapp/
            ├── META-INF/
            │   ├── MANIFEST.MF
            │   └── context.xml
            ├── WEB-INF/
            │   ├── lib/
            │   │   ├── h2-2.1.214.jar (binary)
            │   │   ├── jakarta.servlet.jsp.jstl-3.0.1.jar (binary)
            │   │   └── jakarta.servlet.jsp.jstl-api-3.0.0.jar (binary)
            │   └── web.xml
            ├── common/
            │   ├── base.jsp
            │   ├── footer.jsp
            │   ├── header.jsp
            │   └── navigation.jsp
            ├── error.jsp
            └── scoremanager/
                ├── index.jsp
                ├── login.jsp
                └── main/
                    ├── logout.jsp
                    ├── menu.jsp
                    ├── student_create.jsp
                    ├── student_create_done.jsp
                    ├── student_list.jsp
                    ├── student_update.jsp
                    └── student_update_done.jsp
```

## ファイル構成

### Java Source Files

- `src/main/java/bean/ClassNum.java`
- `src/main/java/bean/School.java`
- `src/main/java/bean/Student.java`
- `src/main/java/bean/Teacher.java`
- `src/main/java/bean/User.java`
- `src/main/java/dao/ClassNumDao.java`
- `src/main/java/dao/Dao.java`
- `src/main/java/dao/SchoolDao.java`
- `src/main/java/dao/StudentDao.java`
- `src/main/java/dao/TeacherDao.java`
- `src/main/java/scoremanager/LoginAction.java`
- `src/main/java/scoremanager/LoginExecuteAction.java`
- `src/main/java/scoremanager/main/LogoutAction.java`
- `src/main/java/scoremanager/main/MenuAction.java`
- `src/main/java/scoremanager/main/StudentCreateAction.java`
- `src/main/java/scoremanager/main/StudentCreateDoneAction.java`
- `src/main/java/scoremanager/main/StudentCreateExecuteAction.java`
- `src/main/java/scoremanager/main/StudentListAction.java`
- `src/main/java/scoremanager/main/StudentUpdateAction.java`
- `src/main/java/scoremanager/main/StudentUpdateDoneAction.java`
- `src/main/java/scoremanager/main/StudentUpdateExecuteAction.java`
- `src/main/java/tool/Action.java`
- `src/main/java/tool/EncodingFilter.java`
- `src/main/java/tool/FrontController.java`

### JSP View Files

- `src/main/webapp/common/base.jsp`
- `src/main/webapp/common/footer.jsp`
- `src/main/webapp/common/header.jsp`
- `src/main/webapp/common/navigation.jsp`
- `src/main/webapp/error.jsp`
- `src/main/webapp/scoremanager/index.jsp`
- `src/main/webapp/scoremanager/login.jsp`
- `src/main/webapp/scoremanager/main/logout.jsp`
- `src/main/webapp/scoremanager/main/menu.jsp`
- `src/main/webapp/scoremanager/main/student_create.jsp`
- `src/main/webapp/scoremanager/main/student_create_done.jsp`
- `src/main/webapp/scoremanager/main/student_list.jsp`
- `src/main/webapp/scoremanager/main/student_update.jsp`
- `src/main/webapp/scoremanager/main/student_update_done.jsp`

### Configuration Files (XML)

- `src/main/webapp/META-INF/context.xml`
- `src/main/webapp/WEB-INF/web.xml`

### Binary Files

- `src/main/webapp/WEB-INF/lib/h2-2.1.214.jar`
- `src/main/webapp/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar`
- `src/main/webapp/WEB-INF/lib/jakarta.servlet.jsp.jstl-api-3.0.0.jar`

## ソースコード詳細

### File: `src/main/java/bean/ClassNum.java`

```java
package bean;

public class ClassNum implements java.io.Serializable {

    private String class_num;
    private School school;

    public String getClass_num() {
        return class_num;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

}

```

### File: `src/main/java/bean/School.java`

```java
package bean;

import java.io.Serializable;

public class School implements Serializable {

	/**
	 * 学校コード:String
	 */
	private String cd;

	/**
	 * 学校名:String
	 */
	private String name;

	/**
	 * ゲッター・セッター
	 */
	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

```

### File: `src/main/java/bean/Student.java`

```java
package bean;

public class Student implements java.io.Serializable {

    private String no;
    private String name;
    private int entYear;
    private String classNum;
    private Boolean isAttend;
    private School school;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntYear() {
        return entYear;
    }

    public void setEntYear(int entYear) {
        this.entYear = entYear;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public Boolean isAttend() {
        return isAttend;
    }

    public void setAttend(Boolean isAttend) {
        this.isAttend = isAttend;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

}

```

### File: `src/main/java/bean/Teacher.java`

```java
package bean;

import java.io.Serializable;

// Userを継承
public class Teacher extends User implements Serializable {

	/**
	 * 教員ID:String
	 */
	private String id;

	/**
	 * パスワード:String
	 */
	private String password;

	/**
	 * 教員名:String
	 */
	private String name;

	/**
	 * 所属校:School
	 */
	private School school;

	/**
	 * ゲッター・セッター
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}

```

### File: `src/main/java/bean/User.java`

```java
package bean;

// 各ユーザークラスの基底クラス
public class User {

	/**
	 * 認証済みフラグ:boolean true:認証済み
	 */
	private boolean isAuthenticated;

	/**
	 * ゲッター、セッター
	 */
	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

}

```

### File: `src/main/java/dao/ClassNumDao.java`

```java
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

```

### File: `src/main/java/dao/Dao.java`

```java
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

```

### File: `src/main/java/dao/SchoolDao.java`

```java
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.School;

public class SchoolDao extends Dao {

    /**
     * getメソッド 学校コードを指定して学校インスタンスを１件取得する
     *
     * @param cd:String
     *            学校コード
     * @return 学校クラスのインスタンス 存在しない場合はnull
     * @throws Exception
     */
    public School get(String cd) throws Exception {

        // 学校インスタンスを初期化
        School school = new School();
        // データベースへのコネクションを確立
        Connection connection = getConnection();

        // プリペアードステートメント
        PreparedStatement statement = null;

        try {
            // プリペアードステートメントにSQL文をセット
            statement = connection.prepareStatement("SELECT * FROM SCHOOL WHERE CD = ?");

            // プリペアードステートメントに学校コードをバインド
            statement.setString(1, cd);

            // プリペアードステートメントを実行
            ResultSet rSet = statement.executeQuery();

            if (rSet.next()) {
                // リザルトセットが存在する場合
                // 学校インスタンスに学校コードと学校名をセット
                school.setCd(rSet.getString("CD"));
                school.setName(rSet.getString("NAME"));
            } else {
                // 存在しない場合
                // 学校インスタンスにnullをセット
                school = null;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // プリペアードステートメントを閉じる
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
            // コネクションを閉じる
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
        }

        return school; // 結果を返す
    }

}

```

### File: `src/main/java/dao/StudentDao.java`

```java
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

```

### File: `src/main/java/dao/TeacherDao.java`

```java
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Teacher;

public class TeacherDao extends Dao {

    /**
     * getメソッド 教員IDを指定して教員インスタンスを1件取得する
     *
     * @param id:String
     *            教員ID
     * @return 教員クラスのインスタンス 存在しない場合はnull
     * @throws Exception
     */
    public Teacher get(String id) throws Exception {

        // 教員インスタンスを初期化
        Teacher teacher = new Teacher();
        // コネクションを確立
        Connection connection = getConnection();

        // プリペアードステートメント
        PreparedStatement statement = null;

        try {
            // プリペアードステートメントにSQL文をセット
            statement = connection.prepareStatement("SELECT * FROM TEACHER WHERE ID = ?");
            // プリペアードステートメントに教員IDをバインド
            statement.setString(1, id);
            // プリペアードステートメントを実行
            ResultSet resultSet = statement.executeQuery();

            // 学校Daoを初期化
            SchoolDao schoolDao = new SchoolDao();

            if (resultSet.next()) {
                // リザルトセットが存在する場合
                // 教員インスタンスに検索結果をセット
                teacher.setId(resultSet.getString("ID"));
                teacher.setPassword(resultSet.getString("PASSWORD"));
                teacher.setName(resultSet.getString("NAME"));

                // 学校フィールドには学校コードで検索した学校インスタンスをセット
                teacher.setSchool(schoolDao.get(resultSet.getString("SCHOOL_CD")));
            } else {
                // リザルトセットが存在しない場合
                // 教員インスタンスにnullをセット
                teacher = null;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // プリペアードステートメントを閉じる
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
            // コネクションを閉じる
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
        }

        return teacher;
    }

    /**
     * loginメソッド 教員IDとパスワードで認証する
     *
     * @param id:String
     *            教員ID
     * @param password:String
     *            パスワード
     * @return 認証成功:教員クラスのインスタンス, 認証失敗:null
     * @throws Exception
     */
    public Teacher login(String id, String password) throws Exception {

        // 教員クラスのインスタンスを取得
        Teacher teacher = get(id);

        // 教員がnullまたはパスワードが一致しない場合
        if (teacher == null || !teacher.getPassword().equals(password)) {
            return null;
        }

        return teacher;
    }

}

```

### File: `src/main/java/scoremanager/LoginAction.java`

```java
package scoremanager;

import bean.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        User user = (User) session.getAttribute("user"); // セッション上の認証情報を取得

        if ((user != null) && (user.isAuthenticated() == true)) { // すでにログインしていて認証が有効な場合はメニュー画面にリダイレクト (ログインの必要なし)
            res.sendRedirect("./main/Menu.action");
            return;
        }

        // パラメーターとして渡されたリダイレクト先をリクエスト属性にセット
        String redirect = req.getParameter("redirect");
        if (redirect != null) {
            req.setAttribute("redirect", redirect);
        }

        req.getRequestDispatcher("login.jsp").forward(req, res); // 未ログイン。login.jspにフォワード
    }

}

```

### File: `src/main/java/scoremanager/LoginExecuteAction.java`

```java
package scoremanager;

import java.util.ArrayList;
import java.util.List;

import bean.Teacher;
import dao.TeacherDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // ローカル変数の宣言 1
        String url = "";

        // リクエストパラメータ―の取得 2
        String id = req.getParameter("id"); // 教員ID
        String password = req.getParameter("password"); // パスワード

        //DBからデータ取得 3
        Teacher teacher = new TeacherDao().login(id, password); // 教員データ取得(ログイン)

        //ビジネスロジック 4
        //DBへデータ保存 5
        //レスポンス値をセット 6
        //フォワード 7
        //条件で手順4~7の内容が分岐
        if (teacher != null) {

            // 認証成功の場合

            // セッション更新
            HttpSession session = req.getSession(true); // セッションを取得

            teacher.setAuthenticated(true); // 認証済みフラグを立てる
            session.setAttribute("user", teacher); // セッションにログイン情報を保存

            // ログイン前のページにリダイレクト
            String redirect = req.getParameter("redirect"); // リダイレクト先を取得
            if ((redirect != null) && !redirect.isEmpty()) {
                url = redirect; // リダイレクト先が指定されていて空ではない
            } else {
                url = "main/Menu.action"; // リダイレクト先未指定 (デフォルト(メニュー))
            }

            res.sendRedirect(url); // リダイレクトして終了
            return;

        } else {

            // 認証失敗の場合
            // エラーメッセージをセット
            List<String> errors = new ArrayList<>();
            errors.add("IDまたはパスワードが確認できませんでした");
            req.setAttribute("errors", errors);

            // 入力された教員IDをセット
            req.setAttribute("id", id);

            // フォワード
            url = "login.jsp";
            req.getRequestDispatcher(url).forward(req, res); // ログイン画面にフォワード(戻)して終了
            return;

        }
    }

}

```

### File: `src/main/java/scoremanager/main/LogoutAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LogoutAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        //ローカル変数の宣言 1
        HttpSession session = req.getSession(); // セッション取得

        String url = "";

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        if (session.getAttribute("user") != null) {
            session.invalidate();
        }

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        url = "logout.jsp";
        req.getRequestDispatcher(url).forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/MenuAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class MenuAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        //ローカル変数の宣言 1
        //なし

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        //なし

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        req.getRequestDispatcher("menu.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentCreateAction.java`

```java
package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentCreateAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // ローカル変数の指定 1
        int year = LocalDate.now().getYear(); // 現在の年を取得

        // リクエストパラメーターの取得 2
        // なし

        // DBからデータ取得 3
        // ログインユーザーの学校コードをもとにクラス番号の一覧を取得
        List<String> list = new ClassNumDao().filter(teacher.getSchool());

        // ビジネスロジック 4
        // リストを初期化
        List<Integer> entYearSet = new ArrayList<>();
        // 10年前から10年後まで年をリストに追加
        for (int i = year - 10; i < (year + 11); i++) {
            entYearSet.add(i);
        }

        // レスポンス値をセット 6
        // リクエストにデータをセット
        req.setAttribute("class_num_set", list);
        req.setAttribute("ent_year_set", entYearSet);

        // JSPへフォワード 7
        req.getRequestDispatcher("student_create.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentCreateDoneAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentCreateDoneAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        //ローカル変数の宣言 1
        //なし

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        //なし

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        req.getRequestDispatcher("student_create_done.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentCreateExecuteAction.java`

```java
package scoremanager.main;

import java.util.HashMap;
import java.util.Map;

import bean.Student;
import bean.Teacher;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentCreateExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // ローカル変数の指定 1

        int ent_year = 0; // 選択された入学年度
        String student_no = ""; // 入力された学生番号
        String student_name = ""; // 入力された氏名
        String class_num = ""; // 選択されたクラス番号

        Student student = new Student();
        StudentDao studentDao = new StudentDao();
        Map<String, String> errors = new HashMap<>(); // エラーメッセージ

        // リクエストパラメーターの取得 2
        ent_year = Integer.parseInt(req.getParameter("ent_year"));
        student_no = req.getParameter("no");
        student_name = req.getParameter("name");
        class_num = req.getParameter("class_num");

        // DBからデータ取得 3
        // なし

        // ビジネスロジック 4
        if (ent_year == 0) { // 入学年度が未選択だった場合
            errors.put("1", "入学年度を選択してください");
            // リクエストにエラーメッセージをセット
            req.setAttribute("errors", errors);
        } else {
            if (studentDao.get(student_no) != null) { // 学生番号が重複している場合
                errors.put("2", "学生番号が重複しています");
                // リクエストにエラーメッセージをセット
                req.setAttribute("errors", errors);
            } else {
                // studentに学生情報をセット
                student.setNo(student_no);
                student.setName(student_name);
                student.setEntYear(ent_year);
                student.setClassNum(class_num);
                student.setAttend(true);
                student.setSchool(teacher.getSchool());
                // saveメソッドで情報を登録
                studentDao.save(student);
            }
        }

        // レスポンス値をセット 6
        // リクエストに入学年度をセット
        req.setAttribute("ent_year", ent_year);
        // リクエストに学生番号をセット
        req.setAttribute("no", student_no);
        // リクエストに氏名をセット
        req.setAttribute("name", student_name);
        // リクエストにクラス番号をセット
        req.setAttribute("class_num", class_num);

        // JSPへフォワード 7
        if (errors.isEmpty()) { // エラーメッセージがない場合
            // 完了ページにリダイレクト
            res.sendRedirect("StudentCreateDone.action");
        } else { // エラーメッセージがある場合
            // 登録画面にフォワード
            req.getRequestDispatcher("StudentCreate.action").forward(req, res);
        }
    }

}

```

### File: `src/main/java/scoremanager/main/StudentListAction.java`

```java
package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Student;
import bean.Teacher;
import dao.ClassNumDao;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentListAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // ローカル変数の指定 1
        String entYearStr = ""; // 入力された入学年度
        String classNum = ""; // 入力されたクラス番号
        String isAttendStr = ""; // 入力された在学フラグ

        int entYear = 0; // 入学年度
        boolean isAttend = false; // 在学フラグ
        List<Student> students = null; // 学生リスト

        LocalDate todayDate = LocalDate.now(); // LocalDateインスタンスを取得
        int year = todayDate.getYear(); // 現在の年を取得

        StudentDao studentDao = new StudentDao(); // 学生Dao
        ClassNumDao classNumDao = new ClassNumDao(); // クラス番号Daoを初期化

        Map<String, String> errors = new HashMap<>(); // エラーメッセージ

        // リクエストパラメーターの取得 2
        entYearStr = req.getParameter("f1"); // 入学年度
        classNum = req.getParameter("f2"); // クラス番号
        isAttendStr = req.getParameter("f3"); // 在学フラグ

        // ビジネスロジック 4
        if (entYearStr != null) {
            // 数値に変換
            entYear = Integer.parseInt(entYearStr);
        }
        if (isAttendStr != null) { // 在学フラグがnullじゃなかった場合
            // 在学フラグをtrueに変更
            isAttend = true;
        }
        // リストを初期化
        List<Integer> entYearSet = new ArrayList<>();
        // 10年前から1年後まで年をリストに追加
        for (int i = year - 10; i < (year + 1); i++) {
            entYearSet.add(i);
        }

        // DBからデータ取得 3
        // ログインユーザーの学校コードをもとにクラス番号の一覧を取得
        List<String> list = classNumDao.filter(teacher.getSchool());

        if (entYear != 0 && !classNum.equals("0")) {
            // 入学年度とクラス番号を指定
            students = studentDao.filter(teacher.getSchool(), entYear, classNum, isAttend);
        } else if (entYear != 0 && classNum.equals("0")) {
            // 入学年度のみ指定
            students = studentDao.filter(teacher.getSchool(), entYear, isAttend);
        } else if (entYear == 0 && classNum == null || entYear == 0 && classNum.equals("0")) {
            // 指定なし
            // 全学生情報を取得
            students = studentDao.filter(teacher.getSchool(), isAttend);
        } else {
            errors.put("f1", "クラスを指定する場合は入学年度も指定してください");
            // リクエストにエラーメッセージをセット
            req.setAttribute("errors", errors);
            // 全学生情報を取得
            students = studentDao.filter(teacher.getSchool(), isAttend);
        }

        // レスポンス値をセット 6

        // リクエストに入学年度をセット
        req.setAttribute("f1", entYear);
        // リクエストにクラス番号をセット
        req.setAttribute("f2", classNum);
        // 在学フラグが送信されていた場合
        if (isAttendStr != null) {
            // 在学フラグを立てる
            isAttend = true;
            // リクエストに在学フラグをセット
            req.setAttribute("f3", isAttendStr);
        }

        // リクエストに学生リストをセット
        req.setAttribute("students", students);

        // リクエストに関連データをセット
        req.setAttribute("class_num_set", list);
        req.setAttribute("ent_year_set", entYearSet);

        // JSPへフォワード 7
        req.getRequestDispatcher("student_list.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentUpdateAction.java`

```java
package scoremanager.main;

import bean.Student;
import bean.Teacher;
import dao.ClassNumDao;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentUpdateAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーター取得
        String student_no = req.getParameter("no"); // 変更対象となる学生の番号を取得

        Student student = new StudentDao().get(student_no); // 学生を番号から検索

        if (student == null) { // 学生が見つからなかった場合
            res.sendRedirect("StudentList.Action"); // 学生リストにリダイレクトして終了
            return;
        }

        // student_update.jspに情報を渡すためにリクエスト属性として値をセット
        req.setAttribute("ent_year", student.getEntYear());
        req.setAttribute("no", student.getNo());
        req.setAttribute("name", student.getName());
        req.setAttribute("class_num", student.getClassNum());
        req.setAttribute("class_num_set", new ClassNumDao().filter(teacher.getSchool()));
        req.setAttribute("is_attend", student.isAttend());

        // JSPへフォワード
        req.getRequestDispatcher("student_update.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentUpdateDoneAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentUpdateDoneAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        //ローカル変数の宣言 1
        //なし

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        //なし

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        req.getRequestDispatcher("student_update_done.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentUpdateExecuteAction.java`

```java
package scoremanager.main;

import bean.Student;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentUpdateExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // パラメーター取得
        String no = req.getParameter("no");

        StudentDao studentDao = new StudentDao();

        // すでにあるStudentを取得
        Student student = studentDao.get(no);

        if (student == null) {
            // 学生が見つからなかった
            res.sendRedirect(req.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        // パラメーターの内容に更新
        student.setName(req.getParameter("name"));
        student.setClassNum(req.getParameter("class_num"));
        student.setAttend(req.getParameter("is_attend") != null);

        // 保存
        studentDao.save(student);

        // 完了ページにリダイレクト
        res.sendRedirect("StudentUpdateDone.action");
    }

}

```

### File: `src/main/java/tool/Action.java`

```java
package tool;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 継承用Actionクラス
public abstract class Action {

    public abstract void execute(
            HttpServletRequest req, HttpServletResponse res) throws Exception;

}

```

### File: `src/main/java/tool/EncodingFilter.java`

```java
package tool;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/*" })
public class EncodingFilter implements Filter {

    /**
     * doFilterメソッド フィルター処理を記述
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // 文字コードをセット
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // System.out.println("フィルタの前処理");
        chain.doFilter(request, response);
        // System.out.println("フィルタの後処理");
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }

}

```

### File: `src/main/java/tool/FrontController.java`

```java
package tool;

import java.io.IOException;

import bean.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "*.action" })
public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {

            // パスを取得
            String path = req.getServletPath().substring(1);

            // ファイル名を取得してクラス名に変換
            String name = path.replace(".a", "A").replace('/', '.');

            // START: ログイン状態チェック

            // 対象階層かどうか (scoremanager.main.* and (not scoremanager.main.LogoutAction))
            boolean needLogin = name.startsWith("scoremanager.main.") && !name.equals("scoremanager.main.LogoutAction"); // true: 対象, false: 対象外(通過)

            if (needLogin == true) { // チェック対象

                // ユーザー取得
                HttpSession session = req.getSession(false);
                User user = (session != null) ? (User) session.getAttribute("user") : null; // セッションがあればセッションからユーザーを取得

                // 認証状態チェック
                if ((user == null) || (user.isAuthenticated() == false)) {
                    // 未ログインまたは認証無効 → リダイレクト先をセットしたログイン画面にリダイレクトして終了
                    String redirectUrl = req.getRequestURI();
                    if (req.getQueryString() != null) {
                        redirectUrl += "?" + req.getQueryString(); // urlに付随していたパラメーターをセット
                    }
                    res.sendRedirect(req.getContextPath() + "/scoremanager/Login.action?redirect="
                            + java.net.URLEncoder.encode(redirectUrl, "UTF-8"));
                    return;
                }
            }

            // END: ログイン状態チェック

            // ログイン状態チェック通過

            // アクションクラスのインスタンスを返却
            Action action = (Action) Class.forName(name).getDeclaredConstructor().newInstance();

            // 遷移先URLを取得
            action.execute(req, res);

        } catch (Exception e) {
            e.printStackTrace();
            // エラーページへフォワード
            res.sendRedirect(req.getContextPath() + "/error.jsp"); // エラーページにリダイレクト
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }

}

```

### File: `src/main/webapp/META-INF/context.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration>
<!-- 上記はEclipseの警告を消すための記述です。 -->

<Context reloadable="true">
	<!-- db(h2)接続情報 -->
	<Resource
		name="jdbc/exam"
		auth="Container"
		type="javax.sql.DataSource"
		driverClassName="org.h2.Driver"
		url="jdbc:h2:tcp://localhost/~/exam"
		username="sa"
		password=""
	/>
</Context>

```

### File: `src/main/webapp/WEB-INF/web.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="https://jakarta.ee/xml/ns/jakartaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee
                        https://jakarta.ee/xml/ns/jakartaee/web-app_6_0.xsd"
    version="6.0">

    <!-- /scoremanager/index.jsp をトップページとして設定 -->
    <welcome-file-list>
        <welcome-file>/scoremanager/index.jsp</welcome-file>
    </welcome-file-list>

</web-app>

```

### File: `src/main/webapp/common/base.jsp`

```
<%-- 共通テンプレート --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Bootstrap CSS -->
		<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
		crossorigin="anonymous">
		<title><c:out value="${param.title}" /></title>
		<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		${param.scripts}
	</head>
	<body>
		<div id="wrapper" class="container">
			<header
			class="d-flex flex-wrap justify-content-center py-3 px-5 mb-4 border-bottom border-2 bg-primary bg-opacity-10 bg-gradient">
			<c:import url="/common/header.jsp" />
		</header>

		<div class="row justify-content-center">
			<c:choose>
				<%-- ログイン済みの場合 --%>
				<c:when test="${user.isAuthenticated()}">
					<nav class="col-3" style="height:40rem;">
						<c:import url="/common/navigation.jsp" />
					</nav>
					<main class="col-9 border-start"> ${param.content} </main>
				</c:when>
				<%-- 未ログインの場合 --%>
				<c:otherwise>
					<main class="col-8"> ${param.content} </main>
				</c:otherwise>
			</c:choose>
		</div>
		<footer class="py-2 my-4 bg-dark bg-opacity-10 border-top border-3 align-bottom">
			<c:import url="/common/footer.jsp" />
		</footer>

	</div>
</body>
</html>

```

### File: `src/main/webapp/common/footer.jsp`

```
<%-- フッター --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<p class="text-center text-muted mb-0">&copy; 2023 TIC</p>
<p class="text-center text-muted mb-0">大原学園</p>

```

### File: `src/main/webapp/common/header.jsp`

```
<%-- ヘッダー --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<div class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
	<h1 class="fs-1">得点管理システム</h1>
</div>
<c:if test="${user.isAuthenticated()}">
	<div class="nav align-self-end">
		<span class="nav-item px-2"><c:out value="${user.getName()}" />様</span>
		<a class="nav-item px-2" href="Logout.action">ログアウト</a>
	</div>
</c:if>

```

### File: `src/main/webapp/common/navigation.jsp`

```
<%-- サイドバー --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<ul class="nav nav-pills flex-column mb-auto px-4">
	<li class="nav-item my-3"><a href="Menu.action">メニュー</a></li>
	<li class="nav-item mb-3"><a href="StudentList.action">学生管理</a></li>
	<li class="nav-item">成績管理</li>
	<li class="nav-item mx-3 mb-3"><a href="TestRegist.action">成績登録</a></li>
	<li class="nav-item mx-3 mb-3"><a href="TestList.action">成績参照</a></li>
	<li class="nav-item mb-3"><a href="SubjectList.action">科目管理</a></li>
	<li class="nav-item mb-3"><a href="ClassList.action">クラス管理</a></li>
</ul>

```

### File: `src/main/webapp/error.jsp`

```
<%-- エラーページ --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="ctx_path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Bootstrap CSS -->
		<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
		crossorigin="anonymous">
		<title>エラーページ</title>
		<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		${param.scripts}
	</head>
	<body>
		<div id="wrapper" class="container">
			<header
			class="d-flex flex-wrap justify-content-center py-3 px-5 mb-4 border-bottom border-2 bg-primary bg-opacity-10 bg-gradient">
			<div class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
				<h1 class="fs-1">得点管理システム</h1>
			</div>
			<c:if test="${user.isAuthenticated()}">
				<div class="nav align-self-end">
					<span class="nav-item px-2"><c:out value="${user.getName()}" />様</span>
					<a class="nav-item px-2" href="${ctx_path}/scoremanager/main/Logout.action">ログアウト</a>
				</div>
			</c:if>
		</header>

		<div class="row justify-content-center">
			<c:choose>
				<%-- ログイン済みの場合 --%>
				<c:when test="${user.isAuthenticated()}">
					<nav class="col-3">

						<ul class="nav nav-pills flex-column mb-auto px-4">
							<li class="nav-item my-3"><a href="${ctx_path}/scoremanager/main/Menu.action">メニュー</a></li>
							<li class="nav-item mb-3"><a href="${ctx_path}/scoremanager/main/StudentList.action">学生管理</a></li>
							<li class="nav-item">成績管理</li>
							<li class="nav-item mx-3 mb-3"><a href="${ctx_path}/scoremanager/main/TestRegist.action">成績登録</a></li>
							<li class="nav-item mx-3 mb-3"><a href="${ctx_path}/scoremanager/main/TestList.action">成績参照</a></li>
							<li class="nav-item mb-3"><a href="${ctx_path}/scoremanager/main/SubjectList.action">科目管理</a></li>
							<li class="nav-item mb-3"><a href="${ctx_path}/scoremanager/main/ClassList.action">クラス管理</a></li>
						</ul>

					</nav>
					<main class="col-9 border-start">
						<section>
							<p>エラーが発生しました</p>
						</section>
					</main>
				</c:when>
				<%-- 未ログインの場合 --%>
				<c:otherwise>
					<main class="col-8">
						<section>
							<p>エラーが発生しました</p>
						</section>
					</main>
				</c:otherwise>
			</c:choose>
		</div>
		<footer	class="py-2 my-4 bg-dark bg-opacity-10 border-top border-3 align-bottom">
			<p class="text-center text-muted mb-0">&copy; 2023 TIC </p>
			<p class="text-center text-muted mb-0">大原学園</p>
		</footer>

	</div>
</body>
</html>

```

### File: `src/main/webapp/scoremanager/index.jsp`

```
<%-- indexリダイレクトページ --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="ctx_path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script>
            // ログインページにリダイレクト
            location.href="${ctx_path}/scoremanager/Login.action";
        </script>
    </head>
    <body>

    </body>
</html>
```

### File: `src/main/webapp/scoremanager/login.jsp`

```
<%-- ログインJSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts">
		<script type="text/javascript">
			$(function() {
				// 「パスワードを表示」が変更された時の処理
				$('#password-display').change(function() {
					if ($(this).prop('checked')) {
						// チェックが入っている場合
						// パスワード入力欄をテキストにする
						$('#password-input').attr('type', 'text');
					} else {
						// チェックが外れている場合
						// パスワード入力欄をパスワードにする
						$('#password-input').attr('type', 'password');
					}
				});
			});
		</script>
	</c:param>

	<c:param name="content">
		<section class="w-75 text-center m-auto border pb-3">
			<form action = "LoginExecute.action" method="post">
				<div id="wrap_box">
					<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">ログイン</h2>
					<c:if test="${errors.size() > 0}">
						<div>
							<ul>
								<c:forEach var="error" items="${errors}">
									<li><c:out value="${error}" /></li>
								</c:forEach>
							</ul>
						</div>
					</c:if>
					<div>
						<!-- ＩＤ -->
						<div class="form-floating mx-5">
							<input class="form-control px-5 fs-5" autocomplete="off"
							id="id-input" maxlength="20" name="id" placeholder="半角でご入力下さい"
							style="ime-mode: disabled" type="text" value="${id}" required />
							<label>ＩＤ</label>
						</div>
						<!-- パスワード -->
						<div class="form-floating mx-5 mt-3">
							<input class="form-control px-5 fs-5" autocomplete="off"
							id="password-input" maxlength="20" name="password"
							placeholder="20文字以内の半角英数字でご入力下さい" style="ime-mode: disabled"
							type="password" required />
							<label>パスワード</label>
						</div>
						<div class="form-check mt-3">
							<label class="form-check-label" for="password-display">
								<input class="form-check-input" id="password-display" name="chk_d_ps" type="checkbox" />
								パスワードを表示
							</label>
						</div>
						<%-- リダイレクト先の埋め込み --%>
						<c:if test="${redirect != null}">
							<input type="hidden" name="redirect" value="${redirect}" />
						</c:if>
					</div>

					<div class="mt-4">
						<input class="w-25 btn btn-lg btn-primary" type="submit" name="login" value="ログイン"/>
					</div>
				</div>
			</form>
		</section>
	</c:param>
</c:import>

```

### File: `src/main/webapp/scoremanager/main/logout.jsp`

```
<%-- ログアウトJSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">
		<div id="wrap_box">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">ログアウト</h2>
			<div id="wrap_box">
				<p class="text-center" style="background-color:#66CC99">ログアウトしました</p>
				<a href="../Login.action">ログイン</a>
			</div>
		</div>
	</c:param>
</c:import>
```

### File: `src/main/webapp/scoremanager/main/menu.jsp`

```
<%-- メニューJSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section class="me-4">
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">メニュー</h2>
				<div class="row text-center px-4 fs-3 my-5">
					<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
					style="height: 10rem; background-color: #dbb;">
					<a href="StudentList.action">学生管理</a>
				</div>
				<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
				style="height: 10rem; background-color: #bdb;">
				<div>
					<div class="">成績管理</div>
					<div class="">
						<a href="TestRegist.action">成績登録</a>
					</div>
					<div class="">
						<a href="TestList.action">成績参照</a>
					</div>
				</div>
			</div>
			<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
			style="height: 10rem; background-color: #bbd;">
			<a href="SubjectList.action">科目管理</a>
		</div>
		<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
		style="height: 10rem; background-color: #ddb;">
		<a href="ClassList.action">クラス管理</a>
	</div>
</div>
</section>
</c:param>
</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_create.jsp`

```
<%-- 学生登録JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:import url="/common/base.jsp" >
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section>
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">学生情報登録</h2>
				<form action="StudentCreateExecute.action" method="get">
					<div>
						<label for="ent_year">入学年度</label>
						<select class="form-select" id="ent_year" name="ent_year">
							<option value="0">--------</option>
							<c:forEach var="year" items="${ent_year_set}">
								<%-- 現在のyearと選択されていたent_yearが一致していた場合selectedを追記 --%>
								<option value="${year}" <c:if test="${year == ent_year}">selected</c:if>>${year}</option>
							</c:forEach>
						</select>
					</div>
					<div class="mt-2 text-warning"><c:out value="${errors.get('1')}" /></div>
					<div>
						<label for="no">学生番号</label><br>
						<input class="form-control" type="text" id="no" name="no" value="<c:out value='${no}' />" required maxlength="10" placeholder="学生番号を入力してください" />
					</div>
					<div class="mt-2 text-warning"><c:out value="${errors.get('2')}" /></div>
					<div>
						<label for="name">氏名</label><br>
						<input class="form-control" type="text" id="name" name="name" value="<c:out value='${name}' />" required maxlength="30" placeholder="氏名を入力してください" />
					</div>
					<div class="mx-auto py-2">
						<label for="class_num">クラス</label>
						<select class="form-select" id="class_num" name="class_num">
							<c:forEach var="num" items="${class_num_set}">
								<%-- 現在のnumと選択されていたclass_numが一致していた場合selectedを追記 --%>
								<option value="<c:out value='${num}' />" <c:if test="${num == class_num}">selected</c:if>><c:out value='${num}' /></option>
							</c:forEach>
						</select>
					</div>
					<div class="mx-auto py-2">
						<button class="btn btn-secondary" id="create-button" name="end">登録して終了</button>
					</div>
				</form>
				<a href="StudentList.action">戻る</a>
			</section>
		</c:param>
	</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_create_done.jsp`

```
<%-- 学生登録完了JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">
		<div id="wrap_box">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">学生情報登録</h2>
			<div id="wrap_box">
				<p class="text-center" style="background-color:#8cc3a9">登録が完了しました</p>

				<br>
				<br>
				<br>
				<a href="StudentCreate.action">戻る</a>
				<a>　　　　　</a>
				<a href="StudentList.action">学生一覧</a>
			</div>
		</div>
	</c:param>
</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_list.jsp`

```
<%-- 学生一覧JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:import url="/common/base.jsp" >
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section class="me=4">
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">学生管理</h2>
				<div class="my-2 text-end px-4">
					<a href="StudentCreate.action">新規登録</a>
				</div>
				<form method="get">
					<div class="row border mx-3 mb-3 py-2 align-items-center rounded" id="filter">
						<div class="col-4">
							<label class="form-label" for="student-f1-select">入学年度</label>
							<select class="form-select" id="student-f1-select" name="f1">
								<option value="0">--------</option>
								<c:forEach var="year" items="${ent_year_set}">
									<%-- 現在のyearと選択されていたf1が一致していた場合selectedを追記 --%>
									<option value="${year}" <c:if test="${year == f1}">selected</c:if>>${year}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-4">
							<label class="form-label" for="student-f2-select">クラス</label>
							<select class="form-select" id="student-f2-select" name="f2">
								<option value="0">--------</option>
								<c:forEach var="num" items="${class_num_set}">
									<%-- 現在のnumと選択されていたf2が一致していた場合selectedを追記 --%>
									<option value="<c:out value='${num}' />" <c:if test="${num == f2}">selected</c:if>><c:out value='${num}' /></option>
								</c:forEach>
							</select>
						</div>
						<div class="col-2 form-check text-center">
							<label class="form-check-label" for="student-f3-check">在学中
								<%-- パラメーターf3が存在している場合checkedを追記 --%>
								<input class="form-check-input" type="checkbox"
								id="student-f3-check" name="f3" value="t"
								<c:if test="${!empty f3}">checked</c:if> />
							</label>
						</div>
						<div class="col-2 text-center">
							<button class="btn btn-secondary" id="filter-button">絞込み</button>
						</div>
						<div class="mt-2 text-warning"><c:out value="${errors.get('f1')}" /></div>
					</div>
				</form>


				<c:choose>
					<c:when test="${students.size() > 0}">
						<div>検索結果：${students.size()}件</div>
						<table class="table table-hover">
							<tr>
								<th>入学年度</th>
								<th>学生番号</th>
								<th>氏名</th>
								<th>クラス</th>
								<th class="text-center">在学中</th>
								<th></th>
								<th></th>
							</tr>
							<c:forEach var="student" items="${students}">
								<tr>
									<td>${student.entYear}</td>
									<td><c:out value="${student.no}" /></td>
									<td><c:out value="${student.name}" /></td>
									<td><c:out value="${student.classNum}" /></td>
									<td class="text-center">
										<%-- 在学フラグがたっている場合「◯」それは以外は「×」を表示 --%>
										<c:choose>
											<c:when test="${student.isAttend()}">
												◯
											</c:when>
											<c:otherwise>
												×
											</c:otherwise>
										</c:choose>
									</td>
									<td><a href="<c:url value='StudentUpdate.action'><c:param name='no' value='${student.no}'/></c:url>">変更</a></td>
								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						<div>学生情報が存在しませんでした。</div>
					</c:otherwise>
				</c:choose>
			</section>
		</c:param>
	</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_update.jsp`

```
<%-- 学生情報変更JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp" >
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section>
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">学生情報変更</h2>
				<form action="StudentUpdateExecute.action" method="get">
					<div>
						<label class="mx-auto py-2" for="ent_year">入学年度</label><br>
						<input class="border border-0 ps-3" type="text" id="ent_year" name="ent_year" value="${ent_year}" readonly />
					</div>
					<div class="mx-auto py-2">
						<label class="mx-auto py-2" for="no">学生番号</label><br>
						<input class="border border-0 ps-3" type="text" id="no" value="<c:out value='${no}' />" name="no" readonly />
					</div>
					<div class="mx-auto py-2">
						<label for="name">氏名</label><br>
						<input class="form-control" type="text" id="name" name="name" value="<c:out value='${name}' />" required maxlength="30" />
					</div>
					<div class="mx-auto py-2">
						<label for="class_num">クラス</label><br>
						<select class="form-select" id="class_num" name="class_num">
							<c:forEach var="num" items="${class_num_set}">
								<option value="<c:out value='${num}' />" <c:if test="${num == class_num}">selected</c:if>><c:out value='${num}' /></option>
							</c:forEach>
						</select>
					</div>
					<div class="mx-auto py-2">
						<label for="is_attend">在学中</label>
						<input type="checkbox" id="is_attend" name="is_attend" <c:if test="${is_attend}">checked</c:if> />
					</div>
					<div class="mx-auto py-2">
						<input class="btn btn-primary" type="submit" name="login" value="変更"/>
					</div>
				</form>
				<a href="StudentList.action">戻る</a>
			</section>
		</c:param>
	</c:import>

```

### File: `src/main/webapp/scoremanager/main/student_update_done.jsp`

```
<%-- 学生変更完了JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">
		<div id="wrap_box">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">学生情報変更</h2>
			<div id="wrap_box">
				<p class="text-center" style="background-color:#8cc3a9">変更が完了しました</p>
				<br>
				<br>
				<br>
				<a href="StudentList.action">学生一覧</a>
			</div>
		</div>
	</c:param>
</c:import>

```

```

### File: `src/main/java/bean/ClassNum.java`

```java
package bean;

public class ClassNum implements java.io.Serializable {

    private String class_num;
    private School school;

    public String getClass_num() {
        return class_num;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

}

```

### File: `src/main/java/bean/School.java`

```java
package bean;

import java.io.Serializable;

public class School implements Serializable {

	/**
	 * 学校コード:String
	 */
	private String cd;

	/**
	 * 学校名:String
	 */
	private String name;

	/**
	 * ゲッター・セッター
	 */
	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

```

### File: `src/main/java/bean/Student.java`

```java
package bean;

public class Student implements java.io.Serializable {

    private String no;
    private String name;
    private int entYear;
    private String classNum;
    private Boolean isAttend;
    private School school;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntYear() {
        return entYear;
    }

    public void setEntYear(int entYear) {
        this.entYear = entYear;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public Boolean isAttend() {
        return isAttend;
    }

    public void setAttend(Boolean isAttend) {
        this.isAttend = isAttend;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

}

```

### File: `src/main/java/bean/Subject.java`

```java
package bean;

import java.io.Serializable;

public class Subject implements Serializable {

	private String cd;
	 
	private String name; 
	
	private School school;
	
	/**
	 * ゲッター・セッター
	 */

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}

```

### File: `src/main/java/bean/Teacher.java`

```java
package bean;

import java.io.Serializable;

// Userを継承
public class Teacher extends User implements Serializable {

	/**
	 * 教員ID:String
	 */
	private String id;

	/**
	 * パスワード:String
	 */
	private String password;

	/**
	 * 教員名:String
	 */
	private String name;

	/**
	 * 所属校:School
	 */
	private School school;

	/**
	 * ゲッター・セッター
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}

```

### File: `src/main/java/bean/Test.java`

```java
package bean;

import java.io.Serializable;

public class Test implements Serializable {
	
	private Student student;
	private String classNum;
	private Subject subject;
	private School school;
	private int no;
	private int point;
	
	 public Student getStudent() {
	     return student;
	 }

	 public void setStudent(Student student) {
	     this.student = student;
	 }
	  
	 public String gerClassNum() {
		 return classNum;
	 }
	 
	 public void setClassNum(String classNum) {
		 this.classNum = classNum;
	 }
	 
	 public Subject getsubject() {
		 return subject;
	 }
	 
	 public void setSubject(Subject subject) {
		 this.subject = subject;
	 }
	 
	 public School getschool() {
		 return school;
	 }
	 
	 public void setSchool(School school) {
		 this.school = school;
	 }
	 
	 public int getNo() {
		 return no;
	 }
	 
	 public void setNO(int no) {
		 this.no = no;
	 }
	 
	 public int getPoint() {
		 return point;
	 }
	 
	 public void setPoint(int point) {
		this.point = point; 
	 }

}

```

### File: `src/main/java/bean/TestListStudent.java`

```java
package bean;

import java.io.Serializable;

public class TestListStudent implements Serializable {

    // 科目名
    private String subjectName;

    // 科目コード
    private String subjectCd;

    // 回数
    private int num;

    // 点数
    private int point;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCd() {
        return subjectCd;
    }

    public void setSubjectCd(String subjectCd) {
        this.subjectCd = subjectCd;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}

```

### File: `src/main/java/bean/User.java`

```java
package bean;

// 各ユーザークラスの基底クラス
public class User {

	/**
	 * 認証済みフラグ:boolean true:認証済み
	 */
	private boolean isAuthenticated;

	/**
	 * ゲッター、セッター
	 */
	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

}

```

### File: `src/main/java/dao/ClassNumDao.java`

```java
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

```

### File: `src/main/java/dao/Dao.java`

```java
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

```

### File: `src/main/java/dao/SchoolDao.java`

```java
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.School;

public class SchoolDao extends Dao {

    /**
     * getメソッド 学校コードを指定して学校インスタンスを１件取得する
     *
     * @param cd:String
     *            学校コード
     * @return 学校クラスのインスタンス 存在しない場合はnull
     * @throws Exception
     */
    public School get(String cd) throws Exception {

        // 学校インスタンスを初期化
        School school = new School();
        // データベースへのコネクションを確立
        Connection connection = getConnection();

        // プリペアードステートメント
        PreparedStatement statement = null;

        try {
            // プリペアードステートメントにSQL文をセット
            statement = connection.prepareStatement("SELECT * FROM SCHOOL WHERE CD = ?");

            // プリペアードステートメントに学校コードをバインド
            statement.setString(1, cd);

            // プリペアードステートメントを実行
            ResultSet rSet = statement.executeQuery();

            if (rSet.next()) {
                // リザルトセットが存在する場合
                // 学校インスタンスに学校コードと学校名をセット
                school.setCd(rSet.getString("CD"));
                school.setName(rSet.getString("NAME"));
            } else {
                // 存在しない場合
                // 学校インスタンスにnullをセット
                school = null;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // プリペアードステートメントを閉じる
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
            // コネクションを閉じる
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
        }

        return school; // 結果を返す
    }

}

```

### File: `src/main/java/dao/StudentDao.java`

```java
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

```

### File: `src/main/java/dao/TeacherDao.java`

```java
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Teacher;

public class TeacherDao extends Dao {

    /**
     * getメソッド 教員IDを指定して教員インスタンスを1件取得する
     *
     * @param id:String
     *            教員ID
     * @return 教員クラスのインスタンス 存在しない場合はnull
     * @throws Exception
     */
    public Teacher get(String id) throws Exception {

        // 教員インスタンスを初期化
        Teacher teacher = new Teacher();
        // コネクションを確立
        Connection connection = getConnection();

        // プリペアードステートメント
        PreparedStatement statement = null;

        try {
            // プリペアードステートメントにSQL文をセット
            statement = connection.prepareStatement("SELECT * FROM TEACHER WHERE ID = ?");
            // プリペアードステートメントに教員IDをバインド
            statement.setString(1, id);
            // プリペアードステートメントを実行
            ResultSet resultSet = statement.executeQuery();

            // 学校Daoを初期化
            SchoolDao schoolDao = new SchoolDao();

            if (resultSet.next()) {
                // リザルトセットが存在する場合
                // 教員インスタンスに検索結果をセット
                teacher.setId(resultSet.getString("ID"));
                teacher.setPassword(resultSet.getString("PASSWORD"));
                teacher.setName(resultSet.getString("NAME"));

                // 学校フィールドには学校コードで検索した学校インスタンスをセット
                teacher.setSchool(schoolDao.get(resultSet.getString("SCHOOL_CD")));
            } else {
                // リザルトセットが存在しない場合
                // 教員インスタンスにnullをセット
                teacher = null;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // プリペアードステートメントを閉じる
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
            // コネクションを閉じる
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) {
                    throw sqle;
                }
            }
        }

        return teacher;
    }

    /**
     * loginメソッド 教員IDとパスワードで認証する
     *
     * @param id:String
     *            教員ID
     * @param password:String
     *            パスワード
     * @return 認証成功:教員クラスのインスタンス, 認証失敗:null
     * @throws Exception
     */
    public Teacher login(String id, String password) throws Exception {

        // 教員クラスのインスタンスを取得
        Teacher teacher = get(id);

        // 教員がnullまたはパスワードが一致しない場合
        if (teacher == null || !teacher.getPassword().equals(password)) {
            return null;
        }

        return teacher;
    }

}

```

### File: `src/main/java/scoremanager/LoginAction.java`

```java
package scoremanager;

import bean.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        User user = (User) session.getAttribute("user"); // セッション上の認証情報を取得

        if ((user != null) && (user.isAuthenticated() == true)) { // すでにログインしていて認証が有効な場合はメニュー画面にリダイレクト (ログインの必要なし)
            res.sendRedirect("./main/Menu.action");
            return;
        }

        // パラメーターとして渡されたリダイレクト先をリクエスト属性にセット
        String redirect = req.getParameter("redirect");
        if (redirect != null) {
            req.setAttribute("redirect", redirect);
        }

        req.getRequestDispatcher("login.jsp").forward(req, res); // 未ログイン。login.jspにフォワード
    }

}

```

### File: `src/main/java/scoremanager/LoginExecuteAction.java`

```java
package scoremanager;

import java.util.ArrayList;
import java.util.List;

import bean.Teacher;
import dao.TeacherDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // ローカル変数の宣言 1
        String url = "";

        // リクエストパラメータ―の取得 2
        String id = req.getParameter("id"); // 教員ID
        String password = req.getParameter("password"); // パスワード

        //DBからデータ取得 3
        Teacher teacher = new TeacherDao().login(id, password); // 教員データ取得(ログイン)

        //ビジネスロジック 4
        //DBへデータ保存 5
        //レスポンス値をセット 6
        //フォワード 7
        //条件で手順4~7の内容が分岐
        if (teacher != null) {

            // 認証成功の場合

            // セッション更新
            HttpSession session = req.getSession(true); // セッションを取得

            teacher.setAuthenticated(true); // 認証済みフラグを立てる
            session.setAttribute("user", teacher); // セッションにログイン情報を保存

            // ログイン前のページにリダイレクト
            String redirect = req.getParameter("redirect"); // リダイレクト先を取得
            if ((redirect != null) && !redirect.isEmpty()) {
                url = redirect; // リダイレクト先が指定されていて空ではない
            } else {
                url = "main/Menu.action"; // リダイレクト先未指定 (デフォルト(メニュー))
            }

            res.sendRedirect(url); // リダイレクトして終了
            return;

        } else {

            // 認証失敗の場合
            // エラーメッセージをセット
            List<String> errors = new ArrayList<>();
            errors.add("IDまたはパスワードが確認できませんでした");
            req.setAttribute("errors", errors);

            // 入力された教員IDをセット
            req.setAttribute("id", id);

            // フォワード
            url = "login.jsp";
            req.getRequestDispatcher(url).forward(req, res); // ログイン画面にフォワード(戻)して終了
            return;

        }
    }

}

```

### File: `src/main/java/scoremanager/main/LogoutAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LogoutAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        //ローカル変数の宣言 1
        HttpSession session = req.getSession(); // セッション取得

        String url = "";

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        if (session.getAttribute("user") != null) {
            session.invalidate();
        }

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        url = "logout.jsp";
        req.getRequestDispatcher(url).forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/MenuAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class MenuAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        //ローカル変数の宣言 1
        //なし

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        //なし

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        req.getRequestDispatcher("menu.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentCreateAction.java`

```java
package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentCreateAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // ローカル変数の指定 1
        int year = LocalDate.now().getYear(); // 現在の年を取得

        // リクエストパラメーターの取得 2
        // なし

        // DBからデータ取得 3
        // ログインユーザーの学校コードをもとにクラス番号の一覧を取得
        List<String> list = new ClassNumDao().filter(teacher.getSchool());

        // ビジネスロジック 4
        // リストを初期化
        List<Integer> entYearSet = new ArrayList<>();
        // 10年前から10年後まで年をリストに追加
        for (int i = year - 10; i < (year + 11); i++) {
            entYearSet.add(i);
        }

        // レスポンス値をセット 6
        // リクエストにデータをセット
        req.setAttribute("class_num_set", list);
        req.setAttribute("ent_year_set", entYearSet);

        // JSPへフォワード 7
        req.getRequestDispatcher("student_create.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentCreateDoneAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentCreateDoneAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        //ローカル変数の宣言 1
        //なし

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        //なし

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        req.getRequestDispatcher("student_create_done.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentCreateExecuteAction.java`

```java
package scoremanager.main;

import java.util.HashMap;
import java.util.Map;

import bean.Student;
import bean.Teacher;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentCreateExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // ローカル変数の指定 1

        int ent_year = 0; // 選択された入学年度
        String student_no = ""; // 入力された学生番号
        String student_name = ""; // 入力された氏名
        String class_num = ""; // 選択されたクラス番号

        Student student = new Student();
        StudentDao studentDao = new StudentDao();
        Map<String, String> errors = new HashMap<>(); // エラーメッセージ

        // リクエストパラメーターの取得 2
        ent_year = Integer.parseInt(req.getParameter("ent_year"));
        student_no = req.getParameter("no");
        student_name = req.getParameter("name");
        class_num = req.getParameter("class_num");

        // DBからデータ取得 3
        // なし

        // ビジネスロジック 4
        if (ent_year == 0) { // 入学年度が未選択だった場合
            errors.put("1", "入学年度を選択してください");
            // リクエストにエラーメッセージをセット
            req.setAttribute("errors", errors);
        } else {
            if (studentDao.get(student_no) != null) { // 学生番号が重複している場合
                errors.put("2", "学生番号が重複しています");
                // リクエストにエラーメッセージをセット
                req.setAttribute("errors", errors);
            } else {
                // studentに学生情報をセット
                student.setNo(student_no);
                student.setName(student_name);
                student.setEntYear(ent_year);
                student.setClassNum(class_num);
                student.setAttend(true);
                student.setSchool(teacher.getSchool());
                // saveメソッドで情報を登録
                studentDao.save(student);
            }
        }

        // レスポンス値をセット 6
        // リクエストに入学年度をセット
        req.setAttribute("ent_year", ent_year);
        // リクエストに学生番号をセット
        req.setAttribute("no", student_no);
        // リクエストに氏名をセット
        req.setAttribute("name", student_name);
        // リクエストにクラス番号をセット
        req.setAttribute("class_num", class_num);

        // JSPへフォワード 7
        if (errors.isEmpty()) { // エラーメッセージがない場合
            // 完了ページにリダイレクト
            res.sendRedirect("StudentCreateDone.action");
        } else { // エラーメッセージがある場合
            // 登録画面にフォワード
            req.getRequestDispatcher("StudentCreate.action").forward(req, res);
        }
    }

}

```

### File: `src/main/java/scoremanager/main/StudentListAction.java`

```java
package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Student;
import bean.Teacher;
import dao.ClassNumDao;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentListAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // ローカル変数の指定 1
        String entYearStr = ""; // 入力された入学年度
        String classNum = ""; // 入力されたクラス番号
        String isAttendStr = ""; // 入力された在学フラグ

        int entYear = 0; // 入学年度
        boolean isAttend = false; // 在学フラグ
        List<Student> students = null; // 学生リスト

        LocalDate todayDate = LocalDate.now(); // LocalDateインスタンスを取得
        int year = todayDate.getYear(); // 現在の年を取得

        StudentDao studentDao = new StudentDao(); // 学生Dao
        ClassNumDao classNumDao = new ClassNumDao(); // クラス番号Daoを初期化

        Map<String, String> errors = new HashMap<>(); // エラーメッセージ

        // リクエストパラメーターの取得 2
        entYearStr = req.getParameter("f1"); // 入学年度
        classNum = req.getParameter("f2"); // クラス番号
        isAttendStr = req.getParameter("f3"); // 在学フラグ

        // ビジネスロジック 4
        if (entYearStr != null) {
            // 数値に変換
            entYear = Integer.parseInt(entYearStr);
        }
        if (isAttendStr != null) { // 在学フラグがnullじゃなかった場合
            // 在学フラグをtrueに変更
            isAttend = true;
        }
        // リストを初期化
        List<Integer> entYearSet = new ArrayList<>();
        // 10年前から1年後まで年をリストに追加
        for (int i = year - 10; i < (year + 1); i++) {
            entYearSet.add(i);
        }

        // DBからデータ取得 3
        // ログインユーザーの学校コードをもとにクラス番号の一覧を取得
        List<String> list = classNumDao.filter(teacher.getSchool());

        if (entYear != 0 && !classNum.equals("0")) {
            // 入学年度とクラス番号を指定
            students = studentDao.filter(teacher.getSchool(), entYear, classNum, isAttend);
        } else if (entYear != 0 && classNum.equals("0")) {
            // 入学年度のみ指定
            students = studentDao.filter(teacher.getSchool(), entYear, isAttend);
        } else if (entYear == 0 && classNum == null || entYear == 0 && classNum.equals("0")) {
            // 指定なし
            // 全学生情報を取得
            students = studentDao.filter(teacher.getSchool(), isAttend);
        } else {
            errors.put("f1", "クラスを指定する場合は入学年度も指定してください");
            // リクエストにエラーメッセージをセット
            req.setAttribute("errors", errors);
            // 全学生情報を取得
            students = studentDao.filter(teacher.getSchool(), isAttend);
        }

        // レスポンス値をセット 6

        // リクエストに入学年度をセット
        req.setAttribute("f1", entYear);
        // リクエストにクラス番号をセット
        req.setAttribute("f2", classNum);
        // 在学フラグが送信されていた場合
        if (isAttendStr != null) {
            // 在学フラグを立てる
            isAttend = true;
            // リクエストに在学フラグをセット
            req.setAttribute("f3", isAttendStr);
        }

        // リクエストに学生リストをセット
        req.setAttribute("students", students);

        // リクエストに関連データをセット
        req.setAttribute("class_num_set", list);
        req.setAttribute("ent_year_set", entYearSet);

        // JSPへフォワード 7
        req.getRequestDispatcher("student_list.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentUpdateAction.java`

```java
package scoremanager.main;

import bean.Student;
import bean.Teacher;
import dao.ClassNumDao;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentUpdateAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーター取得
        String student_no = req.getParameter("no"); // 変更対象となる学生の番号を取得

        Student student = new StudentDao().get(student_no); // 学生を番号から検索

        if (student == null) { // 学生が見つからなかった場合
            res.sendRedirect("StudentList.Action"); // 学生リストにリダイレクトして終了
            return;
        }

        // student_update.jspに情報を渡すためにリクエスト属性として値をセット
        req.setAttribute("ent_year", student.getEntYear());
        req.setAttribute("no", student.getNo());
        req.setAttribute("name", student.getName());
        req.setAttribute("class_num", student.getClassNum());
        req.setAttribute("class_num_set", new ClassNumDao().filter(teacher.getSchool()));
        req.setAttribute("is_attend", student.isAttend());

        // JSPへフォワード
        req.getRequestDispatcher("student_update.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentUpdateDoneAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentUpdateDoneAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        //ローカル変数の宣言 1
        //なし

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        //なし

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        req.getRequestDispatcher("student_update_done.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/StudentUpdateExecuteAction.java`

```java
package scoremanager.main;

import bean.Student;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentUpdateExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // パラメーター取得
        String no = req.getParameter("no");

        StudentDao studentDao = new StudentDao();

        // すでにあるStudentを取得
        Student student = studentDao.get(no);

        if (student == null) {
            // 学生が見つからなかった
            res.sendRedirect(req.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        // パラメーターの内容に更新
        student.setName(req.getParameter("name"));
        student.setClassNum(req.getParameter("class_num"));
        student.setAttend(req.getParameter("is_attend") != null);

        // 保存
        studentDao.save(student);

        // 完了ページにリダイレクト
        res.sendRedirect("StudentUpdateDone.action");
    }

}

```

### File: `src/main/java/scoremanager/main/TestRegistAction.java`

```java
// 部分完成 (要dao実装)

package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class TestRegistAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーターを取得 (検索条件)
        String entYearStr = request.getParameter("f1"); // 入学年度, int変数あり
        String classNum = request.getParameter("f2"); // クラス番号
        String subjectCd = request.getParameter("f3"); // 科目コード
        String numStr = request.getParameter("f4"); // 回数, int変数あり

        // 画面のプルダウンリスト用データの取得
        // 入学年度リスト (現在の年から前後10年)
        List<Integer> entYearList = new ArrayList<>();
        int year = LocalDate.now().getYear();
        for (int i = year - 10; i < (year + 1); i++) {
            entYearList.add(i);
        }

        // 教員に紐づくクラス、科目を取得
        List<String> classNumList = new ClassNumDao().filter(teacher.getSchool());
        // List<Subject> subjectList = new SubjectDao().filter(teacher.getSchool());
        List<Object> subjectList = new ArrayList<>(); // 仮

        // 全条件が指定されている場合の検索処理
        if (entYearStr != null && !entYearStr.equals("0") &&
                classNum != null && !classNum.equals("0") &&
                subjectCd != null && !subjectCd.equals("0") &&
                numStr != null && !numStr.equals("0")) { // 全条件が指定されていて0ではない

            int entYear = Integer.parseInt(entYearStr);
            int num = Integer.parseInt(numStr);

            // 選択された科目を取得
            // Subject subject = student_dao.get(subjectCd, teacher.getSchool());

            // 条件に一致する成績(テストの結果)を取得
            // List<Test> tests = new TestDao().filter(entYear, classNum, subject, num, teacher.getSchool());

            // 検索結果をセット
            // request.setAttribute("tests", tests);
            request.setAttribute("tests", new int[] {}); // 仮
        }

        // 表示用のデータをセット
        request.setAttribute("f1", entYearStr);
        request.setAttribute("f2", classNum);
        request.setAttribute("f3", subjectCd);
        request.setAttribute("f4", numStr);

        // 選択
        request.setAttribute("ent_year_set", entYearList);
        request.setAttribute("class_num_set", classNumList);
        request.setAttribute("subjects", subjectList);

        // 回数選択 (2回)
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        request.setAttribute("num_set", numList);

        // JSPにフォワード
        request.getRequestDispatcher("test_regist.jsp").forward(request, response);
    }

}

```

### File: `src/main/java/scoremanager/main/TestRegistDoneAction.java`

```java
package scoremanager.main;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class TestRegistDoneAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        //ローカル変数の宣言 1
        //なし

        //リクエストパラメータ―の取得 2
        //なし

        //DBからデータ取得 3
        //なし

        //ビジネスロジック 4
        //なし

        //DBへデータ保存 5
        //なし

        //レスポンス値をセット 6
        //なし

        //JSPへフォワード 7
        req.getRequestDispatcher("test_regist_done.jsp").forward(req, res);
    }

}

```

### File: `src/main/java/scoremanager/main/TestRegistExecuteAction.java`

```java
//package scoremanager.main;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import bean.Subject;
//import bean.Teacher;
//import bean.Test;
//import bean.Student;
//import dao.SubjectDao;
//import dao.TestDao;
//import dao.StudentDao;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import tool.Action;
//
///**
// * TestRegistExecuteAction
// * 成績登録画面で入力された複数の得点情報をDBに一括保存します。
// */
//public class TestRegistExecuteAction extends Action {
//
//    @Override
//    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        // セッションからログインユーザー情報を取得
//        HttpSession session = request.getSession();
//        Teacher teacher = (Teacher) session.getAttribute("user");
//
//        // 1. リクエストパラメータの取得
//        // 検索条件（処理完了後に元の画面に戻るために保持）
//        String entYearStr = request.getParameter("f1");
//        String classNum = request.getParameter("f2");
//        String subjectCd = request.getParameter("f3");
//        String numStr = request.getParameter("f4");
//
//        // 入力された得点データ（学生番号の配列と、得点の配列）
//        String[] studentNoList = request.getParameterValues("student_no_list");
//        String[] pointList = request.getParameterValues("point_list");
//
//        // 2. DAOの初期化
//        TestDao tDao = new TestDao();
//        SubjectDao sDao = new SubjectDao();
//        StudentDao stDao = new StudentDao();
//
//        // 3. 保存用データの組み立て
//        Subject subject = sDao.get(subjectCd, teacher.getSchool());
//        int num = Integer.parseInt(numStr);
//        List<Test> tests = new ArrayList<>();
//
//        if (studentNoList != null && pointList != null) {
//            for (int i = 0; i < studentNoList.length; i++) {
//                Test test = new Test();
//                // 得点が入力されていない（空文字）場合は保存対象から除外、
//                // または仕様に合わせてデフォルト値を設定する
//                if (pointList[i] != null && !pointList[i].isEmpty()) {
//                    int point = Integer.parseInt(pointList[i]);
//                    
//                    // 点数のバリデーション（0〜100）
//                    if (point >= 0 && point <= 100) {
//                        Student student = stDao.get(studentNoList[i]);
//                        
//                        test.setNo(num);
//                        test.setPoint(point);
//                        test.setStudent(student);
//                        test.setSubject(subject);
//                        test.setSchool(teacher.getSchool());
//                        test.setClassNum(classNum);
//                        
//                        tests.add(test);
//                    }
//                }
//            }
//        }
//
//        // 4. DB更新の実行
//        // TestDaoのsaveメソッドは、Listを受け取って一括で登録/更新を行う想定
//        tDao.save(tests);
//
//        // 5. 登録完了後の遷移
//        // 登録完了メッセージなどを表示する場合は完了JSPへ、
//        // 連続して入力する場合は元の登録アクションへフォワードします。
//        request.getRequestDispatcher("test_regist_done.jsp").forward(request, response);
//    }
//}
```

### File: `src/main/java/tool/Action.java`

```java
package tool;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 継承用Actionクラス
public abstract class Action {

    public abstract void execute(
            HttpServletRequest req, HttpServletResponse res) throws Exception;

}

```

### File: `src/main/java/tool/EncodingFilter.java`

```java
package tool;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/*" })
public class EncodingFilter implements Filter {

    /**
     * doFilterメソッド フィルター処理を記述
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // 文字コードをセット
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // System.out.println("フィルタの前処理");
        chain.doFilter(request, response);
        // System.out.println("フィルタの後処理");
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }

}

```

### File: `src/main/java/tool/FrontController.java`

```java
package tool;

import java.io.IOException;

import bean.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "*.action" })
public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {

            // パスを取得
            String path = req.getServletPath().substring(1);

            // ファイル名を取得してクラス名に変換
            String name = path.replace(".a", "A").replace('/', '.');

            // START: ログイン状態チェック

            // 対象階層かどうか (scoremanager.main.* and (not scoremanager.main.LogoutAction))
            boolean needLogin = name.startsWith("scoremanager.main.") && !name.equals("scoremanager.main.LogoutAction"); // true: 対象, false: 対象外(通過)

            if (needLogin == true) { // チェック対象

                // ユーザー取得
                HttpSession session = req.getSession(false);
                User user = (session != null) ? (User) session.getAttribute("user") : null; // セッションがあればセッションからユーザーを取得

                // 認証状態チェック
                if ((user == null) || (user.isAuthenticated() == false)) {
                    // 未ログインまたは認証無効 → リダイレクト先をセットしたログイン画面にリダイレクトして終了
                    String redirectUrl = req.getRequestURI();
                    if (req.getQueryString() != null) {
                        redirectUrl += "?" + req.getQueryString(); // urlに付随していたパラメーターをセット
                    }
                    res.sendRedirect(req.getContextPath() + "/scoremanager/Login.action?redirect="
                            + java.net.URLEncoder.encode(redirectUrl, "UTF-8"));
                    return;
                }
            }

            // END: ログイン状態チェック

            // ログイン状態チェック通過

            // アクションクラスのインスタンスを返却
            Action action = (Action) Class.forName(name).getDeclaredConstructor().newInstance();

            // 遷移先URLを取得
            action.execute(req, res);

        } catch (Exception e) {
            e.printStackTrace();
            // エラーページへフォワード
            res.sendRedirect(req.getContextPath() + "/error.jsp"); // エラーページにリダイレクト
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }

}

```

### File: `src/main/webapp/META-INF/context.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration>
<!-- 上記はEclipseの警告を消すための記述です。 -->

<Context reloadable="true">
	<!-- db(h2)接続情報 -->
	<Resource
		name="jdbc/exam"
		auth="Container"
		type="javax.sql.DataSource"
		driverClassName="org.h2.Driver"
		url="jdbc:h2:tcp://localhost/~/exam"
		username="sa"
		password=""
	/>
</Context>

```

### File: `src/main/webapp/WEB-INF/web.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="https://jakarta.ee/xml/ns/jakartaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee
                        https://jakarta.ee/xml/ns/jakartaee/web-app_6_0.xsd"
    version="6.0">

    <!-- /scoremanager/index.jsp をトップページとして設定 -->
    <welcome-file-list>
        <welcome-file>/scoremanager/index.jsp</welcome-file>
    </welcome-file-list>

</web-app>

```

### File: `src/main/webapp/common/base.jsp`

```
<%-- 共通テンプレート --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Bootstrap CSS -->
		<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
		crossorigin="anonymous">
		<title><c:out value="${param.title}" /></title>
		<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		${param.scripts}
	</head>
	<body>
		<div id="wrapper" class="container">
			<header
			class="d-flex flex-wrap justify-content-center py-3 px-5 mb-4 border-bottom border-2 bg-primary bg-opacity-10 bg-gradient">
			<c:import url="/common/header.jsp" />
		</header>

		<div class="row justify-content-center">
			<c:choose>
				<%-- ログイン済みの場合 --%>
				<c:when test="${user.isAuthenticated()}">
					<nav class="col-3" style="height:40rem;">
						<c:import url="/common/navigation.jsp" />
					</nav>
					<main class="col-9 border-start"> ${param.content} </main>
				</c:when>
				<%-- 未ログインの場合 --%>
				<c:otherwise>
					<main class="col-8"> ${param.content} </main>
				</c:otherwise>
			</c:choose>
		</div>
		<footer class="py-2 my-4 bg-dark bg-opacity-10 border-top border-3 align-bottom">
			<c:import url="/common/footer.jsp" />
		</footer>

	</div>
</body>
</html>

```

### File: `src/main/webapp/common/footer.jsp`

```
<%-- フッター --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<p class="text-center text-muted mb-0">&copy; 2023 TIC</p>
<p class="text-center text-muted mb-0">大原学園</p>

```

### File: `src/main/webapp/common/header.jsp`

```
<%-- ヘッダー --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<div class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
	<h1 class="fs-1">得点管理システム</h1>
</div>
<c:if test="${user.isAuthenticated()}">
	<div class="nav align-self-end">
		<span class="nav-item px-2"><c:out value="${user.getName()}" />様</span>
		<a class="nav-item px-2" href="Logout.action">ログアウト</a>
	</div>
</c:if>

```

### File: `src/main/webapp/common/navigation.jsp`

```
<%-- サイドバー --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<ul class="nav nav-pills flex-column mb-auto px-4">
	<li class="nav-item my-3"><a href="Menu.action">メニュー</a></li>
	<li class="nav-item mb-3"><a href="StudentList.action">学生管理</a></li>
	<li class="nav-item">成績管理</li>
	<li class="nav-item mx-3 mb-3"><a href="TestRegist.action">成績登録</a></li>
	<li class="nav-item mx-3 mb-3"><a href="TestList.action">成績参照</a></li>
	<li class="nav-item mb-3"><a href="SubjectList.action">科目管理</a></li>
	<li class="nav-item mb-3"><a href="ClassList.action">クラス管理</a></li>
</ul>

```

### File: `src/main/webapp/error.jsp`

```
<%-- エラーページ --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="ctx_path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Bootstrap CSS -->
		<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
		crossorigin="anonymous">
		<title>エラーページ</title>
		<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		${param.scripts}
	</head>
	<body>
		<div id="wrapper" class="container">
			<header
			class="d-flex flex-wrap justify-content-center py-3 px-5 mb-4 border-bottom border-2 bg-primary bg-opacity-10 bg-gradient">
			<div class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
				<h1 class="fs-1">得点管理システム</h1>
			</div>
			<c:if test="${user.isAuthenticated()}">
				<div class="nav align-self-end">
					<span class="nav-item px-2"><c:out value="${user.getName()}" />様</span>
					<a class="nav-item px-2" href="${ctx_path}/scoremanager/main/Logout.action">ログアウト</a>
				</div>
			</c:if>
		</header>

		<div class="row justify-content-center">
			<c:choose>
				<%-- ログイン済みの場合 --%>
				<c:when test="${user.isAuthenticated()}">
					<nav class="col-3">

						<ul class="nav nav-pills flex-column mb-auto px-4">
							<li class="nav-item my-3"><a href="${ctx_path}/scoremanager/main/Menu.action">メニュー</a></li>
							<li class="nav-item mb-3"><a href="${ctx_path}/scoremanager/main/StudentList.action">学生管理</a></li>
							<li class="nav-item">成績管理</li>
							<li class="nav-item mx-3 mb-3"><a href="${ctx_path}/scoremanager/main/TestRegist.action">成績登録</a></li>
							<li class="nav-item mx-3 mb-3"><a href="${ctx_path}/scoremanager/main/TestList.action">成績参照</a></li>
							<li class="nav-item mb-3"><a href="${ctx_path}/scoremanager/main/SubjectList.action">科目管理</a></li>
							<li class="nav-item mb-3"><a href="${ctx_path}/scoremanager/main/ClassList.action">クラス管理</a></li>
						</ul>

					</nav>
					<main class="col-9 border-start">
						<section>
							<p>エラーが発生しました</p>
						</section>
					</main>
				</c:when>
				<%-- 未ログインの場合 --%>
				<c:otherwise>
					<main class="col-8">
						<section>
							<p>エラーが発生しました</p>
						</section>
					</main>
				</c:otherwise>
			</c:choose>
		</div>
		<footer	class="py-2 my-4 bg-dark bg-opacity-10 border-top border-3 align-bottom">
			<p class="text-center text-muted mb-0">&copy; 2023 TIC </p>
			<p class="text-center text-muted mb-0">大原学園</p>
		</footer>

	</div>
</body>
</html>

```

### File: `src/main/webapp/scoremanager/index.jsp`

```
<%-- indexリダイレクトページ --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="ctx_path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script>
            // ログインページにリダイレクト
            location.href="${ctx_path}/scoremanager/Login.action";
        </script>
    </head>
    <body>

    </body>
</html>
```

### File: `src/main/webapp/scoremanager/login.jsp`

```
<%-- ログインJSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts">
		<script type="text/javascript">
			$(function() {
				// 「パスワードを表示」が変更された時の処理
				$('#password-display').change(function() {
					if ($(this).prop('checked')) {
						// チェックが入っている場合
						// パスワード入力欄をテキストにする
						$('#password-input').attr('type', 'text');
					} else {
						// チェックが外れている場合
						// パスワード入力欄をパスワードにする
						$('#password-input').attr('type', 'password');
					}
				});
			});
		</script>
	</c:param>

	<c:param name="content">
		<section class="w-75 text-center m-auto border pb-3">
			<form action = "LoginExecute.action" method="post">
				<div id="wrap_box">
					<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">ログイン</h2>
					<c:if test="${errors.size() > 0}">
						<div>
							<ul>
								<c:forEach var="error" items="${errors}">
									<li><c:out value="${error}" /></li>
								</c:forEach>
							</ul>
						</div>
					</c:if>
					<div>
						<!-- ＩＤ -->
						<div class="form-floating mx-5">
							<input class="form-control px-5 fs-5" autocomplete="off"
							id="id-input" maxlength="20" name="id" placeholder="半角でご入力下さい"
							style="ime-mode: disabled" type="text" value="${id}" required />
							<label>ＩＤ</label>
						</div>
						<!-- パスワード -->
						<div class="form-floating mx-5 mt-3">
							<input class="form-control px-5 fs-5" autocomplete="off"
							id="password-input" maxlength="20" name="password"
							placeholder="20文字以内の半角英数字でご入力下さい" style="ime-mode: disabled"
							type="password" required />
							<label>パスワード</label>
						</div>
						<div class="form-check mt-3">
							<label class="form-check-label" for="password-display">
								<input class="form-check-input" id="password-display" name="chk_d_ps" type="checkbox" />
								パスワードを表示
							</label>
						</div>
						<%-- リダイレクト先の埋め込み --%>
						<c:if test="${redirect != null}">
							<input type="hidden" name="redirect" value="${redirect}" />
						</c:if>
					</div>

					<div class="mt-4">
						<input class="w-25 btn btn-lg btn-primary" type="submit" name="login" value="ログイン"/>
					</div>
				</div>
			</form>
		</section>
	</c:param>
</c:import>

```

### File: `src/main/webapp/scoremanager/main/logout.jsp`

```
<%-- ログアウトJSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">
		<div id="wrap_box">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">ログアウト</h2>
			<div id="wrap_box">
				<p class="text-center" style="background-color:#66CC99">ログアウトしました</p>
				<a href="../Login.action">ログイン</a>
			</div>
		</div>
	</c:param>
</c:import>
```

### File: `src/main/webapp/scoremanager/main/menu.jsp`

```
<%-- メニューJSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section class="me-4">
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">メニュー</h2>
				<div class="row text-center px-4 fs-3 my-5">
					<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
					style="height: 10rem; background-color: #dbb;">
					<a href="StudentList.action">学生管理</a>
				</div>
				<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
				style="height: 10rem; background-color: #bdb;">
				<div>
					<div class="">成績管理</div>
					<div class="">
						<a href="TestRegist.action">成績登録</a>
					</div>
					<div class="">
						<a href="TestList.action">成績参照</a>
					</div>
				</div>
			</div>
			<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
			style="height: 10rem; background-color: #bbd;">
			<a href="SubjectList.action">科目管理</a>
		</div>
		<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
		style="height: 10rem; background-color: #ddb;">
		<a href="ClassList.action">クラス管理</a>
	</div>
</div>
</section>
</c:param>
</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_create.jsp`

```
<%-- 学生登録JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp" >
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section>
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">学生情報登録</h2>
				<form action="StudentCreateExecute.action" method="get">
					<div>
						<label for="ent_year">入学年度</label>
						<select class="form-select" id="ent_year" name="ent_year">
							<option value="0">--------</option>
							<c:forEach var="year" items="${ent_year_set}">
								<%-- 現在のyearと選択されていたent_yearが一致していた場合selectedを追記 --%>
								<option value="${year}" <c:if test="${year == ent_year}">selected</c:if>>${year}</option>
							</c:forEach>
						</select>
					</div>
					<div class="mt-2 text-warning"><c:out value="${errors.get('1')}" /></div>
					<div>
						<label for="no">学生番号</label><br>
						<input class="form-control" type="text" id="no" name="no" value="<c:out value='${no}' />" required maxlength="10" placeholder="学生番号を入力してください" />
					</div>
					<div class="mt-2 text-warning"><c:out value="${errors.get('2')}" /></div>
					<div>
						<label for="name">氏名</label><br>
						<input class="form-control" type="text" id="name" name="name" value="<c:out value='${name}' />" required maxlength="30" placeholder="氏名を入力してください" />
					</div>
					<div class="mx-auto py-2">
						<label for="class_num">クラス</label>
						<select class="form-select" id="class_num" name="class_num">
							<c:forEach var="num" items="${class_num_set}">
								<%-- 現在のnumと選択されていたclass_numが一致していた場合selectedを追記 --%>
								<option value="<c:out value='${num}' />" <c:if test="${num == class_num}">selected</c:if>><c:out value='${num}' /></option>
							</c:forEach>
						</select>
					</div>
					<div class="mx-auto py-2">
						<button class="btn btn-secondary" id="create-button" name="end">登録して終了</button>
					</div>
				</form>
				<a href="StudentList.action">戻る</a>
			</section>
		</c:param>
	</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_create_done.jsp`

```
<%-- 学生登録完了JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">
		<div id="wrap_box">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">学生情報登録</h2>
			<div id="wrap_box">
				<p class="text-center" style="background-color:#8cc3a9">登録が完了しました</p>

				<br>
				<br>
				<br>
				<a href="StudentCreate.action">戻る</a>
				<a>　　　　　</a>
				<a href="StudentList.action">学生一覧</a>
			</div>
		</div>
	</c:param>
</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_list.jsp`

```
<%-- 学生一覧JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp" >
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section class="me=4">
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">学生管理</h2>
				<div class="my-2 text-end px-4">
					<a href="StudentCreate.action">新規登録</a>
				</div>
				<form method="get">
					<div class="row border mx-3 mb-3 py-2 align-items-center rounded" id="filter">
						<div class="col-4">
							<label class="form-label" for="student-f1-select">入学年度</label>
							<select class="form-select" id="student-f1-select" name="f1">
								<option value="0">--------</option>
								<c:forEach var="year" items="${ent_year_set}">
									<%-- 現在のyearと選択されていたf1が一致していた場合selectedを追記 --%>
									<option value="${year}" <c:if test="${year == f1}">selected</c:if>>${year}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-4">
							<label class="form-label" for="student-f2-select">クラス</label>
							<select class="form-select" id="student-f2-select" name="f2">
								<option value="0">--------</option>
								<c:forEach var="num" items="${class_num_set}">
									<%-- 現在のnumと選択されていたf2が一致していた場合selectedを追記 --%>
									<option value="<c:out value='${num}' />" <c:if test="${num == f2}">selected</c:if>><c:out value='${num}' /></option>
								</c:forEach>
							</select>
						</div>
						<div class="col-2 form-check text-center">
							<label class="form-check-label" for="student-f3-check">在学中
								<%-- パラメーターf3が存在している場合checkedを追記 --%>
								<input class="form-check-input" type="checkbox"
								id="student-f3-check" name="f3" value="t"
								<c:if test="${!empty f3}">checked</c:if> />
							</label>
						</div>
						<div class="col-2 text-center">
							<button class="btn btn-secondary" id="filter-button">絞込み</button>
						</div>
						<div class="mt-2 text-warning"><c:out value="${errors.get('f1')}" /></div>
					</div>
				</form>


				<c:choose>
					<c:when test="${students.size() > 0}">
						<div>検索結果：${students.size()}件</div>
						<table class="table table-hover">
							<tr>
								<th>入学年度</th>
								<th>学生番号</th>
								<th>氏名</th>
								<th>クラス</th>
								<th class="text-center">在学中</th>
								<th></th>
								<th></th>
							</tr>
							<c:forEach var="student" items="${students}">
								<tr>
									<td>${student.entYear}</td>
									<td><c:out value="${student.no}" /></td>
									<td><c:out value="${student.name}" /></td>
									<td><c:out value="${student.classNum}" /></td>
									<td class="text-center">
										<%-- 在学フラグがたっている場合「◯」それは以外は「×」を表示 --%>
										<c:choose>
											<c:when test="${student.isAttend()}">
												◯
											</c:when>
											<c:otherwise>
												×
											</c:otherwise>
										</c:choose>
									</td>
									<td><a href="<c:url value='StudentUpdate.action'><c:param name='no' value='${student.no}'/></c:url>">変更</a></td>
								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						<div>学生情報が存在しませんでした。</div>
					</c:otherwise>
				</c:choose>
			</section>
		</c:param>
	</c:import>
```

### File: `src/main/webapp/scoremanager/main/student_update.jsp`

```
<%-- 学生情報変更JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp" >
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

		<c:param name="content">
			<section>
				<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">学生情報変更</h2>
				<form action="StudentUpdateExecute.action" method="get">
					<div>
						<label class="mx-auto py-2" for="ent_year">入学年度</label><br>
						<input class="border border-0 ps-3" type="text" id="ent_year" name="ent_year" value="${ent_year}" readonly />
					</div>
					<div class="mx-auto py-2">
						<label class="mx-auto py-2" for="no">学生番号</label><br>
						<input class="border border-0 ps-3" type="text" id="no" value="<c:out value='${no}' />" name="no" readonly />
					</div>
					<div class="mx-auto py-2">
						<label for="name">氏名</label><br>
						<input class="form-control" type="text" id="name" name="name" value="<c:out value='${name}' />" required maxlength="30" />
					</div>
					<div class="mx-auto py-2">
						<label for="class_num">クラス</label><br>
						<select class="form-select" id="class_num" name="class_num">
							<c:forEach var="num" items="${class_num_set}">
								<option value="<c:out value='${num}' />" <c:if test="${num == class_num}">selected</c:if>><c:out value='${num}' /></option>
							</c:forEach>
						</select>
					</div>
					<div class="mx-auto py-2">
						<label for="is_attend">在学中</label>
						<input type="checkbox" id="is_attend" name="is_attend" <c:if test="${is_attend}">checked</c:if> />
					</div>
					<div class="mx-auto py-2">
						<input class="btn btn-primary" type="submit" name="login" value="変更"/>
					</div>
				</form>
				<a href="StudentList.action">戻る</a>
			</section>
		</c:param>
	</c:import>

```

### File: `src/main/webapp/scoremanager/main/student_update_done.jsp`

```
<%-- 学生変更完了JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">
		<div id="wrap_box">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">学生情報変更</h2>
			<div id="wrap_box">
				<p class="text-center" style="background-color:#8cc3a9">変更が完了しました</p>
				<br>
				<br>
				<br>
				<a href="StudentList.action">学生一覧</a>
			</div>
		</div>
	</c:param>
</c:import>

```

### File: `src/main/webapp/scoremanager/main/test_regist.jsp`

```
<%-- 成績管理一覧JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp" >
    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="scripts"></c:param>

        <c:param name="content">
            <section class="me=4">
                <h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">成績管理</h2>
                <form method="get">
                    <div class="row border mx-3 mb-3 py-2 align-items-center rounded" id="filter">
                        <div class="col-2">
                            <label class="form-label" for="student-f1-select">入学年度</label>
                            <select class="form-select" id="student-f1-select" name="f1">
                                <option value="0">--------</option>
                                <c:forEach var="year" items="${ent_year_set}">
                                    <%-- 現在のyearと選択されていたf1が一致していた場合selectedを追記 --%>
                                    <option value="${year}" <c:if test="${year == f1}">selected</c:if>>${year}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-2">
                            <label class="form-label" for="student-f2-select">クラス</label>
                            <select class="form-select" id="student-f2-select" name="f2">
                                <option value="0">--------</option>
                                <c:forEach var="num" items="${class_num_set}">
                                    <%-- 現在のnumと選択されていたf2が一致していた場合selectedを追記 --%>
                                    <option value="<c:out value='${num}' />" <c:if test="${num == f2}">selected</c:if>><c:out value='${num}' /></option>
                                </c:forEach>
                            </select>
                        </div>



                        <%-- 科目 確認 --%>
                        <div class="col-4">
                            <label class="form-label" for="student-f3-select">科目</label>
                            <select class="form-select" id="student-f3-select" name="f3">
                                <option value="0">--------</option>
                                <c:forEach var="subject" items="${subject_set}">
                                    <option value="${subject}" <c:if test="${subject == f3}">selected</c:if>>${subject}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <%-- 回数 確認 --%>
                        <div class="col-2">
                            <label class="form-label" for="student-f4-select">回数</label>
                            <select class="form-select" id="student-f4-select" name="f4">
                                <option value="0">--------</option>
                                <c:forEach var="num" items="${num_set}">
                                    <option value="${num}" <c:if test="${num == f4}">selected</c:if>>${num}</option>
                                </c:forEach>
                            </select>



                        </div>

                        <div class="col-2 text-center">
                            <button class="btn btn-secondary" id="filter-button">検索</button>
                        </div>


                    </div>
                </form>

                <div class="mt-2 text-warning"><c:out value="${errors.get('f1')}" /></div>

                <c:choose>
                    <c:when test="${students.size() > 0}">
                        <div>検索結果：${students.size()}件</div>
                        <table class="table table-hover">
                            <tr>
                                <th>入学年度</th>
                                <th>学生番号</th>
                                <th>氏名</th>
                                <th>クラス</th>
                                <th class="text-center">在学中</th>
                                <th></th>
                                <th></th>
                            </tr>
                            <c:forEach var="student" items="${students}">
                                <tr>
                                    <td>${student.entYear}</td>
                                    <td><c:out value="${student.no}" /></td>
                                    <td><c:out value="${student.name}" /></td>
                                    <td><c:out value="${student.classNum}" /></td>
                                    <td class="text-center">
                                        <%-- 在学フラグがたっている場合「◯」それは以外は「×」を表示 --%>
                                        <c:choose>
                                            <c:when test="${student.isAttend()}">
                                                ◯
                                            </c:when>
                                            <c:otherwise>
                                                ×
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td><a href="<c:url value='StudentUpdate.action'><c:param name='no' value='${student.no}'/></c:url>">変更</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:when>
                    <c:otherwise>
                        <div>成績情報？が存在しませんでした。</div>
                    </c:otherwise>
                </c:choose>
            </section>
        </c:param>
    </c:import>
```

### File: `src/main/webapp/scoremanager/main/test_regist_done.jsp`

```
<%-- 成績管理登録完了JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">
		<div id="wrap_box">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">成績管理</h2>
			<div id="wrap_box">
				<p class="text-center" style="background-color:#8cc3a9">登録が完了しました</p>

				<br>
				<br>
				<br>
				<a href="TestRegist.action">戻る</a>
				<a>　　　　　</a>
				<a href="TestList.action">成績参照</a>
			</div>
		</div>
	</c:param>
</c:import>
```

package scoremanager.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.School;
import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import tool.Action;

public class SubjectUpdateExecuteAction extends Action {

    public void execute(HttpServletRequest req,
                        HttpServletResponse res)
            throws Exception {

        // 文字コード
        req.setCharacterEncoding("UTF-8");

        // ログイン情報
        Teacher teacher =
            (Teacher)req.getSession()
                        .getAttribute("user");

        // 学校取得
        School school =
            teacher.getSchool();

        // パラメータ取得
        String cd =
            req.getParameter("cd");

        String name =
            req.getParameter("name");

        // Bean
        Subject subject = new Subject();

        subject.setCd(cd);
        subject.setName(name);
        subject.setSchool(school);

        // DAO
        SubjectDao dao = new SubjectDao();

        // 更新
        dao.update(subject);

        // 完了後一覧へ
        res.sendRedirect("SubjectList.action");
    }

	@Override
	public void execute(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse res)
			throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
package scoremanager.main;

import java.util.List;

import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class SubjectListAction extends Action {

	@Override
	public void execute(
			HttpServletRequest request,
			HttpServletResponse response
	) throws Exception {

		// セッション取得
		HttpSession session = request.getSession();

		// ログインユーザー取得
		Teacher teacher = (Teacher)session.getAttribute("user");

		// DAO生成
		SubjectDao dao = new SubjectDao();

		// 科目一覧取得
		List<Subject> list = dao.filter(teacher.getSchool());

		// リクエストスコープに格納
		request.setAttribute("list", list);

		// JSPへフォワード
		request.getRequestDispatcher("/scoremanager/main/subject_list.jsp")
		.forward(request, response);
	}
}
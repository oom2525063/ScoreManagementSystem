package scoremanager.main;

import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class SubjectCreateAction extends Action {

	public void execute(
			HttpServletRequest request,
			HttpServletResponse response
	) throws Exception {

		// POST時（登録ボタン押下）
		if (request.getMethod().equals("POST")) {

			// 入力値取得
			String cd = request.getParameter("cd");
			String name = request.getParameter("name");

			// 入力値保持
			request.setAttribute("cd", cd);
			request.setAttribute("name", name);

			// エラーフラグ
			boolean hasError = false;

			// 科目コード未入力
			if (cd == null || cd.isEmpty()) {

				request.setAttribute(
					"errorCd",
					"このフィールドを入力してください。"
				);

				hasError = true;
			}

			// 科目コード3文字チェック
			else if (cd.length() != 3) {

				request.setAttribute(
					"errorCd",
					"科目コードは3文字で入力してください。"
				);

				hasError = true;
			}

			// セッション取得
			HttpSession session = request.getSession();

			// ログインユーザー取得
			Teacher teacher =
				(Teacher)session.getAttribute("user");

			// DAO生成
			SubjectDao dao = new SubjectDao();

			// 重複チェック
			Subject old =
				dao.get(cd, teacher.getSchool());

			// 重複時
			if (old != null) {

				request.setAttribute(
					"errorCd",
					"科目コードが重複しています。"
				);

				hasError = true;
			}

			// 科目名未入力
			if (name == null || name.isEmpty()) {

				request.setAttribute(
					"errorName",
					"このフィールドを入力してください。"
				);

				hasError = true;
			}

			// エラーなし
			if (!hasError) {

				// Subject生成
				Subject subject = new Subject();

				// 値セット
				subject.setCd(cd);
				subject.setName(name);
				subject.setSchool(
					teacher.getSchool()
				);

				// DB登録
				dao.insert(subject);

				// 完了画面へ
				request.getRequestDispatcher(
					"/scoremanager/main/subject_create_done.jsp"
				).forward(request, response);

				return;
			}
		}

		// 登録画面表示
		request.getRequestDispatcher(
			"/scoremanager/main/subject_create.jsp"
		).forward(request, response);

		return;
	}
}
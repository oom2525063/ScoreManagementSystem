package scoremanager.main;

import bean.School;
import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectUpdateAction extends Action {

    public void execute(HttpServletRequest req,
            HttpServletResponse res)
            throws Exception {

        // ログイン情報取得
        Teacher teacher = (Teacher) req.getSession().getAttribute("user");

        // 学校情報取得
        School school = teacher.getSchool();

        // 科目コード取得
        String cd = req.getParameter("cd");

        // DAO
        SubjectDao dao = new SubjectDao();

        // 科目取得
        Subject subject = dao.get(cd, school);

        // TODO: 科目が存在しなかった(==null)場合はSubjectList.actionにリダイレクトして戻す

        // JSPへ渡す
        req.setAttribute("subject", subject);

        // 更新画面へ
        req.getRequestDispatcher(
                "subject_update.jsp") // TODO: ファイル作成
                .forward(req, res);
    }

}

package scoremanager.main;

import java.io.IOException;

import bean.School;
import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectDeleteExecuteAction extends Action {

    public void execute(
            HttpServletRequest req,
            HttpServletResponse res)
            throws Exception, IOException {

        // ログイン情報取得
        Teacher teacher =
            (Teacher) req.getSession()
            .getAttribute("user");

        // 学校情報取得
        School school = teacher.getSchool();

        // 科目コード取得
        String cd = req.getParameter("cd");

        // DAO生成
        SubjectDao dao = new SubjectDao();

        // 科目取得
        Subject subject = dao.get(cd, school);

        // 科目が存在しない場合
        if (subject == null) {

            req.getRequestDispatcher(
                "/scoremanager/main/subject_list.jsp"
            ).forward(req, res);

            return;
        }

        // 削除実行
        boolean result = dao.delete(subject);

        // 削除失敗
        if (!result) {

            req.getRequestDispatcher(
                "/error.jsp"
            ).forward(req, res);

            return;
        }

        // 完了画面へ
        req.getRequestDispatcher(
            "/scoremanager/main/subject_delete_done.jsp"
        ).forward(req, res);
    }
}
// SubjectDeleteAction.java

package scoremanager.main;

import java.io.IOException;

import bean.School;
import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectDeleteAction extends Action {

    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception, IOException {

        // ログイン情報取得
        Teacher teacher = (Teacher) req.getSession().getAttribute("user");

        // 学校情報取得
        School school = teacher.getSchool();

        // 科目コード取得
        String cd = req.getParameter("cd");

        // DAO生成
        SubjectDao dao = new SubjectDao();

        // 科目情報取得
        Subject subject = dao.get(cd, school);

        // TODO: subjectがない(==null)場合はSubjectList.actionにリダイレクト

        // リクエストへ保存
        req.setAttribute("subject", subject);

        // 削除確認画面へ遷移
        req.getRequestDispatcher("subject_delete.jsp")
                .forward(req, res);
    }

}
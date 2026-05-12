// SubjectDeleteAction.java

package scoremanager.main;

import java.io.IOException;

import bean.Subject;
import dao.SubjectDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectDeleteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {

            // 科目コード取得
            String cd = req.getParameter("cd");

            // DAO生成
            SubjectDAO dao = new SubjectDAO();

            // 科目情報取得
            Subject subject = dao.get(cd);

            // リクエストへ保存
            req.setAttribute("subject", subject);

            // 削除確認画面へ遷移
            req.getRequestDispatcher("subject_delete.jsp")
                    .forward(req, res);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
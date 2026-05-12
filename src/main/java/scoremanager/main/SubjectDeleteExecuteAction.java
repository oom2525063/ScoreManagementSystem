// SubjectDeleteExecuteAction.java

package scoremanager.main;

import java.io.IOException;

import dao.SubjectDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectDeleteExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {

            // 科目コード取得
            String cd = req.getParameter("cd");

            // DAO生成
            SubjectDAO dao = new SubjectDAO();

            // 削除実行
            dao.delete(cd);

            // 一覧画面へ戻る
            res.sendRedirect("SubjectList.action");

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
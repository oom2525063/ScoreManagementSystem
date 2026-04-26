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

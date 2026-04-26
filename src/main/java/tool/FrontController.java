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

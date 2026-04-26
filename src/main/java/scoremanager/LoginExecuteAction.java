package scoremanager;

import java.util.ArrayList;
import java.util.List;

import bean.Teacher;
import dao.TeacherDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // ローカル変数の宣言 1
        String url = "";

        // リクエストパラメータ―の取得 2
        String id = req.getParameter("id"); // 教員ID
        String password = req.getParameter("password"); // パスワード

        //DBからデータ取得 3
        Teacher teacher = new TeacherDao().login(id, password); // 教員データ取得(ログイン)

        //ビジネスロジック 4
        //DBへデータ保存 5
        //レスポンス値をセット 6
        //フォワード 7
        //条件で手順4~7の内容が分岐
        if (teacher != null) {

            // 認証成功の場合

            // セッション更新
            HttpSession session = req.getSession(true); // セッションを取得

            teacher.setAuthenticated(true); // 認証済みフラグを立てる
            session.setAttribute("user", teacher); // セッションにログイン情報を保存

            // ログイン前のページにリダイレクト
            String redirect = req.getParameter("redirect"); // リダイレクト先を取得
            if ((redirect != null) && !redirect.isEmpty()) {
                url = redirect; // リダイレクト先が指定されていて空ではない
            } else {
                url = "main/Menu.action"; // リダイレクト先未指定 (デフォルト(メニュー))
            }

            res.sendRedirect(url); // リダイレクトして終了
            return;

        } else {

            // 認証失敗の場合
            // エラーメッセージをセット
            List<String> errors = new ArrayList<>();
            errors.add("IDまたはパスワードが確認できませんでした");
            req.setAttribute("errors", errors);

            // 入力された教員IDをセット
            req.setAttribute("id", id);

            // フォワード
            url = "login.jsp";
            req.getRequestDispatcher(url).forward(req, res); // ログイン画面にフォワード(戻)して終了
            return;

        }
    }

}

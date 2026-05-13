package scoremanager.main;

import bean.ClassNum;
import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class ClassDeleteExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーター取得
        String cd = request.getParameter("cd");

        ClassNumDao classNumDao = new ClassNumDao();

        // クラスを取得 (学校照合)
        ClassNum classNum = classNumDao.get(cd, teacher.getSchool());

        if (classNum == null) {
            // クラスが見つからなかった or 違う学校(権限不足)
            response.sendRedirect(request.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        // クラス削除
        boolean result = classNumDao.delete(classNum);
        if (result == false) {
            // 削除失敗
            response.sendRedirect(request.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        // 完了ページにリダイレクト
        response.sendRedirect("ClassDeleteDone.action");
    }

}

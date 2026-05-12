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
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーター取得
        String cd = req.getParameter("cd");

        ClassNumDao classNumDao = new ClassNumDao();

        // クラスを取得 (学校照合)
        ClassNum classNum = classNumDao.get(cd, teacher.getSchool());

        if (classNum == null) {
            // クラスが見つからなかった or 違う学校
            res.sendRedirect(req.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        // クラス削除
        classNumDao.delete(classNum);

        // 完了ページにリダイレクト
        res.sendRedirect("ClassDeleteDone.action");
    }

}

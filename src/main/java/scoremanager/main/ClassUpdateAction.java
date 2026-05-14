package scoremanager.main;

import bean.ClassNum;
import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class ClassUpdateAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");
        request.setAttribute("teacher", teacher);

        // パラメーター取得
        String classNumPram = request.getParameter("class_num");

        // クラスを取得 (学校照合)
        ClassNum classNum = new ClassNumDao().get(classNumPram, teacher.getSchool());

        if (classNum == null) {
            // クラスが見つからなかった or 違う学校(権限不足)
            response.sendRedirect("ClassList.action"); // 一覧にリダイレクトして終了
            return;
        }

        request.setAttribute("class_", classNum);

        // 確認画面にフォワード
        request.getRequestDispatcher("class_update.jsp").forward(request, response);
    }

}

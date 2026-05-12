package scoremanager.main;

import java.util.HashMap;

import bean.ClassNum;
import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class ClassCreateExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッションを取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        HashMap<String, String> errorList = new HashMap<>();

        // 入力値検証

        String classNum = request.getParameter("class_num");
        if (classNum == null || classNum.isEmpty()) {
            errorList.put("class_num", "クラス番号を入力してください");
            request.setAttribute("error_set", errorList);
            request.getRequestDispatcher("class_create.jsp").forward(request, response);
            return;
        } else if (classNum.length() > 5) {
            errorList.put("class_num", "クラス番号は5文字以内で入力してください");
            request.setAttribute("error_set", errorList);
            request.getRequestDispatcher("class_create.jsp").forward(request, response);
            return;
        }

        // 処理

        ClassNum classNumObj = new ClassNum();
        classNumObj.setClass_num(classNum);
        classNumObj.setSchool(teacher.getSchool());

        // 保存
        boolean result = new ClassNumDao().save(classNumObj);

        if (result == false) {
            // 追加に失敗
            response.sendRedirect(request.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        response.sendRedirect("ClassCreateDone.action");
    }

}

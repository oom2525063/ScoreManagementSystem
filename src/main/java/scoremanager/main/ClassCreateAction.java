package scoremanager.main;

import java.util.HashMap;

import bean.Teacher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class ClassCreateAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッションを取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // 処理

        HashMap<String, String> errorList = new HashMap<>();

        // 保存

        request.setAttribute("school_cd", request.getAttribute("school_cd"));
        request.setAttribute("class_num", request.getAttribute("class_num"));

        request.setAttribute("teacher", teacher);

        request.setAttribute("error_set", errorList);

        request.getRequestDispatcher("class_create.jsp").forward(request, response);
    }

}

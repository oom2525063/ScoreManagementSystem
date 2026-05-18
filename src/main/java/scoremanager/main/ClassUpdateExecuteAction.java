package scoremanager.main;

import java.util.HashMap;

import bean.ClassNum;
import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class ClassUpdateExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッションを取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");
        request.setAttribute("teacher", teacher);

        // 終了前の属性保存
        request.setAttribute("class_num", request.getParameter("class_num"));
        request.setAttribute("old_class_num", request.getParameter("old_class_num"));

        HashMap<String, String> errorList = new HashMap<>();

        // 入力値検証

        String oldClassNumParam = request.getParameter("old_class_num");

        String classNumError = null;
        String classNumParam = request.getParameter("class_num");

        if (classNumParam == null || classNumParam.isEmpty()) {
            classNumError = "クラス番号を入力してください";
        } else if (classNumParam.length() > 5) {
            classNumError = "クラス番号は5文字以内で入力してください";
        }

        // 条件チェック未通過 → エラー表示を出して更新に戻す
        if (classNumError != null) {
            // 表示用
            ClassNum oldClassNum = new ClassNumDao().get(oldClassNumParam, teacher.getSchool());
            if (oldClassNum == null) {
                // クラスが見つからなかった or 違う学校(権限不足)
                response.sendRedirect(request.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
                return;
            }
            request.setAttribute("class_", oldClassNum);

            errorList.put("class_num", classNumError);
            request.setAttribute("error_set", errorList);
            request.getRequestDispatcher("class_update.jsp").forward(request, response);
            return;
        }

        // 元のクラスを取得 (学校照合)
        ClassNum oldClassNum = new ClassNumDao().get(oldClassNumParam, teacher.getSchool());

        // 保存 (変更)
        boolean result = new ClassNumDao().save(oldClassNum, classNumParam);

        if (result == false) {
            // 追加に失敗
            response.sendRedirect(request.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        response.sendRedirect("ClassUpdateDone.action");
    }

}

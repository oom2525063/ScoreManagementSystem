package scoremanager.main;

import bean.Student;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentUpdateExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        // パラメーター取得
        String no = req.getParameter("no");

        StudentDao studentDao = new StudentDao();

        // すでにあるStudentを取得
        Student student = studentDao.get(no);

        if (student == null) {
            // 学生が見つからなかった
            res.sendRedirect(req.getContextPath() + "/error.jsp"); // エラーページにリダイレクトして終了
            return;
        }

        // パラメーターの内容に更新
        student.setName(req.getParameter("name"));
        student.setClassNum(req.getParameter("class_num"));
        student.setAttend(req.getParameter("is_attend") != null);

        // 保存
        studentDao.save(student);

        // 完了ページにリダイレクト
        res.sendRedirect("StudentUpdateDone.action");
    }

}

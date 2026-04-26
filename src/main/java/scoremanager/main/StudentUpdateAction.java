package scoremanager.main;

import bean.Student;
import bean.Teacher;
import dao.ClassNumDao;
import dao.StudentDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class StudentUpdateAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

        HttpSession session = req.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーター取得
        String student_no = req.getParameter("no"); // 変更対象となる学生の番号を取得

        Student student = new StudentDao().get(student_no); // 学生を番号から検索

        if (student == null) { // 学生が見つからなかった場合
            res.sendRedirect("StudentList.Action"); // 学生リストにリダイレクトして終了
            return;
        }

        // student_update.jspに情報を渡すためにリクエスト属性として値をセット
        req.setAttribute("ent_year", student.getEntYear());
        req.setAttribute("no", student.getNo());
        req.setAttribute("name", student.getName());
        req.setAttribute("class_num", student.getClassNum());
        req.setAttribute("class_num_set", new ClassNumDao().filter(teacher.getSchool()));
        req.setAttribute("is_attend", student.isAttend());

        // JSPへフォワード
        req.getRequestDispatcher("student_update.jsp").forward(req, res);
    }

}

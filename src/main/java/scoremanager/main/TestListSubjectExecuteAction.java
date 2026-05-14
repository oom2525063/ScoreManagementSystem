package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;
import bean.Teacher;
import bean.TestListSubject;
import dao.ClassNumDao;
import dao.SubjectDao;
import dao.TestListSubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class TestListSubjectExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        HttpSession session = req.getSession();

        // ログインユーザー取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメータ取得
        String f1 = req.getParameter("f1"); // 入学年度
        String f2 = req.getParameter("f2"); // クラス
        String f3 = req.getParameter("f3"); // 科目

        // 入学年度リスト
        List<Integer> entYearList = new ArrayList<>();

        int year = LocalDate.now().getYear();

        for (int i = year - 10; i <= year; i++) {
            entYearList.add(i);
        }

        // クラス一覧
        List<String> classNumList = new ClassNumDao().filter(teacher.getSchool());

        // 科目一覧
        List<Subject> subjectList = new SubjectDao().filter(teacher.getSchool());

        // 科目取得
        Subject subject = null;

        for (Subject s : subjectList) {

            if (s.getCd().equals(f3)) {

                subject = s;
                break;
            }
        }

        // 検索結果
        List<TestListSubject> tests = new ArrayList<>();

        TestListSubjectDao dao = new TestListSubjectDao();

        System.out.println("subject is null: " + subject == null);
        System.out.println("f1: " + f1);

        // filter実行
        if (subject != null &&
                f1 != null &&
                !f1.equals("0")) {

            System.out.println("passsss");

            tests = dao.filter(
                    Integer.parseInt(f1),
                    f2,
                    subject,
                    teacher.getSchool());
        } else {
            System.out.println("nooooooo");

        }

        // JSPへ渡す
        req.setAttribute("test_set", tests);

        req.setAttribute("f", "sj");

        req.setAttribute("f1", f1);

        req.setAttribute("f2", f2);

        req.setAttribute("f3", f3);

        req.setAttribute("ent_year_set", entYearList);

        req.setAttribute("class_num_set", classNumList);

        req.setAttribute("subject_set", subjectList);

        // 画面遷移
        req.getRequestDispatcher("test_list_student.jsp")
                .forward(req, res);
    }
}
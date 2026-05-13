package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;
import bean.Subject;
import bean.Teacher;
import bean.Test;
import dao.ClassNumDao;
import dao.StudentDao;
import dao.SubjectDao;
import dao.TestDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class TestListStudentExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        HttpSession session = req.getSession();

        Teacher teacher =
                (Teacher) session.getAttribute("user");

        School school = teacher.getSchool();

        // 学生番号取得
        String f4 = req.getParameter("f4");

        // 入学年度リスト
        List<Integer> entYearList = new ArrayList<>();

        int year = LocalDate.now().getYear();

        for (int i = year - 10; i <= year; i++) {
            entYearList.add(i);
        }

        // クラス一覧
        List<String> classNumList =
                new ClassNumDao().filter(school);

        // 科目一覧
        List<Subject> subjectList =
                new SubjectDao().filter(school);

        // 検索結果
        List<Test> testList = new ArrayList<>();

        // 学生取得
        Student student =
                new StudentDao().get(f4);

        // TestDao
        TestDao dao = new TestDao();

        // 成績検索
        if (student != null) {

            for (Subject subject : subjectList) {

                for (int no = 1; no <= 5; no++) {

                    Test test =
                            dao.get(student, subject, school, no);

                    if (test != null) {

                        testList.add(test);
                    }
                }
            }
        }

        // JSPへ渡す
        req.setAttribute("test_set", testList);

        req.setAttribute("f4", f4);

        req.setAttribute("ent_year_set", entYearList);

        req.setAttribute("class_num_set", classNumList);

        req.setAttribute("subject_set", subjectList);

        req.setAttribute("f", "st");

        // 画面遷移
        req.getRequestDispatcher("test_list_student.jsp")
                .forward(req, res);
    }
}
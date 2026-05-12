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

public class TestListAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");
        School school = teacher.getSchool();

        // ▼ プルダウン用データ
        List<Integer> entYearList = new ArrayList<>();
        int year = LocalDate.now().getYear();
        for (int i = year - 10; i <= year; i++) entYearList.add(i);

        List<String> classNumList = new ClassNumDao().filter(school);
        List<Subject> subjectList = new SubjectDao().filter(school);

        request.setAttribute("ent_year_set", entYearList);
        request.setAttribute("class_num_set", classNumList);
        request.setAttribute("subject_set", subjectList);

        // ▼ パラメータ取得
        String f1 = request.getParameter("f1"); // 入学年度
        String f2 = request.getParameter("f2"); // クラス
        String f3 = request.getParameter("f3"); // 科目
        String f4 = request.getParameter("f4"); // 学生番号
        String f  = request.getParameter("f");  // sj or st
        String f5 = request.getParameter("f5"); // テスト回数（科目検索用）

        request.setAttribute("f1", f1);
        request.setAttribute("f2", f2);
        request.setAttribute("f3", f3);
        request.setAttribute("f4", f4);
        request.setAttribute("f5", f5);
        request.setAttribute("f", f);

        TestDao testDao = new TestDao();
        List<Test> testList = new ArrayList<>();

        // ▼ 科目検索（sj）
        if ("sj".equals(f)) {

            // 全部そろっているときだけ TestDao.filter() を呼ぶ
            if (isValid(f1) && isValid(f2) && isValid(f3) && isValid(f5)) {

                int entYear = Integer.parseInt(f1);
                String classNum = f2;
                Subject subject = new Subject();
                subject.setCd(f3);
                subject.setSchool(school);
                int testNo = Integer.parseInt(f5);

                testList = testDao.filter(entYear, classNum, subject, testNo, school);
            }

            request.setAttribute("test_set", testList);
        }

        // ▼ 学生検索（st）
        if ("st".equals(f)) {

            if (isValid(f4)) {

                Student student = new StudentDao().get(f4);

                if (student != null) {
                    // 全科目 × 全テスト回数（1〜5）を総当たり
                    for (Subject sub : subjectList) {
                        for (int no = 1; no <= 5; no++) {
                            Test t = testDao.get(student, sub, school, no);
                            if (t != null) testList.add(t);
                        }
                    }
                }
            }

            request.setAttribute("test_set", testList);
        }

        // ▼ JSP へフォワード
        request.getRequestDispatcher("test_list_student.jsp").forward(request, response);
    }

    // ▼ 空文字・null・"0" を無効とする
    private boolean isValid(String s) {
        return s != null && !s.isEmpty() && !"0".equals(s);
    }
}

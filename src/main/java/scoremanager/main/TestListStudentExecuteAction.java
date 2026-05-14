package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import bean.Student;
import bean.Subject;
import bean.Teacher;
import bean.TestListStudent;
import dao.ClassNumDao;
import dao.StudentDao;
import dao.SubjectDao;
import dao.TestListStudentDao;
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

        // 学生取得
        Student student =
                new StudentDao().get(f4);
        req.setAttribute("student", student);
        
        // 検索結果
        List<TestListStudent> testList = new ArrayList<>();
        
        //学生が存在しなかった場合
        if (student == null) {
        	
            req.setAttribute("error", "学生情報が存在しませんでした。");
            
        } else {
        // 学生が存在したときに取得       
        // TestDao
        TestListStudentDao dao = new TestListStudentDao();
        
        testList = dao.filter(student);
        
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
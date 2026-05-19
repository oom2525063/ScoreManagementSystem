package scoremanager.main;

import java.util.ArrayList;
import java.util.List;

import bean.ClassNum;
import bean.School;
import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class ClassListAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");
        request.setAttribute("teacher", teacher);

        School school = teacher.getSchool();

        // 教師が所属する学校の全クラスの番号を取得
        ClassNumDao classNumDao = new ClassNumDao();
        List<String> classNumCdList = classNumDao.filter(teacher.getSchool());  // 全クラスのobj

        ArrayList<ClassNum> classNumList = new ArrayList<>();
        for (String cd : classNumCdList) {
            classNumList.add(classNumDao.get(cd, school));
        }

        // リクエスト属性をセット
        request.setAttribute("class_num_set", classNumList); // クラス番号

        request.getRequestDispatcher("class_list.jsp").forward(request, response);
    }

}

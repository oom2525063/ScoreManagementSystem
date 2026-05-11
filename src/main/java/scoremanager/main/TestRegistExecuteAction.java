// 部分完成 (要dao実装)

package scoremanager.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.School;
import bean.Student;
import bean.Subject;
import bean.Teacher;
import bean.Test;
import dao.SubjectDao;
import dao.TestDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class TestRegistExecuteAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // セッションからユーザー情報を取得
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");

        School school = teacher.getSchool();

        // リクエストパラメーターを取得
        String subjectCd = request.getParameter("f3");
        String numStr = request.getParameter("f4");

        int num = Integer.parseInt(numStr);

        // 入力された学生番号のリストを取得
        String[] studentNoSet = request.getParameterValues("regist");

        // 科目情報を取得
        Subject subject = new SubjectDao().get(subjectCd, school);

        // 保存するデータのリストとエラーのリスト
        List<Test> tests = new ArrayList<>();
        Map<String, String> errorMap = new HashMap<>();

        if (studentNoSet != null) {

            for (String studentNo : studentNoSet) {

                // JSPの point_${test.getStudent().getNo()} に対応する値を取得
                String pointStr = request.getParameter("point_" + studentNo);

                // 得点入力がある場合のみ処理
                if (pointStr != null && !pointStr.isEmpty()) {

                    try {

                        int point = Integer.parseInt(pointStr);

                        // バリデーション (0〜100点)
                        if (0 <= point && point <= 100) {

                            Test test = new Test();

                            test.setNo(num);
                            test.setPoint(point);
                            test.setSchool(school);
                            test.setSubject(subject);

                            // 学生の番号をセット
                            Student student = new Student();
                            student.setNo(studentNo);

                            test.setStudent(student);

                            tests.add(test);
                        } else {
                            errorMap.put(studentNo, "0～100の範囲で入力してください。");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        errorMap.put(studentNo, "数値を入力してください。");
                        break;
                    }
                }
            }
        }

        if (errorMap.isEmpty()) { // エラーの有無確認

            // エラーがない → 保存

            new TestDao().save(tests, school);

            // 完了画面にリダイレクト
            response.sendRedirect("TestRegistDone.action");

        } else {
            // エラーあり → 入力画面に戻す

            // 推移前のパラメーターとエラーメッセージをセット

            request.setAttribute("f1", request.getParameter("f1"));
            request.setAttribute("f2", request.getParameter("f2"));
            request.setAttribute("f3", request.getParameter("f3"));
            request.setAttribute("f4", request.getParameter("f4"));

            request.setAttribute("errorMap", errorMap);

            request.getRequestDispatcher("TestRegist.action").forward(request, response);
        }
    }

}
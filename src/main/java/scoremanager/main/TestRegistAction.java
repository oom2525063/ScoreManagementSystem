// 部分完成 (要dao実装)
// TODO: 検索押下後の未入力エラー表示実装

package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Teacher;
import dao.ClassNumDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class TestRegistAction extends Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーターを取得 (検索条件)
        String entYearStr = request.getParameter("f1"); // 入学年度, int変数あり
        String classNum = request.getParameter("f2"); // クラス番号
        String subjectCd = request.getParameter("f3"); // 科目コード
        String numStr = request.getParameter("f4"); // 回数, int変数あり

        // 画面のプルダウンリスト用データの取得
        // 入学年度リスト (現在の年から前後10年)
        List<Integer> entYearList = new ArrayList<>();
        int year = LocalDate.now().getYear();
        for (int i = year - 10; i < (year + 1); i++) {
            entYearList.add(i);
        }

        // 教員に紐づくクラス、科目を取得
        List<String> classNumList = new ClassNumDao().filter(teacher.getSchool());
        // List<Subject> subjectList = new SubjectDao().filter(teacher.getSchool()); // 未実装
        List<Object> subjectList = new ArrayList<>(); // 仮

        // 全条件が指定されている場合 → 検索

        // 検索処理
        if (entYearStr != null && !entYearStr.isEmpty() &&
                classNum != null && !classNum.isEmpty() &&
                subjectCd != null && !subjectCd.isEmpty() &&
                numStr != null && !numStr.isEmpty()) { // f1~f4の全条件が指定されている

            // 値変換
            int entYear = Integer.parseInt(entYearStr);
            int num = Integer.parseInt(numStr);

            // 選択された科目を取得
            // Subject subject = student_dao.get(subjectCd, teacher.getSchool());

            // 条件に一致する成績(テスト (レスポンス内容))を取得
            // List<Test> tests = new TestDao().filter(entYear, classNum, subject, num, teacher.getSchool());

            // 検索結果をセット
            // request.setAttribute("tests", tests);
            request.setAttribute("tests", new ArrayList<>()); // 仮
        }

        // 表示用のデータをセット
        request.setAttribute("f1", entYearStr);
        request.setAttribute("f2", classNum);
        request.setAttribute("f3", subjectCd);
        request.setAttribute("f4", numStr);

        // 選択
        request.setAttribute("ent_year_set", entYearList);
        request.setAttribute("class_num_set", classNumList);
        request.setAttribute("subjects", subjectList);

        // 回数選択 (2回)
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        request.setAttribute("num_set", numList);

        // JSPにフォワード
        request.getRequestDispatcher("test_regist.jsp").forward(request, response);
    }

}

package scoremanager.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;
import bean.Teacher;
import bean.Test;
import dao.ClassNumDao;
import dao.SubjectDao;
import dao.TestDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class TestRegistAction extends Action {

    // パラメーターまたはリクエスト属性から値を取得する補助メソッド
    private String getParamOrAttr(HttpServletRequest request, String name) {

        String res = request.getParameter(name); // パラメーターから取得

        if (res == null || res.isEmpty()) {
            Object attr = request.getAttribute(name); // リクエスト属性から取得
            if (attr != null) {
                res = attr.toString(); // String化
            }
        }

        return res;
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession(); // セッション取得

        // Teacher(ユーザー)取得
        Teacher teacher = (Teacher) session.getAttribute("user");

        // パラメーターを取得 (検索条件)
        String entYearStr = this.getParamOrAttr(request, "f1"); // 入学年度, int変数あり(使用部で変換)
        String classNum = this.getParamOrAttr(request, "f2"); // クラス番号
        String subjectCd = this.getParamOrAttr(request, "f3"); // 科目コード
        String numStr = this.getParamOrAttr(request, "f4"); // 回数, int変数あり(使用部で変換)

        // 画面のプルダウンリスト用データの取得
        // 入学年度リスト (現在の年から前後10年)
        List<Integer> entYearList = new ArrayList<>();
        int year = LocalDate.now().getYear();
        for (int i = year - 10; i < (year + 1); i++) {
            entYearList.add(i);
        }

        // 教員に紐づくクラス、科目を取得
        List<String> classNumList = new ClassNumDao().filter(teacher.getSchool());
        List<Subject> subjectList = new SubjectDao().filter(teacher.getSchool());

        Subject subject = null;

        // 全条件が指定されている場合 → 検索

        // 検索処理
        if (entYearStr != null && !entYearStr.isEmpty() && !entYearStr.equals("0") &&
                classNum != null && !classNum.isEmpty() && !classNum.equals("0") &&
                subjectCd != null && !subjectCd.isEmpty() && !subjectCd.equals("0") &&
                numStr != null && !numStr.isEmpty() && !numStr.equals("0")) {// f1~f4の全条件が指定されている

            // 値変換
            int entYear = Integer.parseInt(entYearStr);
            int num = Integer.parseInt(numStr);

            // 選択された科目を取得
            subject = new SubjectDao().get(subjectCd, teacher.getSchool());

            List<Test> tests = new ArrayList<>();

            if (subject != null) {
                // 条件に一致する成績(テスト (レスポンス内容))を取得
                tests = new TestDao().filter(entYear, classNum, subject, num, teacher.getSchool());
            }

            // 検索結果をセット
            request.setAttribute("test_set", tests);

        }

        // 表示(保持)用のデータをセット
        request.setAttribute("f1", entYearStr);
        request.setAttribute("f2", classNum);
        request.setAttribute("f3", subjectCd);
        request.setAttribute("f4", numStr);

        // 選択
        request.setAttribute("ent_year_set", entYearList);
        request.setAttribute("class_num_set", classNumList);
        request.setAttribute("subject_set", subjectList);

        // 回数選択 (2回)
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        request.setAttribute("num_set", numList);

        request.setAttribute("subject", subject); // 検索時の名前表示用obj
        
        //未選択時メッセージ
        if ((entYearStr == null || entYearStr.equals("0")) ||
        	    (classNum == null || classNum.equals("0")) ||
        	    (subjectCd == null || subjectCd.equals("0")) ||
        	    (numStr == null || numStr.equals("0"))) {
        	    request.setAttribute("message",
        	        "入学年度とクラスと科目と回数を選択してください");
        	}

        // JSPにフォワード
        request.getRequestDispatcher("test_regist.jsp").forward(request, response);
    }

}

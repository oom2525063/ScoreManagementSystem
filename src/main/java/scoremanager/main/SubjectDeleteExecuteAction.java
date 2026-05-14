// SubjectDeleteExecuteAction.java

package scoremanager.main;

import java.io.IOException;

import bean.School;
import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectDeleteExecuteAction extends Action {

    public void execute(HttpServletRequest req, HttpServletResponse res)
            throws Exception, IOException {

        // ログイン情報
        Teacher teacher = (Teacher) req.getSession()
                .getAttribute("user");

        // 学校取得
        School school = teacher.getSchool();

        // 科目コード取得
        String cd = req.getParameter("cd");

        // DAO生成
        SubjectDao dao = new SubjectDao();
        Subject subject = dao.get(cd, school);

        // 削除実行
        dao.delete(subject); // TODO: 失敗(==false)でerror.jspにリダイレクト

        // 一覧画面へ戻る
        res.sendRedirect("SubjectList.action"); // TODO: SubjectDeleteDone.actionにリダイレクト
    }

}

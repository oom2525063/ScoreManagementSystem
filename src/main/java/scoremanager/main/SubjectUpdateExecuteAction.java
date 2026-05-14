package scoremanager.main;

import bean.School;
import bean.Subject;
import bean.Teacher;
import dao.SubjectDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectUpdateExecuteAction extends Action {

    public void execute(HttpServletRequest req,
            HttpServletResponse res)
            throws Exception {

        // ログイン情報
        Teacher teacher = (Teacher) req.getSession()
                .getAttribute("user");

        // 学校取得
        School school = teacher.getSchool();

        // パラメータ取得
        String cd = req.getParameter("cd");

        String name = req.getParameter("name");

        // Bean
        Subject subject = new Subject();

        subject.setCd(cd);
        subject.setName(name);
        subject.setSchool(school);

        // DAO
        SubjectDao dao = new SubjectDao();

        // 更新
        dao.save(subject);

        // 完了後一覧へ
        res.sendRedirect("SubjectList.action");
        // TODO: 完了後はSubjectUpdateDone.actionに遷移 (要ファイル作成)
    }

}

package tool;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 継承用Actionクラス
public abstract class Action {

    public abstract void execute(
            HttpServletRequest req, HttpServletResponse res) throws Exception;

}

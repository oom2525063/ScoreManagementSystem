<%-- クラス情報登録JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:import url="/common/base.jsp">

    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="content">
        <div id="wrap_box">
            <h2 class="h3 mb-4 fw-bold bg-secondary bg-opacity-10 py-2 ps-3">クラス情報登録</h2>
            <form action="ClassCreateExecute.action" method="get">
                <!-- 学校 -->
                <div class="mb-3">
                    <%-- ユーザーの学校を対象とする --%>
                    <label class="form-label">学校</label>
                    <input type="hidden" name="school_cd" value="<c:out value='${teacher.getSchool().getCd()}' />">
                    <p><c:out value="${teacher.getSchool().getName()}" /></p>
                </div>
                <!-- クラス番号 -->
                <div class="mb-4">
                    <label class="form-label">クラス番号</label>
                    <input type="text" name="class_num" class="form-control" value="${class_num}" placeholder="クラス番号を入力してください" required>
                    <c:if test="${not empty error_set.get('class_num')}">
                        <div class="text-warning mt-1" style="font-size:14px;">
                            <c:out value="${error_set.get('class_num')}" />
                        </div>
                    </c:if>
                </div>
                <button type="submit" class="btn btn-secondary">登録して終了</button>
            </form>
            <br>
            <a href="ClassList.action">戻る</a>
        </div>
    </c:param>
</c:import>

<%-- クラス情報変更JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:import url="/common/base.jsp">

    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="content">
        <div id="wrap_box">
            <h2 class="h3 mb-4 fw-bold bg-secondary bg-opacity-10 py-2 ps-3">クラス情報変更</h2>
            <form action="ClassUpdateExecute.action" method="get">
                <!-- 学校 -->
                <div class="mb-3">
                    <%-- ユーザー(Teacher)の学校を対象とする --%>
                    <label class="form-label">学校</label>
                    <p><c:out value="${teacher.getSchool().getName()}" /></p>
                </div>
                <!-- 変更前のクラス番号 -->
                <div class="mb-4">
                    <label class="form-label">変更前のクラス番号</label><br>
                    <input class="border border-0 ps-3" type="text" id="old_class_num" value="<c:out value='${class_.getClass_num()}' />" name="old_class_num" readonly />
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
                <button type="submit" class="btn btn-primary">登録</button>
            </form>
            <br>
            <a href="ClassList.action">戻る</a>
        </div>
    </c:param>

</c:import>

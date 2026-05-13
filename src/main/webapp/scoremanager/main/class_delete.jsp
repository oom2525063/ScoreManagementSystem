<%-- クラス情報削除JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp">

    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="content">
        <div id="wrap_box">
            <h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2">クラス情報削除</h2>
            <div id="wrap_box">
                <p>「<c:out value="${class_.getClass_num()}" />(<c:out value="${class_.getSchool().getName()}" />)」を削除してもよろしいですか</p>
                <a href="ClassDeleteExecute.action?cd=<c:out value='${class_.getClass_num()}' />" class="btn btn-danger">削除</a>
                <br>
                <br>
                <br>
                <a href="ClassList.action">戻る</a>
            </div>
        </div>
    </c:param>

</c:import>

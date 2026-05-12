<%-- クラス管理JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:import url="/common/base.jsp">

    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="content">
        <div id="wrap_box">
            <h2 class="h3 mb-3 fw-bold bg-secondary bg-opacity-10 py-2 ps-3">クラス管理</h2>
            <div class="text-end mb-3">
                <a href="ClassCreate.action">新規登録</a>
            </div>
            <div>名前：<c:out value="${teacher.getName()}" /><hr/></div>
            <table class="table table-hover">
                <tr>
                    <th>学校名</th>
                    <th>クラス番号</th>
                    <th></th>
                </tr>
                <c:forEach var="c" items="${class_num_set}">
                    <tr>
                        <td><c:out value="${c.getSchool().getName()}" /></td>
                        <td><c:out value="${c.getClass_num()}" /></td>
                        <td>
                            <c:if test="${teacher.getSchool().getCd() == c.getSchool().getCd()}">
                                <a href="ClassDelete.action?cd=<c:out value='${c.getClass_num()}' />">
                                    削除
                                </a>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </c:param>

</c:import>

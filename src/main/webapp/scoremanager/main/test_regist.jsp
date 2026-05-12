<%-- 成績管理一覧JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp" >
    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="scripts"></c:param>

        <c:param name="content">
            <section class="me=4">
                <h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">成績管理</h2>
                <form method="get" action="TestRegist.action">
                    <div class="row border mx-3 mb-3 py-2 align-items-center rounded" id="filter">
                        <div class="col-2">
                            <label class="form-label" for="test-f1-select">入学年度</label>
                            <select class="form-select" id="test-f1-select" name="f1">
                                <option value="0">--------</option>
                                <c:forEach var="year" items="${ent_year_set}">
                                    <%-- 現在のyearと選択されていたf1が一致していた場合selectedを追記 --%>
                                    <option value="${year}" <c:if test="${year == f1}">selected</c:if>>${year}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-2">
                            <label class="form-label" for="test-f2-select">クラス</label>
                            <select class="form-select" id="test-f2-select" name="f2">
                                <option value="0">--------</option>
                                <c:forEach var="num" items="${class_num_set}">
                                    <%-- 現在のnumと選択されていたf2が一致していた場合selectedを追記 --%>
                                    <option value="<c:out value='${num}' />" <c:if test="${num == f2}">selected</c:if>><c:out value='${num}' /></option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-4">
                            <label class="form-label" for="test-f3-select">科目</label>
                            <select class="form-select" id="test-f3-select" name="f3">
                                <option value="0">--------</option>
                                <c:forEach var="subject" items="${subjects}">
                                    <%-- 現在のnumと選択されていたf3が一致していた場合selectedを追記 --%>
                                    <option value="<c:out value='${subject.getCd()}' />" <c:if test="${subject.getCd() == f3}">selected</c:if>><c:out value="${subject.getName()}" /></option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-2">
                            <label class="form-label" for="test-f4-select">回数</label>
                            <select class="form-select" id="test-f4-select" name="f4">
                                <option value="0">--------</option>
                                <c:forEach var="num" items="${num_set}">
                                    <%-- 現在のnumと選択されていたf4が一致していた場合selectedを追記 --%>
                                    <option value="${num}" <c:if test="${num == f4}">selected</c:if>>${num}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-2 text-center">
                            <button class="btn btn-secondary" id="filter-button">検索</button>
                        </div>
                    </div>
                </form>
                <c:choose>
                    <c:when test="${tests.size() > 0}">
                        <form method="post" action="TestRegistExecute.action">
                            <%-- 隠しフィールド パラメーター保持用 --%>
                            <input type="hidden" name="f1" value="<c:out value="${f1}" />">
                            <input type="hidden" name="f2" value="<c:out value="${f2}" />">
                            <input type="hidden" name="f3" value="<c:out value="${f3}" />">
                            <input type="hidden" name="f4" value="<c:out value="${f4}" />">
                            <div>科目：<c:out value="${subject.getName()}" />（<c:out value="${f4}" />回）</div>
                            <table class="table table-hover">
                                <tr>
                                    <th>入学年度</th>
                                    <th>クラス</th>
                                    <th>学生番号</th>
                                    <th>氏名</th>
                                    <th>点数</th>
                                </tr>
                                <c:forEach var="test" items="${tests}">
                                    <tr>
                                        <td>${test.getStudent().getEntYear()}</td>
                                        <td><c:out value="${test.getClassNum()}" /></td>
                                        <td><c:out value="${test.getStudent().getNo()}" /></td>
                                        <td><c:out value="${test.getStudent().getName()}" /></td>
                                        <%-- 点数入力部 --%>
                                        <td>
                                            <%-- 値の範囲はサーブレット側で制御 --%>
                                            <input type="number" name="point_<c:out value="${test.getStudent().getNo()}" />" value="${test.getPoint()}">
                                            <%-- 入力値に対するエラーメッセージ --%>
                                            <c:if test="${not empty errorMap.get(test.getStudent().getNo())}">
                                                <div class="mt-2 text-warning">
                                                    <c:out value="${errorMap.get(test.getStudent().getNo())}" />
                                                </div>
                                            </c:if>
                                        </td>
                                        <%-- 隠しフィールド 対象生徒列挙用 --%>
                                        <input type="hidden" name="regist" value="<c:out value='${test.getStudent().getNo()}' />">
                                    </tr>
                                </c:forEach>
                            </table>
                            <div class="mx-auto py-2">
                                <button class="btn btn-secondary" id="regist-button" name="end">登録して終了</button>
                            </div>
                        </form>
                    </c:when>
                </c:choose>
            </section>
        </c:param>
    </c:import>
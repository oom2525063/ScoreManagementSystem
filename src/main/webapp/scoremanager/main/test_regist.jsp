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
                <form method="get">
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
                                <c:forEach var="subject" items="${subject_set}">
                                    <option value="<c:out value='${subject}' />" <c:if test="${subject == f3}">selected</c:if>><c:out value="${subject}" /></option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-2">
                            <label class="form-label" for="test-f4-select">回数</label>
                            <select class="form-select" id="test-f4-select" name="f4">
                                <option value="0">--------</option>
                                <c:forEach var="num" items="${num_set}">
                                    <option value="${num}" <c:if test="${num == f4}">selected</c:if>>${num}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-2 text-center">
                            <button class="btn btn-secondary" id="filter-button">検索</button>
                        </div>
                    </div>
                </form>

                <%-- ※入力値エラー 確認 --%>
                <div class="mt-2 text-warning"><c:out value="${errors.get('f1')}" /></div>

                <c:choose>
                    <c:when test="${tests.size() > 0}">
                        <%-- 科目表示 (仮) --%>
                        <div>科目：<c:out value="${f3}" />（<c:out value="${f4}" />回）</div>
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
                                    <td>${test.getClassNum()}</td>
                                    <td>${test.getNo()}</td>
                                    <td>${test.getStudent().getName()}</td>
                                    <%-- TODO: 入力欄化 --%>
                                    <td>${test.getScore()}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:when>
                </c:choose>
            </section>
        </c:param>
    </c:import>
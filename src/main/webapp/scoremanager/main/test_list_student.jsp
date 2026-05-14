<%-- 成績一覧(科目、学生)JSP --%>
<%-- test_list_student.jsp: 科目側表示(要追記) + 学生側表示(要追記) --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:import url="/common/base.jsp" >

    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="scripts"></c:param>

        <c:param name="content">
            <section class="me-4" style="width: 100%; max-width: 1200px;">
                <%-- 画面タイトル切り替え --%>
                <h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">
                    <c:choose>
                        <c:when test="${f == 'sj'}">
                            成績一覧（科目）
                        </c:when>
                        <c:when test="${f == 'st'}">
                            成績一覧（学生）
                        </c:when>
                        <c:otherwise>
                            成績一覧
                        </c:otherwise>
                    </c:choose>
                </h2>

                <%-- 検索ボックス --%>
                <div class="border mb-3 py-3 px-5 rounded w-100">

                    <%-- 科目情報 --%>
                    <form action="TestListSubjectExecute.action" method="get" class="d-flex align-items-end gap-4">

                        <p class="align-self-center pb-1 mb-0" style="min-width: 80px;">科目情報</p>
                        <div class="d-flex align-items-end gap-3">

                            <%-- 入学年度 --%>
                            <div>
                                <label class="form-label" for="ent-year-f1">入学年度</label>
                                <select class="form-select" id="ent-year-f1" name="f1" style="min-width: 130px;">
                                    <option value="0">--------</option>
                                    <c:forEach var="year" items="${ent_year_set}">
                                        <option value="${year}" <c:if test="${year == f1}">selected</c:if>>
                                            ${year}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>

                            <%-- クラス --%>
                            <div>
                                <label class="form-label" for="class-num-f2">クラス</label>
                                <select class="form-select" id="class-num-f2" name="f2" style="min-width: 130px;">
                                    <option value="0">--------</option>
                                    <c:forEach var="num" items="${class_num_set}">
                                        <option value="<c:out value='${num}' />" <c:if test="${num == f2}">selected</c:if>>
                                            <c:out value='${num}' />
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>

                            <%-- 科目 --%>
                            <div>
                                <label class="form-label" for="subject-f3">科目</label>
                                <select class="form-select" id="subject-f3" name="f3" style="min-width: 280px; max-width: 350px;">
                                    <option value="0">--------</option>
                                    <c:forEach var="subject" items="${subject_set}">
                                        <option value="<c:out value='${subject.cd}' />" <c:if test="${subject.cd == f3}">selected</c:if>>
                                            ${subject.name}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <%-- 科目側検索ボタン --%>
                        <div class="ms-3 flex-shrink-0">
                            <button class="btn btn-secondary" id="search-sj-button">
                                検索
                            </button>
                        </div>

                        <%-- 項目識別用文字列 (sj: 科目検索) --%>
                        <input type="hidden" name="f" value="sj">
                    </form>

                    <%-- 科目検索エラーメッセージ表示 --%>
                    <c:if test="${not empty error && f == 'sj'}">
                        <div class="mt-2 text-warning">
                            <c:out value="${error}" />
                        </div>
                    </c:if>

                    <hr class="my-3">

                    <%-- 学生情報 --%>
                    <form action="TestListStudentExecute.action" method="get" class="d-flex align-items-end gap-4">
                        <p class="align-self-center pb-1 mb-0" style="min-width: 80px;">学生情報</p>
                        <div>
                            <label class="form-label" for="student-no-f4">学生番号</label>
                            <input
                            type="text"
                            class="form-control"
                            id="student-no-f4"
                            name="f4"
                            required
                            value="<c:out value="${f4}" />"
                            placeholder="学生番号を入力してください"
                            maxlength="10"
                            style="min-width: 250px;"
                            >
                        </div>

                        <%-- 学生側検索ボタン --%>
                        <button class="btn btn-secondary ms-3" id="search-st-button">
                            検索
                        </button>

                        <%-- 識別用文字列 (st: 学生検索) --%>
                        <input type="hidden" name="f" value="st">
                    </form>
                </div>

                <%-- 検索結果表示 --%>
                <c:choose>

                    <%-- エラーメッセージ表示 --%>
                    <c:when test="${not empty error && f == 'st'}">
                        <div><c:out value="${error}" /></div>
                    </c:when>

                    <%-- 科目検索（f = "sj"） --%>
                    <c:when test="${f == 'sj'}">
                        <c:if test="${empty test_set}">
                            <div>成績情報が存在しませんでした</div>
                        </c:if>

                        <c:if test="${not empty test_set}">
                            <table class="table table-hover mt-3">
                                <tr>
                                    <th>入学年度</th>
                                    <th>クラス</th>
                                    <th>学生番号</th>
                                    <th>氏名</th>
                                    <th>１回</th>
                                    <th>２回</th>
                                </tr>

                                <c:forEach var="t" items="${test_set}" varStatus="st">
                                    <tr>
                                        <td>${t.getEntYear()}</td>
                                        <td>${t.getClassNum()}</td>
                                        <td>${t.getStudentNo()}</td>
                                        <td>${t.getStudentName()}</td>
                                        <td>${empty t.getPoint(1) ? '-' : t.getPoint(1)}</td>
                                        <td>${empty t.getPoint(2) ? '-' : t.getPoint(2)}</td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:if>
                    </c:when>

                    <%-- 学生検索（f = "st"） --%>
                    <c:when test="${f == 'st'}">

                        <%-- エラーメッセージ表示 --%>
                        <c:if test="${not empty error}">
                            <div>
                                <c:out value="${error}" />
                            </div>
                        </c:if>

                        <%-- 氏名表示 --%>
                        <div class="mb-2">
                            氏名：${student.getName()}（${student.getNo()}）
                        </div>

                        <c:if test="${empty test_set}">
                            <div>成績情報が存在しませんでした</div>
                        </c:if>

                        <c:if test="${not empty test_set}">
                            <table class="table table-hover mt-3">
                                <tr>
                                    <th>科目</th>
                                    <th>回数</th>
                                    <th>点数</th>
                                </tr>

                                <c:forEach var="t" items="${test_set}">
                                    <tr>
                                        <td>${t.getSubjectName()}</td>
                                        <td>${t.getNum()}</td>
                                        <td>${t.getPoint()}</td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </c:if>
                    </c:when>

                    <c:otherwise>
                        <p class="mt-3 text-info">
                            科目情報を選択または学生情報を入力して検索ボタンをクリックしてください
                        </p>
                    </c:otherwise>
                </c:choose>
            </section>
        </c:param>
</c:import>
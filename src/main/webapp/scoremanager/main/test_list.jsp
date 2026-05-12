<%-- 成績参照検索JSP --%>
<%-- test_list.jsp(this): 検索用初期画面 --%>
<%-- test_list_student.jsp: 科目側表示(要追記) + 学生側表示(要追記) ? --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/common/base.jsp" >
    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="scripts"></c:param>

        <c:param name="content">
            <section class="me-4">
                <h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">成績参照</h2>
                <%-- 検索ボックス --%>
                <div class="border mx-3 mb-3 py-3 px-5 rounded">
                    <%-- 科目情報 --%>
                    <form action="TestList.action" method="get" class="d-flex align-items-end gap-4">
                        <p class="align-self-center pb-1 mb-0" style="min-width: 80px;">科目情報</p>
                        <div class="d-flex align-items-end gap-3">
                            <%-- 入学年度 --%>
                            <div>
                                <label class="form-label" for="ent-year-f1">入学年度</label>
                                <select class="form-select" id="ent-year-f1" name="f1" style="min-width: 130px;">
                                    <option value="0">--------</option>
                                    <c:forEach var="year" items="${ent_year_set}">
                                        <option value="${year}" <c:if test="${year == f1}">selected</c:if>>${year}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <%-- クラス --%>
                            <div>
                                <label class="form-label" for="class-num-f2">クラス</label>
                                <select class="form-select" id="class-num-f2" name="f2" style="min-width: 130px;">
                                    <option value="0">--------</option>
                                    <c:forEach var="num" items="${class_num_set}">
                                        <option value="<c:out value='${num}' />" <c:if test="${num == f2}">selected</c:if>><c:out value='${num}' /></option>
                                    </c:forEach>
                                </select>
                            </div>
                            <%-- 科目 --%>
                            <div>
                                <label class="form-label" for="subject-f3">科目</label>
                                <select class="form-select" id="subject-f3" name="f3" style="min-width: 280px; max-width: 350px;">
                                    <option value="0">--------</option>
                                    <c:forEach var="subject" items="${subject_set}">
                                        <option value="<c:out value='${subject.cd}' />" <c:if test="${subject.cd == f3}">selected</c:if>>${subject.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <%-- 科目側検索ボタン --%>
                        <button class="btn btn-secondary ms-3" id="search-sj-button">検索</button>
                        <%-- 項目識別用文字列 (sj: 科目検索) --%>
                        <input type="hidden" name="f" value="sj">
                        <%-- 3つの条件が指定されていない場合はサーブレット側からエラー表示を出す --%>
                        <%-- TODO: サーブレット側実装 + 表示検証 --%>
                        <div class="mt-2 text-warning"><c:out value="${errors.get('sj')}" /></div>
                    </form>
                    <hr class="my-3">
                    <%-- 学生情報 --%>
                    <form action="TestList.action" method="get" class="d-flex align-items-end gap-4">
                        <p class="align-self-center pb-1 mb-0" style="min-width: 80px;">学生情報</p>
                        <div>
                            <label class="form-label" for="student-no-f4">学生番号</label>
                            <input type="text" class="form-control" id="student-no-f4" name="f4"
                            value="<c:out value="${f4}" />"
                            placeholder="学生番号を入力してください" maxlength="10" style="min-width: 250px;">
                        </div>
                        <%-- 学生側検索ボタン --%>
                        <button class="btn btn-secondary ms-3" id="search-st-button">検索</button>
                        <%-- 識別用文字列 (st: 学生検索) --%>
                        <input type="hidden" name="f" value="st">
                    </form>
                </div>
                <%-- 利用方法案内メッセージ --%>
                <c:if test="${empty f}">
                    <p class="text-info">科目情報を選択または学生情報を入力して検索ボタンをクリックしてください</p>
                </c:if>
            </section>
        </c:param>
    </c:import>

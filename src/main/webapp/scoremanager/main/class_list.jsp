<%-- クラス管理JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:import url="/common/base.jsp">

    <c:param name="title">
        得点管理システム
    </c:param>

    <c:param name="scripts">
        <%-- テーブル拡張のためのスクリプトの導入 --%>
        <%-- Datatables --%>
        <link href="https://cdn.datatables.net/v/ju/jq-3.7.0/moment-2.29.4/jszip-3.10.1/dt-2.3.7/b-3.2.6/b-colvis-3.2.6/b-html5-3.2.6/b-print-3.2.6/cr-2.1.2/cc-1.2.1/date-1.6.3/fc-5.0.5/fh-4.0.6/kt-2.12.2/r-3.0.8/rg-1.6.0/rr-1.5.1/sc-2.4.3/sb-1.8.4/sp-2.3.5/sl-3.1.3/sr-1.4.3/datatables.min.css" rel="stylesheet" integrity="sha384-/K0Iu5W4xrIOeLYXU7MGCsF5RZEcWNvlaIzaczn6vyeYK43Oo5GVd5otV31aKplS" crossorigin="anonymous">
        <%-- その他拡張 --%>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.2.7/pdfmake.min.js" integrity="sha384-VFQrHzqBh5qiJIU0uGU5CIW3+OWpdGGJM9LBnGbuIH2mkICcFZ7lPd/AAtI7SNf7" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.2.7/vfs_fonts.js" integrity="sha384-/RlQG9uf0M2vcTw3CX7fbqgbj/h8wKxw7C3zu9/GxcBPRKOEcESxaxufwRXqzq6n" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/v/ju/jq-3.7.0/moment-2.29.4/jszip-3.10.1/dt-2.3.7/b-3.2.6/b-colvis-3.2.6/b-html5-3.2.6/b-print-3.2.6/cr-2.1.2/cc-1.2.1/date-1.6.3/fc-5.0.5/fh-4.0.6/kt-2.12.2/r-3.0.8/rg-1.6.0/rr-1.5.1/sc-2.4.3/sb-1.8.4/sp-2.3.5/sl-3.1.3/sr-1.4.3/datatables.min.js" integrity="sha384-Y3PL80dPPxFTbyd0HPRToSywow5ajD9i1j524ke2xNpOjp34KbzD/ILfDZvskj8G" crossorigin="anonymous"></script>
    </c:param>

    <c:param name="content">
        <div id="wrap_box">
            <h2 class="h3 mb-3 fw-bold bg-secondary bg-opacity-10 py-2 ps-3">クラス管理</h2>
            <div class="text-end mb-3">
                <a href="ClassCreate.action">新規登録</a>
            </div>
            <div>名前：<c:out value="${teacher.getName()}" /><hr/></div>
            <%-- <table class="table table-hover"> --%>
            <table id="studentTable" class="display custom-table">
                <thead>
                    <th>学校名</th>
                    <th>クラス番号</th>
                    <th></th>
                </thead>
                <tbody>
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
                </tbody>
            </table>
        </div>
        <%-- テーブル定義後に初期化する性質上paramのscriptsとは別で定義する --%>
        <script>
            <%-- テーブル拡張のセットアップ --%>
            $(document).ready(function() {
                $("#studentTable").DataTable({
                    layout: {
                        topStart: "buttons",  <%-- 左上 - ボタン --%>
                        // topEnd: "search",  <%-- 右上 - 検索 --%>
                        //  bottomStart: "info",  <%-- 左下 - 情報 --%>
                        // bottomEnd: "paging"  <%-- 右下 - ページネーション --%>
                    },
                    // searchPanes: false,  <%-- SearchPanesを無効化 --%>
                    searching: false,  <%-- 検索 --%>
                    // info: false,  <%-- ページネーション件数を表示 --%>
                    // pageLength: 10,  <%-- 1ページごとの最大表示件数 --%>
                    // lengthChange: false,  <%-- 件数切り替えを非表示 --%>
                    <%-- ボタンのカスタマイズ --%>
                    buttons: [
                    {
                        extend: "copy",
                        text: "コピー",
                        exportOptions: {
                            columns: ":not(:eq(0))"  <%-- 選択列(1列目)以外 --%>
                        }
                    },
                    {
                        extend: "csvHtml5",
                        text: "CSV",
                        bom: true,  <%-- 文字化け対策 --%>
                        exportOptions: {
                            columns: ":not(:eq(0))"
                        }
                    },
                    {
                        extend: "excel",
                        text: "Excel",
                        exportOptions: {
                            columns: ":not(:eq(0))"
                        }
                    },
                    {
                        extend: "print",
                        text: "印刷",
                        exportOptions: {
                            columns: ":not(:eq(0))"
                        },
                        <%-- 文字サイズ調整 --%>
                        customize: function (win) {
                            $(win.document.body).css("font-size", "8pt");
                            $(win.document.body).find("table")
                            .addClass("compact")
                            .css("font-size", "inherit");
                        }
                    }
                    ],
                    columnDefs: [
                    
                    ],
                });
            });
        </script>
    </c:param>

</c:import>

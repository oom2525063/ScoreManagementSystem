<%-- 科目管理一覧JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:import url="/common/base.jsp">

	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">

		<div id="wrap_box">

			<h2 class="h3 mb-3 fw-bold bg-secondary bg-opacity-10 py-2 ps-3">
				科目管理
			</h2>

			<div class="text-end mb-3">
				<a href="SubjectCreate.action">新規登録</a>
			</div>

			<table class="table">

				<tr>
					<th>科目コード</th>
					<th>科目名</th>
					<th></th>
					<th></th>
				</tr>

				<c:forEach var="s" items="${list}">

					<tr>
						<td><c:out value="${s.cd}"></td>
						<td><c:out value="${s.name}"></td>

						<td>
							<a href="SubjectUpdate.action?cd=<c:out value='${s.cd}'>">
								変更
							</a>
						</td>

						<td>
							<a href="SubjectDelete.action?cd=<c:out value='${s.cd}'>">
								削除
							</a>
						</td>

					</tr>

				</c:forEach>

			</table>

		</div>

	</c:param>

</c:import>
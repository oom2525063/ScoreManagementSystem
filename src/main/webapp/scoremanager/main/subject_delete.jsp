<%-- 科目削除JSP --%>

<%@ page language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<%@ taglib prefix="c"
	uri="jakarta.tags.core" %>

<c:import url="/common/base.jsp">

	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="content">

		<div id="wrap_box">

			<h2 class="h3 mb-4 fw-bold bg-secondary bg-opacity-10 py-2 ps-3">
				科目情報削除
			</h2>

			<p>
				「${subject.name}[${subject.cd}]」を削除してもよろしいですか
			</p>

			<form action="SubjectDeleteExecute.action"
				method="post">

				<input type="hidden"
					name="cd"
					value="${subject.cd}">

				<button type="submit"
					class="btn btn-danger">

					削除

				</button>

			</form>

			<br>

			<a href="SubjectList.action">
				戻る
			</a>

		</div>

	</c:param>

</c:import>
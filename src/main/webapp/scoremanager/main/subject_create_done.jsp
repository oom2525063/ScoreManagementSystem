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

			<h2 class="h3 mb-4 fw-bold
				bg-secondary bg-opacity-10
				py-2 ps-3">

				科目情報登録

			</h2>

			<p class="text-center"
				style="background-color:#8cc3a9;">

				登録が完了しました

			</p>

			<br><br>

			<a href="SubjectCreate.action">
				戻る
			</a>

			<a style="margin-left:50px;"
				href="SubjectList.action">

				科目一覧

			</a>

		</div>

	</c:param>

</c:import>
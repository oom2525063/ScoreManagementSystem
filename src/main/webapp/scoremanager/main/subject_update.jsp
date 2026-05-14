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
				科目情報変更
			</h2>

			<form action="SubjectUpdateExecute.action"
				method="post">

				<!-- 科目コード -->
				<div class="mb-3">

					<label class="form-label">
						科目コード
					</label>

					<div class="form-control-plaintext">
						${subject.cd}
					</div>

					<input type="hidden"
						name="cd"
						value="${subject.cd}">

				</div>

				<!-- 科目名 -->
				<div class="mb-4">

					<label class="form-label">
						科目名
					</label>

					<input type="text"
						name="name"
						class="form-control"
						value="${subject.name}"
						placeholder="科目名を入力してください"
						required>

					<c:if test="${not empty error}">
						<div class="text-warning mt-1"
							style="font-size:14px;">

							${error}

						</div>
					</c:if>

				</div>

				<button type="submit"
					class="btn btn-primary">

					変更

				</button>

			</form>

			<br>

			<a href="SubjectList.action">
				戻る
			</a>

		</div>

	</c:param>

</c:import>
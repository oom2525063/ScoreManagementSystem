<%-- indexリダイレクトページ --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="ctx_path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script>
            // ログインページにリダイレクト
            location.href="${ctx_path}/scoremanager/Login.action";
        </script>
    </head>
    <body>

    </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>ユーザーIDと認証番号を入力してください</h3>
		<form:form action="./loginvalidate" method="post" modelAttribute="userloginmodel">
			<table>
				<tr>
					<th>id</th><td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<th>password</th><td><input type="password" name="pwd"/></td>
				</tr>
				<tr><td><input type="submit" value="ログイン"/></td><td><input type="reset"　value="取り消し"/></td></tr>
			</table>
		</form:form>
		${msg }
	</div>
</body>
</html>
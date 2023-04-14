<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<spring:url value="/resources/css/carinfo.css" var="carCss"/>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type ="text/css" href="${carCss }">
</head>
<%@ include file="/WEB-INF/views/menu_header.jsp" %>
<body>
	<h1>車種をお選びください！</h1>
	<div align="center" class="tbl1">
		<table>
			<tr><th><a href="./recom/orign?org=dom">国産車</a></th><td>国産車の製造業者を検索</td></tr>
			<tr><th><a href="./recom/orign?org=for">外車</a></th><td>外車の製造業者を検索</td></tr>
		</table>
	</div>
	<a href="./recomadd">車種情報を追加</a>
</body>
</html>
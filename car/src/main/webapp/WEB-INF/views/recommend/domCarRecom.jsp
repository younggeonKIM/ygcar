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
	<h1>国産車の全種類を見ることができます</h1>
	<div align="center" class="tbl1">
		<table>
			
		</table>
	</div>
</body>
</html>
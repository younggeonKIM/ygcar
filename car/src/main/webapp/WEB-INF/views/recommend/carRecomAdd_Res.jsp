<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<div align="center">
		<table>
			
				<tr><th>車名</th><th>製造業者</th>	<th>製造地</th><th>価格</th>
					<th>全長</th><th>全幅</th><th>全高</th>
					<th>総排気量</th><th>車両重量</th></tr>
			<c:forEach items="${addedCarRecom }" var="lis">
				<tr><td>${lis.autoName }</td><td>${lis.autoMaker }</td><td>${lis.origin }</td><td>${lis.price }</td>
					<td>${lis.overLength }</td><td>${lis.overWidth }</td><td>${lis.overHeight }</td>
					<td>${lis.totEmission }</td><td>${lis.vehWeight }</td></tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
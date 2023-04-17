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
	<h1>全種類のくるまを見ることができます</h1>
		<div align="center" class="tbl1">
			<form:form action="./recomadd/addexe" method="post" modelAttribute="carRecom">
				<table>
					<tr><th>車名</th><td><form:input path="autoName"/></td></tr>
					<tr><th>製造業者</th><td><form:input path="autoMaker"/></td></tr>
					<tr><th>製造地</th><td><form:input path="origin"/></td></tr>
					<tr><th>価格</th><td><form:input path="price"/></td></tr>
					<tr><th>全長</th><td><form:input path="overLength"/></td></tr>
					<tr><th>全幅</th><td><form:input path="overWidth"/></td></tr>
					<tr><th>全高</th><td><form:input path="overHeight"/></td></tr>
					<tr><th>総排気量</th><td><form:input path="totEmission"/></td></tr>
					<tr><th>車両重量</th><td><form:input path="vehWeight"/></td></tr>
				</table>
				<br/>
				<input type="submit" value="車追加"/>
			</form:form>
			
		</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div align="center">
	<h2>ご希望な消耗品の交換時期は何ですか</h2>
	<form:form action="/controller/findExpendIt" method="POST" modelAttribute="carMantenc">
		<form:select path="expendItName">
			<c:forEach items="${List }" var="li">
				<form:option value="${li }"></form:option>
			</c:forEach>
		</form:select>
		<input type="submit" value="この消耗品で"/>
	</form:form>
</div>
<div id="mantencCont">
	<jsp:include page="${mantenBody }"></jsp:include>
</div>
</body>
</html>
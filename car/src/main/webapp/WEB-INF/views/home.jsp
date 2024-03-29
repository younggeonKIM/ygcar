<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
<spring:url value="/resources/css/carhome.css" var="carCss"/>
<meta charset="UTF-8">
	<title>Home</title>
<link rel="stylesheet" type ="text/css" href="${carCss }">
</head>
<%@ include file="/WEB-INF/views/menu_header.jsp" %>
<body>
<div class="carInfo" align="center">
	<h1>
		車の情報統合システムにようこそ!
	</h1>
	<div class="para">
		<p>自動車のすべての情報が集まる車情報統合システムに来ました。<br/>
		当システムではお客様におすすめの車情報や最近変わった交通法規などいろんな情報を提供しております。<br/>
		自動車について詳しく知りたい方はぜひ当システムをご参考お願い致します。</p>
		
	</div>
	<div class="carimgs">
		<section>
			<div class="inner">
				<div class="hond_nvan">
					<div class="inner">
						<div class="title">HONDAの<br/>N-VAN</div>
					</div>
					<div class="hondnvan_wrap">
						<a href=""></a>
					</div>
				</div>
				<div class="toyota_prius">
					<div class="inner">
						<div class="title">トヨタの<br/>プリウス</div>
					</div>
					<div class="toyopri_wrap">
						<a href=""></a>
					</div>
				</div>
				<div class="nissan_serena">
					<div class="inner">
						<div class="title">NISSANの<br/>SERENA</div>
					</div>
					<div class="nissere_wrap">
						<a href=""></a>
					</div>
				</div>
			</div>
		</section>
	</div>
</div>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>

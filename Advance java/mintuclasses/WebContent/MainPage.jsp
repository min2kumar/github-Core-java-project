<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MintuKumar Edutech</title>
</head>
<body>
	<c:set var="value" value="${value }"></c:set>

	<c:if test="${value!=null}">
		<div id="header">
			<jsp:include page="Heading.jsp"></jsp:include>


		</div>
		<div id="main">
			<jsp:include page="carousel.jsp"></jsp:include>
		</div>
		<div id="footer">

			<jsp:include page="Footer.jsp"></jsp:include>
		</div>
	</c:if>

	<p>Unauthorised Access Please Login First</p>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${status eq 'user'}">
<%

response.sendRedirect("MainPage.jsp");

%>

</c:if>
<c:if test="${status ne 'admin' }">
<c:if test="${mode  eq 'yes' }">
<marquee  bgcolor="#C70039"><h1><strong><b>Website is On Maintanance Mode  Please Try After Some Times </b></strong></h1></marquee>
</c:if>
</c:if>

<c:if test="${status eq 'admin' }">

<a href="Handler?TOKEN=${1}" ><h1 style="text-align:center"	>PUT WEBSITES ON MAINTANANCE MODE</h1> </a> <br>
<br>
<br>
<br>
<br>
<a href="Handler?TOKEN=${2}"  ><h1 style="text-align:center"> NORMAL MODE</h1></a>


<c:if test="${msts!=null }">
<marquee  behavior="scroll" bgcolor="aqua">
<h1  style="color:red;">${msts}</h1>
</marquee>
</c:if>

</c:if>




</body>
</html>



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

<marquee  behavior="alternate"><h1>  please Note after Click On delete Your Account Will Be Permanently Deleted!!!!</h1></marquee>
<marquee  behavior="scroll" ><h2 style="color: #0b68a5">  After The Deletion Request You Will Be Redirect MainPage</h2></marquee>
<a href="Updel" > <h1  style="color: #a00c0c;" align="center">Delete My Account  </h1></a>


</c:if>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddBook Page</title>
</head>
<body>

<center>

<form action="Add"  method="post">
<table>

<c:if test="${bmsg!=null }">
<tr>
<td><h2>${bmsg}</h2></td>
</tr>
</c:if>
<%
HttpSession hs= request.getSession();
hs.setAttribute("bmsg","");
%>


<tr>
<td>Book Number</td>
<td><input type="number" name="t1" required="1"></td>
</tr>
<tr>
<td>Book name</td>
<td><input type="text" name="t2" required="1"></td>
</tr>
<tr>
<td>Author Name</td>
<td><input type="text" name="t3"  required="1"></td>
</tr>

<tr>
<td>Book Type</td>
<td><input type="text" name="t4"   required="1"></td>
</tr>
<tr>
<td>price</td>
<td><input type="number" name="t5"   required="1"></td>
</tr>
<tr>
<td>Link</td>
<td><input type="text" name="t6"   required="1"></td>
</tr>

<tr>
<td><input type="submit" value="Add"></td>
<td><input type="reset" value="Clear"></td>
</tr>

</center>

</body>
</html>
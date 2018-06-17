<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String d="";%>

<c:if test="${mmsg!='null' }">

<h2>${mmsg}</h2>
</c:if>
<%
Date date= new Date();
d=date.toString();

HttpSession hs= request.getSession();
hs.setAttribute("mmsg","");




%>
<c:if test="${status eq 'user' }">
<h2>Your Admin Name is-->> mintu</h2>
</c:if>

<center>
<form action="message"  method="post">


<table>

<tr>
<td>Respected  </td>
<td><input type="text"  name="t1"  > </td>
</tr> 
<tr>
<td>Write  Request / Complaint Here/Message</td>
<td><input type="text"  name="t2"   required="1"> </td>
</tr> 
<tr>
<td>Date And Time</td>
<td><input type="text"  name="t3"  value="<%=d%>"  readonly="readonly"> </td>
</tr> 
<br>
<br>
<tr>
<td><input  type="submit" value="Ok"> </td>
<td><input  type="reset" value="clear"> </td>
</tr>


</table>



</form>

</center>



</body>
</html>
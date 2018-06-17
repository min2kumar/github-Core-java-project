<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource  driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" 
                    url="jdbc:sqlserver://localhost:1433;databaseName=mintu"
                    user="sa"
                    password="faculty"
                      var="myjdbc"

 />




<sql:query var="data" dataSource="${myjdbc}">

select * from data where uname=?

<sql:param value="${name}"></sql:param>

</sql:query>

<c:if test="${umsg!=null}">
<h3>${umsg}</h3>
</c:if>




<c:forEach   var="row" items="${data.rows}">

<center>
<form action="Updel" method="post">
<table>

<tr>
<td>ID Number</td>
<td><input type="text"    value="${row.id}"  readonly="readonly"> </td>
</tr>
<tr>
<td>User name</td>
<td><input type="text"   name="t2"  value="${row.uname }"  readonly="readonly"> </td>
</tr>
<tr>
<td> Name</td>
<td><input type="text" name="t3"  value="${row.name}"  required="1"> </td>
</tr>
<tr>
<td> Email id</td>
<td><input type="text" name="t4" value="${row.email}"  required="1"> </td>
</tr>
<tr>
<td> College/School Name</td>
<td><input type="text" name="t5"  value="${row.csname}"  required="1"> </td>
</tr>
<tr>
<td> Mobile Number</td>
<td><input type="text" name="t6" value="${row.mobile}"  required="1"> </td>
</tr>
<tr>
<td>  Password</td>
<td><input type="text" name="t7"  value="${row.pwd}"  required="1"> </td>
</tr>
<tr>
<td><input  type="submit" value="Update"> </td>
<td> <input type="reset" value="Clear" > </td>
</tr>


</table>


</form>
</center>




</c:forEach>





</body>
</html>
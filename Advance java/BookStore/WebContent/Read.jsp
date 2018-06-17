<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message Read</title>
</head>
<body>
<sql:setDataSource  driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" 
                    url="jdbc:sqlserver://localhost:1433;databaseName=mintu"
                    user="sa"
                    password="faculty"
                      var="myjdbc"

 />

<sql:query var="data" dataSource="${myjdbc }">



select * from message where name=?
<sql:param   value="${name}"/>

</sql:query>



<center>
<table  border="1">
<tr>
<th>Sender</th>
<th>Message</th>
<th>Date</th>
<th>Action</th>

</tr>
<c:forEach var="row"  items="${data.rows}">
<tr>

<td>${row.sender}</td>
<td>${row.msg}</td>
<td>${row.date}</td>
<td><a href="message?date=${row.date}">Done</a></td>

</tr>


</c:forEach>

</table>


</center>



</body>
</html>
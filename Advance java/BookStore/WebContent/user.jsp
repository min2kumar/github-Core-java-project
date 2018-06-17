<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mk Book Store</title>
</head>
<body>
<sql:setDataSource  driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" 
                    url="jdbc:sqlserver://localhost:1433;databaseName=mintu"
                    user="sa"
                    password="faculty"
                      var="myjdbc"

 />
 
 <sql:query var="data" dataSource="${myjdbc}">

select * from data
 
 </sql:query>
 
<sql:query var="data2" dataSource="${myjdbc}">

select * from tempblock
 
 </sql:query>

<center>
<table border="1" bgcolor="#27f4a5">
<tr bgcolor="#dbd704">
<th>ID</th>
<th>User Name</th>
<th>Name</th>
<th>Email</th>
<th>College/School</th>
<th>Mobile Number</th>
<th>Password</th>
<th>Action</th>
<th>Block</th>
<th>UnBlock</th>
 </tr>
 <c:forEach  var="row" items="${data.rows }">
 
 <tr>
 <td>${row.id}</td>
 <td>${row.uname}</td>
 <td>${row.name}</td>
 <td>${row.email}</td>
 <td>${row.csname}</td>
 <td>${row.mobile}</td>
 <td>${row.pwd}</td>
  <td><a href="Updel?t1=${row.uname}" >delete</a>  </td>
  <td><a href="Block?t1= ${row.uname},block">block</a></td>
  <td><a href="Block?t1=${row.uname},un" >Unblock</a></td>
 </tr>
 
 
 </c:forEach>
 
</table>

</center>
<c:if test="${sts!=null }">
<marquee  behavior="scroll" bgcolor="aqua">
<h1  style="color:red;">${sts}</h1>
</marquee>
</c:if>



<center>
<table  border="1" bgcolor="#36db04">
<tr><th  bgcolor="#006cd8">Blocked UserName List</th> </tr>
<c:forEach  var="row" items="${data2.rows}">
<tr>
<td>${row.uname}</td> 
</tr>


</c:forEach>

</table>

</center>


</body>
</html>
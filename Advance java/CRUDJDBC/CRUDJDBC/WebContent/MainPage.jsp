<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource   driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
  url="jdbc:sqlserver://localhost:1433;databaseName=mintu"
  user="sa"
  password="faculty"
  var="myjdbc"
/>


<sql:query var="data" dataSource="${myjdbc}">


select * from info

</sql:query>

<c:set  var="flag1" value="${data.rows}"></c:set>

<c:if test="${flag1!=null}">
<center>
<table  border="1">
<tr>
<td> ID</td>
<td> Name</td>
<td> Department</td>
<td> Salary</td>
<td> Update|| Remove</td>
</tr>

<c:forEach var="row"  items="${data.rows}">
<tr>

<td>${row.id}</td>
<td>${row.name}</td>
<td>${row.dept}</td>
<td>${row.salary}</td>
<td><a href="MainPage.jsp?no=${row.id}">Update</a>||<a href="Delete?no=${row.id}">Remove</a></td>
</tr>

</c:forEach>



</table>





</center>

</c:if>


<!--This is a starting of add employee -->

<center>
<form action="Add"  method="post">
<table border="1">
<tr>
<td>ID Number is </td>
<td><input type="number" name="t1" >  </td>${msg}
</tr>
<tr>
<td>Enter Name</td>
<td><input  type="text"  name="t2"  required="1">  </td>
</tr>
<tr>
<td>Enter DepartMent</td>
<td><input type="text" name="t3" ></td>
</tr>
<tr>
<td>Enter a Salary</td>
<td> <input type="number"  name="t4"> </td>
</tr>
<tr>
<td><input type="submit"  value="Add"></td>
<td><input  type="reset"   value="Clear"></td>
</tr>





</table>

</form>
</center>

<c:set var="id"   value="${param.no}"></c:set>
<sql:query var="data" dataSource="${myjdbc}">


select * from info where id=?

<sql:param  value="${id}"/>

</sql:query>


<!--  this is an update section -->
<center>
<c:forEach var="row"  items="${data.rows}">

<form action="Edit"  method="post">
<table  border="1">
<tr>
<td>id</td>
<td><input  type="number" value="${id }"  name="t1"  readonly="readonly"></td>
</tr>
<tr>
<td>Name</td>
<td><input  type="text" value="${row.name}"  name="t2"  required="1"></td>
</tr>
<tr>
<td>Department</td>
<td><input  type="text" value="${row.dept }"  name="t3"  required="1"></td>
</tr>
<tr>
<td>Salary</td>
<td><input  type="number" value="${row.salary}"  name="t4"  required="1"></td>
</tr>
<tr>
<td> <input type="submit"  value="update"> </td>
<td> <input type="reset"  value="CLear The Value"  ></td>
</tr>


</table>
</form>


</c:forEach>


</center>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib  prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql"%>
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
select * from book  


</sql:query>

<center>
<table  border="1">
<tr>
<th>Book Number</th>
<th>Book Name</th>
<th>Author Name</th>
<th>Type Of Book</th>
<th>Price</th>
<th>Read The Book</th>

<c:if test="${status eq 'admin'}">
<th>Edit/Delete</th>
</c:if>
</tr>
<c:forEach var="row"  items="${data.rows}">
<tr>
<td>${row.id}</td>
<td>${row.name}</td>
<td>${row.author}</td>
<td>${row.price}</td>
<td>${row.btype}</td>
<td><a href="${row.link}" target="_blank" onmouseover="Please Click this Link Open Book In New Tab">open</a></td>


<c:if test="${status eq 'admin'}">

<td><a href="Delete?no=${row.id}">Delete</a>|| <a href="Display.jsp?num=${row.id}">Edit the Value</a></td>
</c:if>
</tr>
</c:forEach>
</table>
</center>

<c:set var="id" value="${param.num}"/> 
<sql:query var="data2" dataSource="${myjdbc}">

select * from book where id=?
<sql:param value="${id}"/>

</sql:query>

<c:forEach var="row1" items="${data2.rows}">
<center>
<form action="Delete" method="post">
<table  border="1" bordercolor="red">

<tr>
<td>Book Number</td>
<td><input type="number" name="t1"  readonly="readonly"  value="${row1.id }"></td>
</tr>
<tr>
<td>Book name</td>
<td><input type="text" name="t2"  value="${row1.name}" required="1"></td>
</tr>
<tr>
<td>Author Name</td>
<td><input type="text" name="t3"  value="${row1.author}" required="1"></td>
</tr>

<tr>
<td>Book Type</td>
<td><input type="text" name="t4"   value="${row1.btype}"   required="1"></td>
</tr>
<tr>
<td>price</td>
<td><input type="number" name="t5"  value="${row1.price}" required="1"></td>
</tr>
<tr>
<td>Link</td>
<td><input type="text" name="t6"  value="${row1.link}" required="1"></td>
</tr>
<tr>
<td><input style="font-size: medium; color:black;"  type="submit" value="Update  the Book" ></td>
</tr>
</table>
</form>
</center>

</c:forEach>



</body>
</html>
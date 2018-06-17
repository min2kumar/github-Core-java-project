<%@page import="Model.data"%>
<%@page import="com.sun.corba.se.impl.oa.poa.AOMEntry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <script type="text/javascript">
 

 
 
 </script>
</head>
<body>

<center>
<form action="Add">
<table>
<tr>
<td>id</td>
<td><input type="text" name="t1" required="1"></td>
</tr>
<tr>
<td>name</td>
<td><input type="text" name="t2"  required="1"></td>
</tr>
<tr>
<td>price</td>
<td><input type="number" name="t3"   required="1"></td>
</tr>
<tr>
<td><input type="submit" value="Add"></td>
<td><input type="reset" value="Clear"></td>
</tr>




</table>







</form>
</center>


	<br>
	<br>
	<br>
	<br>

<center>

<c:set var="datas" value="${datas}"></c:set>
<c:if test="${datas!=null }">

<table border=1>
<c:set  var="num" value="0"></c:set>
<th>ID Number</th>
<th>Name</th>
<th>Price</th>
<th>Delete/Edit</th>

<c:forEach  var="data" items="${datas}" >
<tr>
<td>${data.id}</td>
<td>${data.name}</td>
<td>${data.price}</td>
<td><a href="Delete?num=${num}"> delete</a> | <a href="Edit?num=${num}"> edit</a></td>
<c:set var="num" value="${num+1}"></c:set>
</tr>
</c:forEach>






</table>
</c:if>







<br>
<br>
<br>
 
<c:set var="value" value="${value}"></c:set>
<c:if test="${value==1 }">

<form action="Edit"  method="post">

<table>

<tr>
<td>ID</td>
<td><input type="text" value="${edit.id}"   readonly="readonly"  name="e1" ></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text"  value="${edit.name }"  name="e2"  required="1"></td>
</tr>
<tr>
<td>Price</td>
<td><input type="number" value="${edit.price }"  name="e3"  required="1">  </td>
</tr>
<tr>
<td><input type="submit" value="Update" onclick="clearf">   </td>
<td><input type="reset" value="Clear"></td>
</tr>



</table>





</form>

</c:if>

</center>
 
 

</body>
</html>
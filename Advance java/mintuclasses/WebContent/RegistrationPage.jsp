<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header">

<jsp:include page="basichead.jsp"></jsp:include>

</div>



<center>
<form  action="" method="post">
<table>

<tr><th> Register Here</th></tr>
<tr>
<td>Enter Your Name</td>
<td><input type="text" name="na" value="" required="0"></td>
</tr>
<tr>
<td>Enter Your Surname</td>
<td><input type="text" name="na" value="" required="0"></td>
</tr>
<tr>
<td>Enter Student Id</td>
<td><input type="text" name="na" value="" required="0"></td>
</tr>
<tr>
<td>Enter  Email Id</td>
<td><input type="text" name="na" value="" required="0"></td>
</tr>
<tr>
<td>Enter Mobile Number</td>
<td><input type="text" name="na" value="" required="0"></td>
</tr>
<tr>
<td>Enter Password </td>
<td><input type="text" name="na" value="" required="0"></td>
</tr>
<tr>
<td>Enter Branch location</td>
<td><input type="text" name="na" value="" required="0"></td>
</tr>
<tr>
<td><input  type="submit" value="Register"/></td>
<td><input type="reset" value="Clear"/></td>
</tr>



</table>



</form>





</center>

<div>

<jsp:include page="Footer.jsp"></jsp:include>
</div>


</body>
</html>
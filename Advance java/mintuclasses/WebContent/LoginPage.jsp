<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String msg=(String)request.getAttribute("msg");
if(msg!=null)
{
	out.println("<marquee>"+msg+"</marquee>");
}
%>

	<center>
		<form action="Login" method="post">
			<table>
    <tr>
    <th colspan="2"> Login Details  </th>
    
    
    </tr>
    <tr>
    <td>Login Id</td>
    <td><input type="text" name="li" value="" required="0"></td>
    </tr>
    <tr>
    <td>Password Id</td>
    <td><input type="password" name="pa" value="" required="0"></td>
    </tr>


<tr>
<td colspan="2"><input type="submit" name="submit" value="Login"/></td>
<td></td>
</tr>


			</table>





		</form>

	</center>






</body>
</html>
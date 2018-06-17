<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ForgetPassword Page</title>
</head>
<body>
	<center>
		<form action="Forget" method="get">
			<table>
			<tr>
					<td>Enter your User Name </td>
					<td><input type="text" name="t1" id="t1"></td>
				</tr>
				<tr>
					<td>Enter your mobile number</td>
					<td><input type="text" name="t2" id="t1"></td>
				</tr>
				<tr>
					<td>Enter your email id</td>
					<td><input type="email" name="t3" id=""></td>
				</tr>
				
				<td>
					<input type="submit"  value="Get my Password"> 
				</td>
			</table>


		</form>
		<h4> ${fmsg1}  </h4>
		<br>
		<br>
		
		
		
<form action="Forget" method="post">
	<table>
				<tr>
					<td>Enter your mobile number</td>
					<td><input type="text" name="t1" id="t1"></td>
				</tr>
				<tr>
					<td>Enter your email id</td>
					<td><input type="email" name="t2" id=""></td>
				</tr>
				
			<td>
					<input type="submit"  value="Get my UserName"> 
					
		</td>
		

			</table>
</form>
<h4> ${fmsg}  </h4>
<br>
<br>


	</center>
</body>
</html>
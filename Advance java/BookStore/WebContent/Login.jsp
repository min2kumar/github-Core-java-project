
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link href="	" media="screen" rel="stylesheet" />
<title>MintuKumar Book Store</title>
<style type="text/css">

body {margin:0;}

.navbar {
  overflow: hidden;
  background-color:#2BFC32;
  position: fixed;
  top: 0;
  width: 100%;
  font-size: small;
  font-variant: small-caps;
  font-weight: bolder;
   border-bottom-color: black;
   border-bottom-width: medium;

   

}




.navbar a:hover {
  background: #ddd;
  color: #D6147E;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}


</style>

</head>
<body>
 <nav>
    
  <div class="navbar">
    <div class="navbar-header">
      <a class="navbar-brand">MintuBookStore</a>
    </div>
  
    <ul class="nav navbar-nav" >
      <li class="active"><a href="MainPage.jsp" >Home</a></li>

 </ul>
 <ul class="nav navbar-nav navbar-right">
 <li><a href="Contact.jsp"  target="bodyf"><span class="glyphicon glyphicon-"></span>Contact Us</a></li>
  <li><a href="Register.jsp"  target="bodyf"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="Login.jsp"  ><span class="glyphicon glyphicon-user"></span> Login</a></li>
      </ul>
    
  </div>
</nav>
<br>
<br>
<br>
<center>
<form action="Login" method="post">
<table  style="font-size:large; ;">
<c:if test="${msg!=null }">

<tr><td><h2  style="color: purple;">${msg}</h2> </td> </tr>
</c:if>
<%
HttpSession hs= request.getSession();
hs.setAttribute("msg","");
%>

<tr>
<td>Enter Uername</td>
<td><input  type="text" name="t1"  required="1">  </td>
</tr>
<tr>
<td>Enter Password</td>
<td><input  type="pasword" name="t2"  required="1">  </td>
</tr>

<tr>
<td><input type="submit" value="Login"> </td>
<td><input type="reset" value="Clear"></td>

</tr>
<tr>
<td>
Don't Have an Account<a href="Register.jsp" style=" color: red">Click Here</a>
</td>
</tr>
<tr>
<td>
Forget USername Or Password<a href="Forget.jsp"  style=" color: green;">Click Here</a>
</td>
</tr>
</table>

</form>



</center>






</body>
</html>
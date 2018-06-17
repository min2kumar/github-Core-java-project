




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
<br>
<br>
<br>
<br>


<jsp:include page="filt.jsp"></jsp:include>
<marquee behavior="scroll"> <h1  style="color: red">you are blocked by administrator please Contact Admin  <h1></h1></marquee>
<marquee behavior="scroll"> <h1  style="color: aqua;">If You have Any Problem  Use Contact Us Page <h1></h1></marquee>
</body>
</html>
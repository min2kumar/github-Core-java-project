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
<body  style="height:1500px" STYLE="background-color:transparent">

	








 <nav>
    
  <div class="navbar">
    <div class="navbar-header">
      <a class="navbar-brand">MintuBookStore</a>
    </div>
  
    <ul class="nav navbar-nav" >
      <li class="active"><a href="MainPage.jsp" >Home</a></li>
      
      
       <c:if test="${status eq 'admin'}">
        <li><a href="Display.jsp" target="bodyf">Show Books</a></li>
        <li><a href="Add.jsp" target="bodyf">Add Books</a></li>
        <li><a href="Requestc.jsp" target="bodyf">Message</a></li>
        <li><a href="Read.jsp" target="bodyf">Read Messages</a></li>
        <li><a href="user.jsp" target="bodyf"> User Action</a></li>
        <li><a href="Notification.jsp" target="bodyf">Notice</a></li>
        <li><a href="Maintanance.jsp" target="bodyf">Maintanance</a></li>
       

      
       
       </c:if>
       
       <c:if test="${status eq 'user'}">
       <li><a href="Display.jsp" target="bodyf">Show Books</a></li>
       <li><a href="Read.jsp" target="bodyf">Read Message</a></li>
       <li><a href="Requestc.jsp" target="bodyf">Request/complain/Message</a></li>
       <li><a href="Update.jsp" target="bodyf">Update Details</a></li>
       <li><a href="Deleteac.jsp" target="bodyf">Delete Account Permanently</a></li>
       
       </c:if>
       
    </ul>
       
     <ul class="nav navbar-nav navbar-right">
     <c:if test="${status ne 'admin' }">
     <li><a href="Contact.jsp"  target="bodyf"><span class="glyphicon glyphicon-"></span>Contact Us</a></li>
     </c:if>
     <c:set  var="stt"  value="${user}"></c:set>
     <c:if test="${stt!=null}">
      <li><a href="filt.jsp" >Log Out</a></li>
     
      <li ><a><b style="color: red; border: thin;" >${user}</b></a></li>
     </c:if>
     <c:if test="${stt==null}">
        <li><a href="Register.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="Login.jsp"  ><span class="glyphicon glyphicon-user"></span> Login</a></li>
		 </c:if>
		
      </ul>
    
  </div>
</nav>
<br>
<br>
     <c:if test="${noti eq null }">
     <marquee behavior="alternate" bgcolor="#4DBDD9"><h3 style="color:#c60d48;"><strong>Welcome To MintuKumar Book Store</strong> <h3></marquee>
     </c:if>

    <c:if test="${noti!=null }">
      <c:set var="noti" value="${noti }" ></c:set>
    <marquee behavior="alternate" bgcolor="	#B6C5C8"><h3 style="color:teal;"><strong>${noti}</strong> <h3></marquee>
    </c:if>


     <iframe  src="Show.jsp" name="bodyf" width="100%" height="700"
        align="middle " ALLOWTRANSPARENCY="true" scrolling="auto"/>

 
 
</body>
</html>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>  
        $(document).ready(function()
        {
            $("#t2").keyup(function()
            {
               sendInfo(); 
            });
            
            $("#t6").keyup(function()
            {
               sendInfo2(); 
            });
        });
        function sendInfo()
        {
            var un=$("#t2").val();
            var url="uservalidator?un="+un;
            var xhttp= new XMLHttpRequest();
            xhttp.onreadystatechange=function()
            {
                if(xhttp.readyState==4)
                {
                    document.getElementById("sp").innerHTML=this.responseText;
                }
            };
            xhttp.open("GET",url);
            xhttp.send();
        }
       
        function sendInfo2()
        {
            var num=$("#t6").val();
            var url="uservalidator?num="+num;
            var xhttp= new XMLHttpRequest();
            xhttp.onreadystatechange=function()
            {
                if(xhttp.readyState==4)
                {
                    document.getElementById("sp1").innerHTML=this.responseText;
                }
            };
            xhttp.open("GET",url);
            xhttp.send();
        }
       
        
    </script>



</head>

<body>

<%HttpSession hs = request.getSession();

			try {

				int id = 1;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa",
						"faculty");

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select id from data  order by id");

				while (rs.next()) {
					String check = rs.getString(1);

					if (check.equalsIgnoreCase("U"+id)) 
					{

						id++;

					}else{
					    
					    break;
					}

				}
				hs.setAttribute("id", "U"+id);

			} catch (Exception e) {
				// TODO: handle exception
			}%>



<br>
<br>
<br>
<br>
<br>


<c:if test="${rmsg!=null}">
<h1>${rmsg}</h1>

</c:if>

<%
HttpSession rm= request.getSession();
rm.setAttribute("rmsg","");
%>



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
<form action="Register"  method="post">
<table>
<tr>
<td>ID Number</td>
<td><input type="text" name="t1"  value="${id}"  readonly="readonly"> </td>
</tr>
<tr>
<td>Enter user Name(Without Space)</td>
<td><input type="text" name="t2" id="t2"> <sapn  id="sp"  style="color:red"> </span> </td>
</tr>
<tr>
<td>Enter name </td>
<td><input type="text" name="t3"> </td>
</tr>
<tr>
<td>Enter Email id</td>
<td><input type="email" name="t4"> </td>
</tr>
<tr>
<td>Enter College/School Name</td>
<td><input type="text" name="t5"> </td>
</tr>
<tr>
<td>Enter Mobile Number</td>
<td><input type="number" name="t6"  id="t6"> <sapn  id="sp1"  style="color:red"> </span> </td>
</tr>
<tr>
<td>Enter  Password</td>
<td><input type="text" name="t7"> </td>
</tr>
<tr>
<td><input  type="submit" value="Register"> </td>
<td> <input type="reset" value="Clear" > </td>
</tr>
<tr>
<td>ALready have A Account<a href="Login.jsp"  style="color:orange;">Click Here</a></td>

</tr>
</table>

</form>
</center>





</body>
</html>
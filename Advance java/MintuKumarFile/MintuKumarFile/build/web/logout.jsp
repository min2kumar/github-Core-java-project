<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body bgcolor="85e0e0">
        <form action="LogoutServlet" method="post">
            <center>
            <h1 style="color: red">Thank You !!</h1>
            <h2 style="color: yellow">Visit Again..... </h2>
            <h3><%
                out.print("You are successfully logged out!");  
            %>
            </h3>  
            </centere>
        </form>
    </body>
</html>

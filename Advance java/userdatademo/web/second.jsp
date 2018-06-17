<%-- 
    Document   : second
    Created on : 5 Dec, 2017, 6:04:43 PM
    Author     : Mintukumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
       
        <h1>hello <% out.println(request.getAttribute("na"));%></h1>
        <h1>gender- -- <% out.println(request.getAttribute("ge"));%></h1>
        <h1>hobbies-- <% out.println(request.getAttribute("na"));%></h1>
    </body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome 1 Page</title>
    </head>
    <body bgcolor="85e0e0">
    <center>
        <h1>NAME IS --  ${key.name}</h1>
            <h1>MOBILE NO IS--${key.mobile} </h1>
            <form action="LogoutServlet" method="post">
            <table>
                <tr>
                    <td><input type="submit" value="Logout"/></td>
                </tr>
            </table>
            </form>
    </center>
        
    </body>
</html>

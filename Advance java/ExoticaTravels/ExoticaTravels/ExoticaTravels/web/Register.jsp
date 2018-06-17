<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <Center>
        <h1>Registration Page</h1>
        <form action="RegistarServlet" method="post">
            <table Border="1">
                <tr>
                    <td>Enter First Name:</td>
                    <td><input type="text" name="f"/></td>
                </tr>
                 <tr>
                    <td>Enter Last Name:</td>
                    <td><input type="text" name="l"/></td>
                </tr>
                 <tr>
                    <td>Enter DOB:</td>
                    <td><input type="text" name="d"/></td>
                </tr>
                 <tr>
                    <td>Enter Email Id:</td>
                    <td><input type="text" name="e"/></td>
                </tr>
                 <tr>
                    <td>Enter Contact No:</td>
                    <td><input type="text" name="c"/></td>
                </tr>
                <tr>
                    <td>Enter Id:</td>
                    <td><input type="text" name="i"/></td>
                </tr>
                 <tr>
                    <td>Enter Password:</td>
                    <td><input type="password" name="p"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
            </table>
        </form>
    </Center>
    </body>
</html>

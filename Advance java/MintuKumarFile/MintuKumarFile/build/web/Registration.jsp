
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>

        
        
        
        
        
        
    </head>
    
    <body bgcolor="85e0e0">
        
    <center> 
        
        <h1> Welcome To Registration Page</h1>
        <form action="RegistrationServlet" method="post">
            <table border="1" >
                <tr>
                    <td> Enter The First Name</td>
                    <td><input type="text" name="name" required=""/></td>
                </tr>
                <tr>
                    <td>Enter the Mobile no</td>
                    <td><input type="text" name="mobile" required=""/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Register"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
                
            </table>
                <img src="Images/1448111101_slide6.jpg" alt=""/>
                
        </form>
    </body>
</html>

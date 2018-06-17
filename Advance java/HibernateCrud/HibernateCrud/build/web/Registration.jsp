<%-- 
    Document   : Registration
    Created on : 7 Jun, 2018, 4:48:49 PM
    Author     : NIIT-MR-11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
    <center>
        <h1> REgistration Page</h1>
        <form  action="/Reg" method="post">
            <table>
                <tr>
                    <td>Enter Student Id number</td>
                    <td><input  type="number" name="sid" > </td>
                    
                </tr>
                <tr>
                    <td>Enter Your Name</td>
                    <td><input  type="textt" name="sname"> </td>
                    
                </tr>
                <tr>
                    <td>Enter Your Standard</td>
                    <td><input type="number" >  </td>
                    
                </tr>
                <tr>
                    <td>Enter Your School/ College Name</td>
                    <td><input type="text"></td>
                    
                </tr>
                <tr>
                    <td><input  type="submit"  value="Register Student"> </td>
                    <td><input type="reset"  value=" Reset Student"> </td>
                    
                </tr>
               
                
                
            </table>
            
            
            
            
        </form>
        
        
    </center>
    </body>
    
</html>

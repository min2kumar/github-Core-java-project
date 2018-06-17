package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

@WebServlet("/Forget")
public class Forget extends HttpServlet {
String user,mobile,email,password;
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException 
    {
               
	
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	            PreparedStatement ps=  con.prepareStatement("select email,mobile,pwd from data where uname=?");
	            ps.setString(1,request.getParameter("t1"));
	           ResultSet rs= ps.executeQuery();
	          if(rs.next())
	          {
	             email=rs.getString(1);
	             mobile=rs.getString(2);
	             password=rs.getString(3);
	             if(email.equalsIgnoreCase(request.getParameter("t3"))&& mobile.equalsIgnoreCase(request.getParameter("t2")))
	             {
	        	 request.setAttribute("fmsg1","Your Password is----*>>"+password);
		             RequestDispatcher rd= request.getRequestDispatcher("Forget.jsp");
		             rd.forward(request, response);
	        	 
	             }else
	             {
	        	 request.setAttribute("fmsg1","Data Mismatch");
		             RequestDispatcher rd= request.getRequestDispatcher("Forget.jsp");
		             rd.forward(request, response);
	        	 
	             }
	             
	              
	          }else
	          {
	             request.setAttribute("fmsg1","Username Not Found");
	             RequestDispatcher rd= request.getRequestDispatcher("Forget.jsp");
	             rd.forward(request, response);
	          }
	    
	    
	} catch (Exception e) {
	    // TODO: handle exception
	}
	
	
	
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException 
    {
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	            PreparedStatement ps=  con.prepareStatement("select email,uname from data where mobile=?");
	            ps.setString(1,request.getParameter("t1"));
	           ResultSet rs= ps.executeQuery();
	          if(rs.next())
	          {
	             email=rs.getString(1);
	             user=rs.getString(2);
	             if(email.equalsIgnoreCase(request.getParameter("t2")))
	             {
	        	 request.setAttribute("fmsg","Your UserName is---**>>"+user);
		             RequestDispatcher rd= request.getRequestDispatcher("Forget.jsp");
		             rd.forward(request, response);
	        	 
	             }else
	             {
	        	 request.setAttribute("fmsg","Data Mismatch");
		             RequestDispatcher rd= request.getRequestDispatcher("Forget.jsp");
		             rd.forward(request, response);
	        	 
	             }
	             
	              
	          }else
	          {
	             request.setAttribute("fmsg"," No Account Found Associated With This Number");
	             RequestDispatcher rd= request.getRequestDispatcher("Forget.jsp");
	             rd.forward(request, response);
	          }
	    
	    
	} catch (Exception e) {
	    // TODO: handle exception
	}
	
	
	
	
	
	
	
	
	
    }

}

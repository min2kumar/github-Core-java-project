package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Target;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.data;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
    
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    HttpSession hs = request.getSession();
	    PrintWriter out= response.getWriter();
	    data a= new data();
		a.setId(request.getParameter("t1"));
		a.setUname(request.getParameter("t2"));
		a.setName(request.getParameter("t3"));
		a.setEmail(request.getParameter("t4"));
		a.setCsname(request.getParameter("t5"));
	        a.setMobile(request.getParameter("t6"));
	        a.setPwd(request.getParameter("t7"));
	        
	        
	        
	        try {
	           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	            PreparedStatement ps=  con.prepareStatement("insert into data values(?,?,?,?,?,?,?)");
	            ps.setString(1,a.getId());
	            ps.setString(2, a.getUname());
	            ps.setString(3, a.getName());
	            ps.setString(4, a.getEmail());
	            ps.setString(5, a.getCsname());
	            ps.setString(6,a.getMobile());
	            ps.setString(7, a.getPwd());
	            
	            ps.executeUpdate();
	              
	           
	          
	    	
	    	     hs.setAttribute("msg", "Registered Successfully");
	    	     response.sendRedirect("Login.jsp");
		} catch (Exception e) {
		    
		    
		   
		    hs.setAttribute("rmsg", "Not Registered data Is Not Unique");
		    response.sendRedirect("Register.jsp");
		 
		  
		}
	       
	    
	}

}

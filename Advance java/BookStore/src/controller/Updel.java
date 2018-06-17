package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.data;


@WebServlet("/Updel")
public class Updel extends HttpServlet {
    PrintWriter out;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{       String user="";
	 HttpSession hs= request.getSession();
	 out= response.getWriter();
	          
	if(request.getParameter("t1")!=null)
	{
	  user=request.getParameter("t1"); 
	}else 
	{
	    user=hs.getAttribute("name").toString();
	}
		 
	   
	  
	    try {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	            PreparedStatement ps=  con.prepareStatement("delete from data where uname=?");
		   
	            ps.setString(1,user);
		    ps.executeUpdate();
		    if(request.getParameter("t1")!=null)
		    {
		      response.sendRedirect("user.jsp");
		    }else {
		    response.sendRedirect("filt.jsp");
		    }
	    } catch (Exception e) {
		// TODO: handle exception
	    }
	    
	    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	    
	     out= response.getWriter();
	    data a= new data();
		a.setUname(request.getParameter("t2"));
		a.setName(request.getParameter("t3"));
		a.setEmail(request.getParameter("t4"));
		a.setCsname(request.getParameter("t5"));
	        a.setMobile(request.getParameter("t6"));
	        a.setPwd(request.getParameter("t7"));
	        
	        
	        
	        try {
	           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	            PreparedStatement ps=  con.prepareStatement("update data  set name=?,email=?,csname=?,mobile=?,pwd=?  where uname=? ");
	            
	            ps.setString(1, a.getName());
	            ps.setString(2, a.getEmail());
	            ps.setString(3, a.getCsname());
	            ps.setString(4,a.getMobile());
	            ps.setString(5, a.getPwd());
	            ps.setString(6, a.getUname());
	            
	            ps.executeUpdate();
	            request.setAttribute("umsg", "updated successfully");
	              RequestDispatcher rd= request.getRequestDispatcher("Update.jsp");
	              
	              rd.forward(request, response);
		} catch (Exception e) {
		    
		    
		  out.println("Error Occured While Updating");
		 
		  
		}
	    
	    
	    
		
	}

}

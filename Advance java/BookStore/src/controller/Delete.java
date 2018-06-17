package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("no"));
		PrintWriter out=response.getWriter();
		
		
		try {
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa",
			    "faculty");
		    PreparedStatement ps = con.prepareStatement("delete from book where id=?");	
		    ps.setInt(1, id);
		    ps.executeUpdate();
		    
		    response.sendRedirect("Display.jsp");
		    
		    
		} catch (Exception e) {
		    // TODO: handle exception
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	    int id=Integer.parseInt(request.getParameter("t1"));
	  
		PrintWriter out=response.getWriter();
		
		
		try {
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa",
			    "faculty");
		    PreparedStatement ps = con.prepareStatement("update book set name=?, author=?,btype=?,price=?,link=? where id=?");	
		   ps.setString(1,request.getParameter("t2"));
		   ps.setString(2,request.getParameter("t3"));
		   ps.setString(3,request.getParameter("t4"));
		   ps.setString(4,request.getParameter("t5"));
		   ps.setString(5,request.getParameter("t6"));
		  
		    
		    
		    ps.setInt(6, id);
		    ps.executeUpdate();
		    
		    response.sendRedirect("Display.jsp");
		    
		    
		} catch (Exception e) {
		    // TODO: handle exception
		}
	    
	    
	    
	    
	    
	    
	    
	}

}

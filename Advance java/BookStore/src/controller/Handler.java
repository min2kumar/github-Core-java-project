package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Handler")
public class Handler extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   	PrintWriter out = response.getWriter();
	   	HttpSession hs= request.getSession();
	   	
	   	try {
	   	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
			
			if(request.getParameter("TOKEN").equals("1"))
		   	{
			    PreparedStatement ps = con.prepareStatement("insert into maintain values(?)");
				ps.setString(1,"yes");
				ps.executeUpdate();
				hs.setAttribute("msts", "Website put on Maintanance Mode Successfully");
			   	
		   	    
		   	}else
		   	{
		   	    
		   	 PreparedStatement ps = con.prepareStatement("delete from  maintain");
		   	 ps.executeUpdate();
		   	
		   	 
		   	
		            hs.setAttribute("msts", "NORAMAL MODE ACTIVATED SUCCESFULLY");
		            out.print("normal");
			   	
		   	}
			
			response.sendRedirect("Maintanance.jsp");
			
		} catch (Exception e) 
	   	{
		    
		    hs.setAttribute("msts", "Already in Maintanance Mode");
		   response.sendRedirect("Maintanance.jsp");
		}
	   	
	   	
	   	
	   	
	   	
	   	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    String noti = request.getParameter("t4");
	        
		HttpSession hs = request.getSession();
		if (noti.equalsIgnoreCase("reset")) {
		   hs.removeAttribute("noti");
		   response.sendRedirect("MainPage.jsp");
		} else if (noti != null) {
		   hs.setAttribute("noti", noti);
		   response.sendRedirect("MainPage.jsp");
		}

		
	}

}

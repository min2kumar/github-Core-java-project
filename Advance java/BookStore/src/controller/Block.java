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
import javax.servlet.http.HttpSession;


@WebServlet("/Block")
public class Block extends HttpServlet {

    /*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	     PrintWriter out=response.getWriter();
	   String name=request.getParameter("t1");
	   	try {
	   	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
			PreparedStatement ps = con.prepareStatement("insert into tempblock values(?)");
			ps.setString(1, name);
			ps.executeUpdate();
			
		    response.sendRedirect("user.jsp");
	   	    
	   	    
		    
		} catch (Exception e) {
		   out.println(e.getMessage());
		}
	   	
	   	
	}

	*/
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	 
	    HttpSession hs = request.getSession();
	    PrintWriter out= response.getWriter();
	   
	  String  temp=request.getParameter("t1");

	 String split[]=temp.split(",");
	  
	    out.print(split[0]);
	    out.print(split[1]);
	    String uname=split[0].trim();
	   
	    
	   try {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
			
			
			if(split[1].equalsIgnoreCase("block"))
			{
			    PreparedStatement ps = con.prepareStatement("insert into tempblock values(?)");
				ps.setString(1, uname);
				ps.executeUpdate();
				hs.setAttribute("sts", "blocked UserName----"+uname);
				
			    
			}else
			{
			    PreparedStatement ps = con.prepareStatement("delete from tempblock where uname=?");
				ps.setString(1, uname);
				ps.executeUpdate();
				hs.setAttribute("sts","");
				
				
			}
			
			response.sendRedirect("user.jsp");
		
			
		
	    } catch (Exception e) 
	    {
		hs.setAttribute("sts","Already Blocked");
		response.sendRedirect("user.jsp");
	    }
	    
	    
	}

}

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

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{   
	    
	    
	    HttpSession hs= request.getSession();
	    hs.removeAttribute("bmsg");
	    PrintWriter out = response.getWriter();
	    
	    
	    try {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	            PreparedStatement ps=  con.prepareStatement("insert into book values(?,?,?,?,?,?)");
	            ps.setInt(1, Integer.parseInt(request.getParameter("t1")));
	            ps.setString(2, request.getParameter("t2"));
	            ps.setString(3, request.getParameter("t3"));
	            ps.setString(4, request.getParameter("t4"));
	            ps.setInt(5, Integer.parseInt(request.getParameter("t5")));
	            ps.setString(6, request.getParameter("t6"));
	        
	            ps.executeUpdate();
	            hs.setAttribute("bmsg", "Book Added Successfully");
	            response.sendRedirect("Add.jsp");
		
	    } catch (Exception e) 
	    {
	out.println(e.getMessage());
		
		
		hs.setAttribute("bmsg", "This Book is Already Exist ");
		response.sendRedirect("Add.jsp");
	    }
	
	    
	    
	}

}

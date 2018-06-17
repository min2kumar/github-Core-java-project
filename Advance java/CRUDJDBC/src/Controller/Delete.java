package Controller;

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

import com.mysql.jdbc.Driver;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	  int i=Integer.parseInt(request.getParameter("no"));
	    PrintWriter out= response.getWriter();
	    out.println(request.getParameter("no"));
	  
	  try {
	       Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	      PreparedStatement ps=  con.prepareStatement("delete  from info where id=?");     
	      ps.setInt(1, i);
	      ps.executeUpdate();
	      
	   response.sendRedirect("MainPage.jsp");
	} catch (Exception e) {
	    // TODO: handle exception
	}
	    
	    
	    
	    
	    
	    
	}

}

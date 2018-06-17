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

import model.Info;
import sun.java2d.pipe.RenderQueue;


@WebServlet("/Edit")
public class Edit extends HttpServlet {
	
  
	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	   Info i = new Info();
	   i.setId(Integer.parseInt(request.getParameter("t1")));
		i.setName(request.getParameter("t2"));
		i.setDept(request.getParameter("t3"));
		i.setSalary(Integer.parseInt(request.getParameter("t4")));
		
		try
		{
		    Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
		  PreparedStatement ps=   con.prepareStatement("update info set name=?,dept=?,salary=? where  id=?");
		 
		  ps.setString(1, i.getName());
		  ps.setString(2,i.getDept());
		  ps.setInt(3, i.getSalary());
		  ps.setInt(4,i.getId());
		  ps.executeUpdate();
		  
		  response.sendRedirect("MainPage.jsp");
		    
		    
		} catch (Exception e) {
		   
		}
	    
	    
	    
	    
	    
	}

}

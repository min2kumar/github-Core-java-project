package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Info;


@WebServlet("/Add")
public class Add extends HttpServlet {
	

	
	Info i;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		i=new Info();
		i.setId(Integer.parseInt(request.getParameter("t1")));
		i.setName("t2");
		i.setDept("t3");
		i.setSalary(Integer.parseInt(request.getParameter("t4")));
		
		try
		{
		    Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
		  PreparedStatement ps=   con.prepareStatement("insert into info values(?,?,?,?)");
		  ps.setInt(1,i.getId());
		  ps.setString(2, i.getName());
		  ps.setString(3,i.getDept());
		  ps.setInt(4, i.getSalary());
		  ps.executeUpdate();
		  HttpSession hs=request.getSession();
		  hs.removeAttribute("msg");
		  response.sendRedirect("MainPage.jsp");
		    
		    
		} catch (Exception e) 
		{   
		 HttpSession hs=request.getSession();
		 hs.setAttribute("msg", "This id Number is Already Registered");
		 response.sendRedirect("MainPage.jsp");
		}
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

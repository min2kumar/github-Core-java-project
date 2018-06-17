package controller;

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

@WebServlet("/message")
public class message extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	try {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	         PreparedStatement ps = con.prepareStatement("delete from message where date=?");
	       ps.setString(1, request.getParameter("date"));
	       ps.executeUpdate();
	    
	    response.sendRedirect("Read.jsp");
	    
	    
	} catch (Exception e) {
	    // TODO: handle exception
	}
	
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	
	HttpSession hs = request.getSession();
	
	try {

	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa",
		    "faculty");
	    PreparedStatement ps = con.prepareStatement("insert into message values(?,?,?,?)");
	    ps.setString(1, hs.getAttribute("name").toString());
	    ps.setString(2, request.getParameter("t1"));
	    ps.setString(3, request.getParameter("t2"));
	    ps.setString(4, request.getParameter("t3"));
	    ps.executeUpdate();
	    hs.setAttribute("mmsg","Message Send Succesfully");
	    response.sendRedirect("Requestc.jsp");
            
	} catch (Exception e) {
	    hs.setAttribute("mmsg","Something Happend Wrong");
	    response.sendRedirect("Requestc.jsp");
	}

    }

}

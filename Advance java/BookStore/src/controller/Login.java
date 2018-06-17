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

import model.data;

@WebServlet("/Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	data a = new data();
	PrintWriter out = response.getWriter();

	a.setUname(request.getParameter("t1"));
	a.setPwd(request.getParameter("t2"));
	HttpSession hs = request.getSession();
	
	
	
	
	

	if (a.getUname().equalsIgnoreCase("mintu") && a.getPwd().equals("raj")) 
	{
	    hs.setAttribute("status", "admin");
	    hs.setAttribute("user", "Admin--"+a.getUname());
	    hs.setAttribute("name",a.getUname());
	    response.sendRedirect("MainPage.jsp");
	} else {

	    try {
		
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
		Statement st= con.createStatement();
		ResultSet ms=st.executeQuery("select * from maintain ");
		if(ms.next())
		{
		  
		   hs.setAttribute("mode", "yes");
		   response.sendRedirect("Maintanance.jsp"); 
		   
		}else
		{

			PreparedStatement  pn = con.prepareStatement(" select * from tempblock where uname=?");
			
			pn.setString(1, a.getUname());
			ResultSet rd=pn.executeQuery();
			if(rd.next())
			{
			    response.sendRedirect("Anyerror.jsp");
			}else
			{
			    PreparedStatement ps = con.prepareStatement("select pwd from data where uname=?");
				ps.setString(1,a.getUname());
				ResultSet rs = ps.executeQuery();
				if (rs.next()) 
				{
				    String pwd = rs.getString(1);
				    
				    if (pwd.equals(a.getPwd())) 
				    {    
					hs.setAttribute("status", "user");
					hs.setAttribute("user","User--"+a.getUname());
					 hs.setAttribute("name",a.getUname());
					response.sendRedirect("MainPage.jsp");

				    }else
				    {
					hs.setAttribute("msg", "UserName  or Password Wrong");
					response.sendRedirect("Login.jsp");
				    }

				}else
				{
				    hs.setAttribute("msg", "UserName  or Password Wrong");
					response.sendRedirect("Login.jsp");
				}
			}
			
			
			
			
			
			
		}
		
		
		

	    } catch (Exception e) 
	    {
		hs.setAttribute("msg", "");
		response.sendRedirect("Login.jsp");
		
		
		
	    }

	}

    }

}

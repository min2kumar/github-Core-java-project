package validation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/uservalidator")
public class uservalidator extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    String suggest, mobile;
	    PrintWriter out= response.getWriter();
	   // String username="mintu";
	  //  String Mobile="8655387871";
	String username=request.getParameter("un");
	if(username!=null)
	{
	     suggest=username+username.length();
	}else
	{
	    suggest="";
	}
	
	 mobile=  request.getParameter("num");	
	    
		  
	    try {
		
	
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            Connection con =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mintu", "sa", "faculty");
	           Statement st= con.createStatement();
	            ResultSet rs= st.executeQuery("select uname,mobile from data");
	             while(rs.next())
	             {
	        	String u=rs.getString(1);
	        	String m=rs.getString(2);
	        	
	        	 if(username!=null)
	        	{
	        	if(u.equalsIgnoreCase(username))
	        	{
	        	  
	        	    
	        	    if(u!=suggest)
	        	    {
	        		 out.println(" Already taken try this-------->"+suggest);
	        	    }else
	        	    {
	        		out.println(" Already taken------------->"+suggest+"mk");
	        	    }
	        	}else
	        	{
	        	 out.print("");
	        	}
	        	
	        	}
	        	
	        	
	        	if(mobile!=null)
	        	{
	        	
	        	   if(m.equalsIgnoreCase(mobile))
	        	   {
	        	       out.println(" This Mobile Number is Already Registered ");
	        	   }else
	        	   {
	        	       out.print("");
	        	   }
	        	   
	        	}
	        	
	        	}
	        	
	        	
	        	
	        
	             
		
		
		
	    } catch (Exception e) {
		// TODO: handle exception
		  out.println(e);
	    }
	    
	    
	    
	}

	
	

}

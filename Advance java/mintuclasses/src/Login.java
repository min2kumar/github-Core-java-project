

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	
	RequestDispatcher rd;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if(request.getParameter("li").equalsIgnoreCase("mintu"))
		{
			HttpSession hs= request.getSession();
			hs.setAttribute("value", "login");
			 rd= request.getRequestDispatcher("MainPage.jsp");
			rd.forward(request, response);
		}else
		{   
			request.setAttribute("msg", "pleaser provide Corrent Details");
			rd=request.getRequestDispatcher("LoginPage.jsp");
			rd.forward(request, response);
		}
		
		
		
		
	}

}

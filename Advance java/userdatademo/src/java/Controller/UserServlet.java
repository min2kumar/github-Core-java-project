
package Controller;

import Model.Details;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserServlet", urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        Details d= new  Details();
        d.setName(request.getParameter("na"));
        d.setDob(request.getParameter("do"));
        d.setColor(request.getParameter("co"));
        d.setGender(request.getParameter("ge"));
        d.setHobbies(request.getParameterValues("ho"));
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
        if(d.getName().equalsIgnoreCase("mintu"))
        {
            out.print("redirecting please wait");
                RequestDispatcher r= request.getRequestDispatcher("first.html");
                        r.forward(request, response);
                }else
        {
            request.setAttribute("na", d.getName());
            request.setAttribute("ge", d.getGender());
            request.setAttribute("ho", d.getHobbies());
                RequestDispatcher r= request.getRequestDispatcher("second.jsp");
                        r.forward(request, response);
                        
        }
        
        
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
      
    }
    
}

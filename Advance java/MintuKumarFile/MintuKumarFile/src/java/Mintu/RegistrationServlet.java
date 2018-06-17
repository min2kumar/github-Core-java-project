package Mintu;

 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet 
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String name,mobile;
        
        name=request.getParameter("name");
        mobile=request.getParameter("mobile");
//       
        writeObject(name,mobile);
        
        UserDetails obj=new UserDetails(name,mobile);
        
        HttpSession session= request.getSession();
        session.setAttribute("key", obj);
        
        response.sendRedirect("Welcome.jsp");
                             
    }
    private void writeObject(String name,String mobile)
    {
        
        try(FileWriter fw=new FileWriter("D:\\mintu\\E.txt", true);
                BufferedWriter bw=new BufferedWriter(fw))
            {
                bw.write(name+"-"+mobile);
                bw.newLine();
            }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

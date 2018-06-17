package Mintu;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    UserDetails obj = new UserDetails();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name, mobile;

        name = request.getParameter("name");
        mobile = request.getParameter("mobile");

        HttpSession session = request.getSession();

        if (readObject(name, mobile)) {
            session.setAttribute("key", obj);
            response.sendRedirect("Welcome1.jsp");
        } else {
            response.sendRedirect("Error.jsp");
        }

    }

    private boolean readObject(String name, String mobile) {
        try (FileReader fr = new FileReader("D:\\mintu\\E.txt");
                BufferedReader br = new BufferedReader(fr)) {
            String s = "";
            while ((s = br.readLine()) != null) {
                String[] data = s.split("-");
                if (data[0].equalsIgnoreCase(name) || data[1].equalsIgnoreCase(mobile)) {
                    obj = new UserDetails(data[0], data[1]);
                    return true;

                }

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}

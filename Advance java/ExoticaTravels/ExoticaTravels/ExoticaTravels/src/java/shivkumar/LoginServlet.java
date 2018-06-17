package shivkumar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id, pass;

        id = request.getParameter("i");
        pass = request.getParameter("p");

        boolean found = false;
        try (FileReader fr = new FileReader("D://shiv//a.txt");
                BufferedReader br = new BufferedReader(fr)) {
            String s = "";
            while ((s = br.readLine()) != null) {
                String[] data = s.split("-");
                if (data[5].equals(id) && data[6].equals(pass)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (found) {

            response.sendRedirect("welcome.jsp");
        } else {

            response.sendRedirect("Error.jsp");
        }
    }

}

package shivkumar;

import com.sun.xml.ws.security.opt.impl.util.BufferedStreamWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistarServlet", urlPatterns = {"/RegistarServlet"})
public class RegistarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fname, lname, dob, con, email, id, pass;

        fname = request.getParameter("f");
        lname = request.getParameter("l");
        dob = request.getParameter("d");
        con = request.getParameter("e");
        email = request.getParameter("c");
        id = request.getParameter("i");
        pass = request.getParameter("p");

        try (FileWriter fr = new FileWriter("D:\\shiv\\a.txt", true);
                BufferedWriter bw = new BufferedWriter(fr)) {
            bw.write(fname + "-" + lname + "-" + dob + "-" + email + "-" + con + "-" + id + "-" + pass);
            bw.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        response.sendRedirect("welcome.jsp");
    }

}

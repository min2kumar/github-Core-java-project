/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mintukumar
 */
@WebServlet(name = "page3", urlPatterns = "/mintu3")
public class Page3 extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession hs = req.getSession(false);
        String name =(String)hs.getAttribute("na");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("welcome again"+name);
        
        out.print("<a  href='mintu1'>GO to Home</a>");
        
    }
    
}

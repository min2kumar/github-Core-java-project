/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import StudentDaoimpl.StudentDaoimpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NIIT-MR-11
 */
@WebServlet(name = "Reg", urlPatterns = {"/Reg"})
public class Reg extends HttpServlet {


Student  s= new Student();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    
       
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        s.setSid(Integer.parseInt(request.getParameter("sid")));
        s.setSname(request.getParameter("sname"));
        s.setSclass(Integer.parseInt(request.getParameter("sclass")));
        s.setScoll(request.getParameter("scoll"));
        
            PrintWriter out= response.getWriter();
           
            
            try {
                 StudentDaoimpl sd= new StudentDaoimpl();
            sd.addstd(s);
             response.sendRedirect("login.jsp");
            
            } catch (Exception e) 
            {
                out.print(" There is  Some Error happened");
            }
        
    }

 
}

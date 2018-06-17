package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.data;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   int num=Integer.parseInt((request.getParameter("num")));
		HttpSession hs= request.getSession();
		ArrayList<data> datas=(ArrayList)hs.getAttribute("datas");
		datas.remove(num);
		hs.setAttribute("datas", datas);
		response.sendRedirect("AddProduct.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

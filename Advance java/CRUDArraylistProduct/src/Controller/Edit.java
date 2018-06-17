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


@WebServlet("/Edit")
public class Edit extends HttpServlet {
	int num;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ int a=1;
		num=Integer.parseInt(request.getParameter("num"));
		HttpSession hs= request.getSession();
		ArrayList<data> datas=(ArrayList)hs.getAttribute("datas");
	    data edit =datas.get(num);
	    hs.setAttribute("value", a);
	    hs.setAttribute("edit", edit);
		response.sendRedirect("AddProduct.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int a=2;
		HttpSession hs= request.getSession();
		data d= new data();
		d.setId(Integer.parseInt(request.getParameter("e1")));
		d.setName(request.getParameter("e2"));
		d.setPrice(Float.parseFloat(request.getParameter("e3")));
		ArrayList<data> datas=(ArrayList)hs.getAttribute("datas");
		datas.remove(num);
		datas.add(d);
		hs.setAttribute("datas",datas);
	    hs.setAttribute("value", a);
		response.sendRedirect("AddProduct.jsp");
	}

}

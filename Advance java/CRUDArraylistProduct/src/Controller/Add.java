package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.jrockit.jfr.Producer;

import Model.data;


@WebServlet("/Add")
public class Add extends HttpServlet 
{        
	ArrayList<data>datas=new ArrayList<>();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		data d= new data();
		d.setId(Integer.parseInt(request.getParameter("t1")));
		d.setName(request.getParameter("t2"));
		d.setPrice(Float.parseFloat(request.getParameter("t3")));
		
		
		datas.add(d);
		
		HttpSession hs= request.getSession();
		hs.setAttribute("datas",datas);
		response.sendRedirect("AddProduct.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
	}

}

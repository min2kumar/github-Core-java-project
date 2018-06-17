package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.Filter.Chain;

import sun.security.provider.certpath.ResponderId;
@WebFilter(  urlPatterns= {"/Add.jsp","/Display.jsp","/Message.jsp","/Read.jsp","/Deleteac.jsp","/filt.jsp","/Notification.jsp","/Requestc.jsp","/Update.jsp","/user.jsp"})
public class Dofilter implements Filter
{
@Override
public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain) throws IOException, ServletException 
{
    HttpServletRequest  request  =(HttpServletRequest) arg0;
    HttpServletResponse  response=  (HttpServletResponse) arg1;
    HttpSession hs= request.getSession();
     PrintWriter  out = response.getWriter();
  
     response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
 	response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
 	
 	if(hs.getAttribute("user")==null  )
 	{
 	    out.println("<script>parent.location.href='MainPage.jsp'</script>");
 	}
    chain.doFilter(request,response);
}

}

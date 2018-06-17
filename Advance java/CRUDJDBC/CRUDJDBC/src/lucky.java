

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class lucky extends SimpleTagSupport

{
   int number;
   
   

    @Override
    public void doTag() throws JspException, IOException {
	
	
	
	 JspWriter out=getJspContext().getOut();
	 out.write(String.valueOf((Math.pow(number, 3)*1/5)));
    }



    public int getNumber() {
        return number;
    }



    public void setNumber(int number) {
        this.number = number;
    }
   
    

}

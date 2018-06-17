
package threaddemo;

import com.sun.xml.internal.messaging.saaj.soap.impl.ElementImpl;


public class ThreadDemo  extends Thread
{  String name;

    public ThreadDemo(String tname)
    {
        this.name=tname;
        System.out.println(" Thgread  Constructor of ---"+tname);
    }

  
    
    
    
      @Override
      public void run()
     {
         
         System.out.println(" This is Thread Class Thread-----"+name);
          display();
         
     }
    
    public static void main(String[] args) throws InterruptedException
    {       
                ThreadDemo t= new ThreadDemo(" first one");
                t.start();
                ThreadDemo t2= new ThreadDemo("Second one");
                t2.start();
                ThreadDemo t3= new ThreadDemo("Third one");
                 t3.start();
              
            Object l=    t3.getPriority();
            System.out.println(l);
    }
    
    
    public void display()
    {
        System.out.println(" This is A Display Metoid------"+ name);
    }
}

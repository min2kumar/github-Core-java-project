
package listdeno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDeno
 {
    
    public  static void without()
            
    {
        
        /// it's a creartion part 
        List name = new ArrayList();
        name.add("mintu");
        name.add("kumnar");
        
        // now  we are going to display
    
       
        
        
        //using iterator
        
        Iterator i = name.iterator();
        while(i.hasNext())
        {
            System.out.println(" the given name is "+i.next());
        }
        
        // now we will careate a string  datat type list
        
        List<String> names= new  ArrayList();
        names.add("my namer is ");
        names.add("my mam is ");
        names.add("my name s is ");
        names.add("my saasad is ");
        
        //  now we wil displaya the datra using enhanced for  loop 
        for(String j:names)
        {
            System.out.println(" the entered  name is "+j);
        }
        
        // now we wil display using iteratoir
        
        Iterator n = names.iterator();
        while(n.hasNext())
        {
            System.out.println(" the name is "+n.next());
        }
        
        
    }
      public static void with()
      {
          List<Customer> clist= new ArrayList();
          
          Customer c= new Customer(1, 132, "mintukumar");
          Customer d= new Customer(1, 158, "chauyhah");
          Customer e= new Customer(1, 156, "danady");
          Customer f= new Customer(1, 645, "rahul");
          
   
          
          clist.add(e);
          clist.add(c);
          clist.add(d);
          clist.add(f);
          
          // now we will display the data using for each 
          
          for( Customer h: clist)
          {
              System.out.println(" the id is "+h.getId());
              System.out.println(" the age  is "+h.getAge());
              System.out.println(" the name is "+h.getName());
              
              
              
          }
          //  now we will display it  using iterator
          Iterator <Customer> m = clist.iterator();
          while(m.hasNext())
          {
             Customer k = m.next();
              System.out.println(k);
          }
          
          
      }
    
    
    
    
    

    public static void main(String[] args) 
{
  with();
  //without();
  }

}

package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo 
{
    public static void main(String[] args) 
    {
        //create a list
        List<String> names = new ArrayList<>();
        
        //now add some names to this list
        names.add("Chandan");
        names.add("Mintu");
        names.add("Abhishek");
        names.add("Abdul");
        names.add("Maaz");
        names.add("Shlok");
        names.add("nihal");
        names.add("ethan");
        
        //display using Iterator
        Iterator it= names.iterator();
        
        //while loop
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        List<Customer> clist= new ArrayList<>();
        
        Customer c= new Customer(1, "aman", 12);
        Customer d= new Customer(1, "aman", 12);
        clist.add(c);
        clist.add(d);
        
        // now we will display 
        
        //iterator
        Iterator i=clist.iterator();
        while(i.hasNext())
        {
            Customer obj = (Customer)i.next();
//            System.out.println(obj.getId());
//            System.out.println(obj.getAge());
//            System.out.println(obj.getName());
            System.out.println(obj.toString());
        }
        
    }
}


package omparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OmparableDemo
 {

    public static void main(String[] args) 
{
     Customer c=  new Customer(1, "mintu", 25);
     Customer c1=  new Customer(2, "kumar", 45);
     Customer c2=  new Customer(3, "binda", 47);
     Customer c3=  new Customer(4, "chauhan", 54);
     
     
     // now we will create a list to
     List<Customer> cus= new ArrayList<>();
     cus.add(c);
     cus.add(c1);
     cus.add(c2);
     cus.add(c3);
     
     
     //  now we will sort the data 
    Collections.sort(cus);                                 
    for(Customer g:cus)
    {
        System.out.println(g);
    }
    
    }

}

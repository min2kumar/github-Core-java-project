
package comparableddemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo
 {

    public static void main(String[] args) 
{
 // now we will create some product
    
    Product p = new Product("mikntru", 20);
    Product p1 = new Product("sll", 15);
    Product p2 = new Product("main", 15);
    Product p3 = new Product("haldi", 15);
    Product p4 = new Product("small", 15);
    
    // now we will create  the list of the product
    
    List<Product> pr= new  ArrayList<>();
    
    // now add the product to the list
    
    pr.add(p);
    pr.add(p1);
    pr.add(p2);
    pr.add(p3);
    pr.add(p4);
    //now create the object of two class
    Comparator <Product>  sortname= new SortByName();
    Comparator <Product> sortprice = new  SortByPrice();
    
    //now sort the  list by product price
    
    Collections.sort(pr,sortprice);
    // now we will display it using enhanced fore loop
    
    for(Product pd :pr)
    {
        System.out.println(p);
    }
    
    // sort the list  by name
    
    Collections.sort(pr,sortname);
    // now we will display it 
    
    for(Product pdd:pr)
        
    {
        System.out.println(p);
    }
    
  }

}

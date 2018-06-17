package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        //create some Products
        Product p1 = new Product("Oil",50);
        Product p2 = new Product("Maggi",12);
        Product p3 = new Product("Biscuit",10);
        Product p4 = new Product("Toothpaste",40);
        Product p5 = new Product("Chocolate",35);
        Product p6 = new Product("Facewash",86);
        Product p7 = new Product("Soap",20);
        
        //create a list of Product
        List<Product> prodList = new ArrayList<>();
        
        //now add the products to the list
        prodList.add(p1);
        prodList.add(p2);
        prodList.add(p3);
        prodList.add(p4);
        prodList.add(p5);
        prodList.add(p6);
        prodList.add(p7);
        
        //now create object of other 2 classes
        Comparator<Product> sortName = new SortProductByName();
        Comparator<Product> sortPrice = new SortProductByPrice();
        
        //sort the list by product price
        Collections.sort(prodList, sortPrice);
        
        //now display the list
        for(Product p:prodList)
        {
            System.out.println(p);
        }
        //sort the list by product name
        Collections.sort(prodList, sortName);
        System.out.println("");
        
        //now display the list
        for(Product p:prodList)
        {
            System.out.println(p);
        }
    }
}

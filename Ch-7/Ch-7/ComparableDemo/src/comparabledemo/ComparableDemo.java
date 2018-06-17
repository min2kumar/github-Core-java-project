package comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo 
{
    public static void main(String[] args) 
    {
        //create some Products
        Product p1 = new Product("Oil",50,"Patanjali");
        Product p2 = new Product("Maggi",12,"Patanjali");
        Product p3 = new Product("Biscuit",10,"Patanjali");
        Product p4 = new Product("Toothpaste",40,"Patanjali");
        Product p5 = new Product("Chocolate",35,"Patanjali");
        Product p6 = new Product("Facewash",86,"Patanjali");
        Product p7 = new Product("Soap",20,"Patanjali");
        
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
        
        //sort the list by product price
        Collections.sort(prodList);
        
        //now display the list
        for(Product p:prodList)
        {
            System.out.println(p);
        }
        
    }
}

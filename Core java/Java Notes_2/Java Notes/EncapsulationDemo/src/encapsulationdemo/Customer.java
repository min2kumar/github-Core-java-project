package encapsulationdemo;

import java.util.Scanner;

public class Customer 
{
    //make member variables private
    private int id;
    private String name;
    private String address;
    
    //make member methods public
    public void accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter customer id");
        id=obj.nextInt();
        System.out.println("Enter customer name");
        name=obj.next();
        System.out.println("Enter customer address");
        address=obj.next();
    }
    public void display()
    {
        System.out.println("---Customer Details---");
        System.out.println("Name is "+name);
        System.out.println("ID is "+id);
        System.out.println("Address is "+address);
    }
}

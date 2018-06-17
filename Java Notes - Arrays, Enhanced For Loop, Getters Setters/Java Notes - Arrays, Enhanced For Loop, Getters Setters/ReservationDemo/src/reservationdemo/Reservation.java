package reservationdemo;

import java.util.Scanner;

public class Reservation 
{
    private String name;
    private int age;
    private String gender;
    private long contact;
    private String destination;
    
    public void store()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name");
        name=obj.next();
        System.out.println("Enter age");
        age=obj.nextInt();
        System.out.println("Enter gender");
        gender=obj.next();
        System.out.println("Enter contact");
        contact=obj.nextLong();
        System.out.println("Enter Destination");
        destination=obj.next();
    }
    public void display()
    {
        System.out.println("--Reservation Details--");
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Gender is "+gender);
        System.out.println("Contact no is "+contact);
        System.out.println("Destination is "+destination);
    }
}

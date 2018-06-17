package entitydemo;

import java.util.Scanner;

public class Student 
{
    //member variables
    String fname,lname,email;
    int age;
    
    //member methods
    public void accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first name");
        fname=obj.nextLine();
        System.out.println("Enter last name");
        lname=obj.nextLine();
        System.out.println("Enter email id");
        email=obj.nextLine();
        System.out.println("Enter age");
        age=obj.nextInt();
    }
    public void display()
    {
        System.out.println("---Student details---");
        System.out.println("First name is "+fname);
        System.out.println("Last name is "+lname);
        System.out.println("Email id is "+email);
        System.out.println("Age is "+age);
    }
}

package entitydemo;

import java.util.Scanner;

public class EntityDemo 
{
    public static void main(String[] args) 
    {
        //declaring variables
        String fname, lname, email;
        int age;
        
        //creating scanner object = if user input
        Scanner obj = new Scanner(System.in);
        
        //input
        System.out.println("Enter first name");
        fname=obj.nextLine();
        System.out.println("Enter last name");
        lname=obj.nextLine();
        System.out.println("Enter email");
        email=obj.nextLine();
        System.out.println("Enter age");
        age=obj.nextInt();
        
        //output
        System.out.println("---Student Details---");
        System.out.println("First name is "+fname);
        System.out.println("Last name is "+lname);
        System.out.println("Email id is "+email);
        System.out.println("Age is "+age);
    }
}

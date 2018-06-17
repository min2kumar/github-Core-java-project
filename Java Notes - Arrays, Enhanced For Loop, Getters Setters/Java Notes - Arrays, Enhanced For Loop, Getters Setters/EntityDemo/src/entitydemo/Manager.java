package entitydemo;

import java.util.Scanner;

public class Manager 
{
    //member variables - private
    private int id, salary;
    private String name, dept;
    
    //member methods
    public void accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter id");
        id=obj.nextInt();
        System.out.println("Enter salary");
        salary=obj.nextInt();
        System.out.println("Enter name");
        name=obj.next();
        System.out.println("Enter dept");
        dept=obj.next();
    }
    public void display()
    {
        System.out.println("---Manager Details---");
        System.out.println("Name is "+name);
        System.out.println("ID is "+id);
        System.out.println("Salary is "+salary);
        System.out.println("Dept is "+dept);
    }
}

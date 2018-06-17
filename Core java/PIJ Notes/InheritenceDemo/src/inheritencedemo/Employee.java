package inheritencedemo;

import java.util.Scanner;

public class Employee 
{
    private int id;
    private String name;
    private int age;
    private String gender;
    private int salary;
    Scanner s = new Scanner(System.in);
    
    public void accept()
    {
        System.out.println("Enter id");
        id=s.nextInt();
        System.out.println("Enter name");
        name=s.next();
        System.out.println("Enter age");
        age=s.nextInt();
        System.out.println("Enter gender");
        gender=s.next();
        System.out.println("Enter salary");
        salary=s.nextInt();
    }
    public void display()
    {
        System.out.println("--Details--");
        System.out.println("ID is "+id);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Gender is "+gender);
        System.out.println("Salary is "+salary);
    }
}

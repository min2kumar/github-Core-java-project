package inheritencedemo;

import java.util.Scanner;

public class Human 
{
    private int id;
    private String name;
    private int age;
    Scanner s = new Scanner(System.in);
    
    public void accept()
    {    
        System.out.println("Enter id");
        id=s.nextInt();
        System.out.println("Enter name");
        name=s.next();
        System.out.println("Enter age");
        age=s.nextInt();
    }
    public void display()
    {
        System.out.println("--Display--");
        System.out.println("ID is "+id);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}

package userdefinedexceptiondemo;

import java.util.*;

public class UserDefinedExceptionDemo 
{
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        
        if(age<18)
        {
            try
            {
                throw new AgeException("Age should be greater than 18");
            }
            catch(AgeException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
        else
        {
            System.out.println("Welcome to Disco");
        }
    }
}

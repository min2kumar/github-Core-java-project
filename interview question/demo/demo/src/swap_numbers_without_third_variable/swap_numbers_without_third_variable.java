package swap_numbers_without_third_variable;

import java.util.Scanner;

public class swap_numbers_without_third_variable 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        
        
        System.out.println("Before swapping value of a is: "+a);
        System.out.println("Before swapping value of b is: "+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        
         
        System.out.println("After swapping value of a is: "+a);
        System.out.println("After swapping value of b is: "+b);
        
    }
    
}

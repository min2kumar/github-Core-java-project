package simple_calculator;

import java.util.Scanner;

public class Calculator 
{
    public void logic()
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("-----Menu-----");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Div");
        System.out.println("4. Mul");
        System.out.println("5. quit");
        System.out.println("");
        
        System.out.println("Enter One Option");
        System.out.println("");
        
        int c=sc.nextInt();
        
        System.out.println("Enter first number");
        int a=sc.nextInt();
        
        System.out.println("Enter second number");
        int b=sc.nextInt();
        
        switch(c)
        {
            case 1:
                   System.out.println("Addition is: "+(a+b));
                   yesno();
                   break;
                   
            case 2:
                    System.out.println("Subtraction is: "+(a-b));
                    yesno();
                    break;
                    
            case 3:
                    System.out.println("Division is: "+(a/b));
                    yesno();
                    break;
                    
            case 4:
                    System.out.println("Multiplication is: "+(a*b));
                    yesno();
                    break;
                    
            case 5:
                    System.exit(0);
                    break;
                       
            default:
                    System.out.println("Enter Valid Option");
                    yesno();
                    break;
        }
    }
    public void yesno()
    {
        System.out.println("Do You Want to continue y/n?");
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        if(s.equals("y") || s.equals("yes"))
        {
            logic();
        }
        else
        {
            System.exit(0);
        }
    }
    public static void main(String[] args) 
    {
        Calculator c=new Calculator();
        c.logic();
        
    }
    
}

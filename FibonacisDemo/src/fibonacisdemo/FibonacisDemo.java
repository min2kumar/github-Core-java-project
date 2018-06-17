
package fibonacisdemo;

import java.util.Scanner;

public class FibonacisDemo
 {

    public static void main(String[] args) 
{
    int num1=0;
    int num2=1;
    int num3;
    Scanner sc = new Scanner(System.in);
    System.out.println(" please enter one number ");
    int a=sc.nextInt();
    System.out.println(num1);
    System.out.println(num2);
    for(int i=0;i<=a;i++)
    {   
       num3=num1+num2;
        System.out.println(num3);
        num1=num2;
        num2=num3;
    }
    
  
  }

}

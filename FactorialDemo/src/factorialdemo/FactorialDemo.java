
package factorialdemo;

import java.util.Scanner;

public class FactorialDemo
 {

    public static void main(String[] args) 
{
     Scanner sc = new  Scanner(System.in);
      int temp=1;
        System.out.println(" please enter one number here ");
        int a=sc.nextInt();
        for(int i=a;i>=1;i--)
        {    
          
                temp=temp*i;
            
        }
            System.out.println(" the factorial is"+temp);
  }

}

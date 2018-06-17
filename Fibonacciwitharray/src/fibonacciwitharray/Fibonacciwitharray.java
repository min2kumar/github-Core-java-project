
package fibonacciwitharray;

import java.util.Scanner;

public class Fibonacciwitharray
 {

    public static void main(String[] args) 
{
    Scanner sc= new Scanner(System.in);
     System.out.println(" enter one number here");
      int n=sc.nextInt();
      int num1=0;
      int num2=1;
      System.out.println(num1);
      System.out.println(num2);
      int num3;
      for(int i=1;i<=n;i++)
      {
          num3=num1+num2;
          System.out.println(num3);
          num1=num2;
          num2=num3;
          
      }
}


}
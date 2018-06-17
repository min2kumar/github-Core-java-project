
package primenumdemo;

import java.util.Scanner;

public class PrimenumDemo
 {

    public static void main(String[] args) 
{
     int h=0;
    Scanner sc= new Scanner(System.in);
    System.out.println(" please enter a number to find out the numer is prime number ");
    int a=sc.nextInt();
    
    for(int i=1;i<=a;i++)
    {
          if(a%i==0)
          {
              h++;
          }
  }
    if(h==2)
    {
        System.out.println(" this is prime number"); 
    }else
    {
        System.out.println(" this is not a prime number"); 
    }

}
}


package piramiddemo;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class PiramidDemo
 {

    public static void main(String[] args) 
   {
      
      
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter One Number");
        int n=sc.nextInt();
        
        System.out.println("---Pyramid---");
    
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" "); 
            }
            
           for(int k=1;k<=i;k++)
           {
               System.out.print("* ");
           }
            System.out.println("");
        }

         
        
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        
        System.out.println("sum is: "+s);
    }
    

       
  
    }




package prime_number;

import java.util.Scanner;



public class prime 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter One Number");
        int n=sc.nextInt();
        
        int flag=0;
        for(int i=2;i<n;i++) 
        {
            if(n%i==0)
            {
                flag=1; 
            }
            
        }
        if(flag==0)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
    
}

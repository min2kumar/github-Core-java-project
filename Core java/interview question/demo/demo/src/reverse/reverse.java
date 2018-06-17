package reverse;

import java.util.Scanner;

public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter One Number");
        int n=sc.nextInt();
        
        int r=0;
        while(n>0)
        {
            r=r*10;
            r=r+n%10;
            n=n/10;
        }
        
        System.out.println("Reverse is: "+r);
    }
    
}

package sum_of_number;

import java.util.Scanner;

public class sum_of__number 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter One Number");
        int n=sc.nextInt();
        
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        
        System.out.println("sum is: "+s);
    }
    
}

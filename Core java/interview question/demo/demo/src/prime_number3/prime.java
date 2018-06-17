package prime_number3;

import java.util.Scanner;

public class prime 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter One Number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int flag=0;
            for(int j=1;j<=i;j++) 
            {
                if(i%j==0)
                {
                    flag++;
                    
                }
            }
            if(flag==2)
            {
                System.out.println(i);
            }
        }
    }
    
}

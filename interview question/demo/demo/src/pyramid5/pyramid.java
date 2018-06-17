package pyramid5;

import java.util.Scanner;

public class pyramid 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter One Number");
        int n=sc.nextInt();
        
        System.out.println("---Pyramid---");
        for(int i=1;i<=n;i++)
        {
            for(int x=1;x<=n-i;x++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}

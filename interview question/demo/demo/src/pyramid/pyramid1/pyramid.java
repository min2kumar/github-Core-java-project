package pyramid1;

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
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
}

package fibonacci_with_array;

import java.util.Scanner;

public class fibonacci_with_array 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter One Number");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        arr[0]=0;
        arr[1]=1;
        
        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-2]+arr[i-1];
        }
        
        //simple for loop
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(arr[i]);
//        }

        //foreach loop
        
        for(int s:arr)
        {
            System.out.println(s);
        }
        
        
    }
    
}

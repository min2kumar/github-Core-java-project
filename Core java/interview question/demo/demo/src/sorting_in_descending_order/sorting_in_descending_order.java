package sorting_in_descending_order;

import java.util.Scanner;

public class sorting_in_descending_order 
{
    public static void main(String[] args) 
    {
        
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter One Number");
         int n=sc.nextInt();
         
         int arr[]=new int[n];
         
         System.out.println("Enter Values");
         
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         
         for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 if(arr[i]<arr[j])
                 {
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
         
         //simple for loop
//         for(int i=0;i<n;i++)
//         {
//             System.out.println(arr[i]);
//         }
//         
        System.out.println("Sorted Array is:");
         //foreach loop
         for(int l:arr)
         {
             System.out.println(l);
         }
    }
    
}

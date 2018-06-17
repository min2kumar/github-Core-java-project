
package sortingdemo;

import java.util.Scanner;

public class SortingDemo
 {

    public static void main(String[] args) 
   {
       
       Scanner sc = new Scanner(System.in);
       System.out.println(" HOW MANY NUMBER DO YOU WANT TO ENTER");
        int n= sc.nextInt();
        int []  a= new int[n];
        int temp;
        for(int i=0;i<n;i++)
        { System.out.println(" enter "+(i+1)+" number");
          a[i]=sc.nextInt();
            
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(a[i]>a[j])
               {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                  
               }
            }
        }
         
         
         
         
       
        
        for(int l:a)
        {
            System.out.println(l);
        }
  
   }

}

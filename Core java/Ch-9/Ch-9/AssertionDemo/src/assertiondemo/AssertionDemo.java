package assertiondemo;

import java.util.*;

public class AssertionDemo 
{

    public static void main(String[] args) 
    {
        int i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        i=sc.nextInt();
        
        if(i>0)
        {
            System.out.println("Positive number");
        }
        else
        {
            assert(i<0);
            System.out.println("Negative number");
        }
    }

}

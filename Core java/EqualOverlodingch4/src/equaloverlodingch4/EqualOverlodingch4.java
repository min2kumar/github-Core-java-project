package equaloverlodingch4;

import java.util.Scanner;

public class EqualOverlodingch4
{
    public static void main(String[] args)
    {  Scanner s = new Scanner(System.in);
        long a,b,c,d;
        System.out.println(" enter first rectangle lenth value");
        a=s.nextLong();
        System.out.println(" enter the breadth value");
        b=s.nextLong();
        System.out.println(" enter the second rectangle lenth value");
        c=s.nextLong();
        System.out.println("  enter the  breadth value");
        d= s.nextLong();
        Rectangle r= new Rectangle(a, b);
        Rectangle r1= new Rectangle(c, d);
       
       
         if (r.equals(r1))
         {
             System.out.println(" the entered value is  same ");
         }
        else
         {
             System.out.println(" the entered value is not  same ");
         }
    }
    
}

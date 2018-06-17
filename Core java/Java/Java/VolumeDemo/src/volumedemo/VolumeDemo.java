package volumedemo;

import java.util.Scanner;

public class VolumeDemo 
{
    public static void main(String[] args) 
    {
        //declare variables
        double v,pi,r,h;
        
        //create scanner object
        Scanner s = new Scanner(System.in);
        
        //input
        System.out.println("Enter radius of cylinder");
        r=s.nextDouble();
        System.out.println("Enter height of cylinder");
        h=s.nextDouble();
        pi=3.14;
        
        //process
        v=pi*r*r*h;
        
        //output
        System.out.println("Volume of cylinder is "+v);
    }
}

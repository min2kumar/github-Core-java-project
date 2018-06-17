package distancedemo;

import java.util.Scanner;

public class DistanceDemo 
{
    public static void main(String[] args) 
    {
        //declare variables
        int distance,u,a,t;
        
        //Create Scanner object if user input
        Scanner s = new Scanner(System.in);
        
        //input = accept from user
        System.out.println("Enter initial velocity");
        u=s.nextInt();
        System.out.println("Enter acceleration");
        a=s.nextInt();
        System.out.println("Enter time");
        t=s.nextInt();
        
        //process = apply the formula
        distance=u*t+(a*t*t)/2;
        
        //output
        System.out.println("Total distance travelled is "+distance);
    }
}

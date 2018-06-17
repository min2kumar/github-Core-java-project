package temperaturedemo;

import java.util.Scanner;

public class TemperatureDemo 
{
    public static void main(String[] args) 
    {
        double f,c;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter temperature in celsius");
        c=s.nextDouble();
        
        f=c*9/5+32;
        
        System.out.println("Temperature in Fahrenheit is "+f);
    }
}

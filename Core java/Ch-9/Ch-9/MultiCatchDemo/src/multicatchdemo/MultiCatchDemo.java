package multicatchdemo;

import java.io.*;

public class MultiCatchDemo 
{

    public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        try
        {
            System.out.println("Before opening file");
            FileInputStream in = new FileInputStream("a.txt");
            System.out.println("After opening file");
            in.read();
            int a=10/0;
        }
        catch(IOException|ArithmeticException ex)
        {
            ex.printStackTrace();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Main method ends");
    }

}

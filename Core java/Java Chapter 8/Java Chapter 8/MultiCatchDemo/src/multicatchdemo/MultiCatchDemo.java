package multicatchdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatchDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        try
        {
            System.out.println("Try block begins");
            FileInputStream in = new FileInputStream("a.txt");
            System.out.println("After opening the file");
            in.read();
            System.out.println("After reading from file");
            int  a = 10/0;
            System.out.println("Try block ends");
        }
        catch(IOException|ArithmeticException ex)
        {
            System.out.println("Some problem");
        }
        System.out.println("Main method ends");
    }
}

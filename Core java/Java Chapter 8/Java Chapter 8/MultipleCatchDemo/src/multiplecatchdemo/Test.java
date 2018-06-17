package multiplecatchdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        try
        {
            System.out.println("Try block begins");
            FileInputStream in = new FileInputStream("a.txt");  
            System.out.println("File opened");
            in.read();
            System.out.println("After reading from file");
            System.out.println("Try block ends");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("No such file");
        }
        catch(IOException ex)
        {
            System.out.println("Some problem in reading");
        }
        catch(Exception ex)
        {
            System.out.println("Some problem");
        }
        System.out.println("Main methods ends");
    }
}

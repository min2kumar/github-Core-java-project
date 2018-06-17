package finallydemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        FileInputStream in=null;
        try
        {
            System.out.println("Try block begins");
            in = new FileInputStream("a.txt");
            System.out.println("File opened");
            in.read();
            System.out.println("After reading from file");
//            in.close();
//            System.out.println("After closing the file");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                in.close();
            }
            catch(IOException ex)
            {
                System.out.println("Some problem in closing");
            }
        }
        System.out.println("Main method ends");
    }
}

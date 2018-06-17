package trywithresourcedemo;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("main method begins");
        try(FileInputStream in = new FileInputStream("a.txt"))
        {
            in.read();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Main method ends");
    }
}

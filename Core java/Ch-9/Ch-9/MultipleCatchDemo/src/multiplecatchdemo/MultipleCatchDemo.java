package multiplecatchdemo;

import java.io.*;

public class MultipleCatchDemo 
{

    public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        try
        {
            System.out.println("Before opening the file");
            FileInputStream in = new FileInputStream("a.txt");
            System.out.println("After opening the file");
            in.read();
            System.out.println("After reading the file");
        }
        
        catch(FileNotFoundException ex)
        {
            System.out.println("File is Missing");
        }
        catch(IOException ex)
        {
            System.out.println("Problem in Input output");
        }
        catch(Exception ex)
        {
            System.out.println("Some other exception");
        }
        System.out.println("Main method ends");
    }

}

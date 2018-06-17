package finallydemo;

import java.io.*;

public class FinallyDemo 
{
    public static void main(String[] args) 
    {
        FileInputStream in= null;
        try
        {
            in = new FileInputStream("a.txt");
            in.read();
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
                System.out.println("Some problem in closing the resource");
            }
        }
    }
}

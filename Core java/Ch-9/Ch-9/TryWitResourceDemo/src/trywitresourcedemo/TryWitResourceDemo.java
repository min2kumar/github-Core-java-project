package trywitresourcedemo;

import java.io.*;

public class TryWitResourceDemo 
{

    public static void main(String[] args) 
    {
        try(FileInputStream in = new FileInputStream("a.txt"))
        {
            System.out.println("Hello");
            in.read();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

}

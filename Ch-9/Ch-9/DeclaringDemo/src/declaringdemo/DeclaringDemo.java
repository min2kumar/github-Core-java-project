package declaringdemo;

import java.io.*;

public class DeclaringDemo 
{
    public static void m1() throws IOException
    {
        FileInputStream in = new FileInputStream("a.txt");
        in.read();
    }
    public static void m2() throws IOException
    {
        throw new IOException();
    }
    public static void main(String[] args)
    {
//        m1();
//        m2();
    }
}

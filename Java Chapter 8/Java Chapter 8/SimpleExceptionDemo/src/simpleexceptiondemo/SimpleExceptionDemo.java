package simpleexceptiondemo;

public class SimpleExceptionDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        try
        {
            System.out.println("Try block begins");
            int a = 10/0;
            System.out.println("Try block ends");
        }
        catch(Exception ex)
        {
            System.out.println("Some problem in try block");
        }
//        FileInputStream in = new FileInputStream("a.txt");
        System.out.println("Main method ends");
    }
}

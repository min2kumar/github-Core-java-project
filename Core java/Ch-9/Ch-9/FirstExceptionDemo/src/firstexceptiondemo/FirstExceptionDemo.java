package firstexceptiondemo;

public class FirstExceptionDemo 
{

    public static void main(String[] args) 
    {
        System.out.println("Statement 1");
        try
        {
            int a = 10/0;
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Statement 3");
    }

}

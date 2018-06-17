package multiplecatchdemo;

public class MultipleCatchDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        try
        {
            String[] names = new String[2]; 
            int a = 10/0;
            names[3] = "Ajay";
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Invalid Array Index Position");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Cannot divide a number by zero");
        }
        System.out.println("Main method ends");
    }
}

package constant;
import static java.lang.Math.PI;
import static java.lang.System.out;
import static constant.A.b;
public class Constant 
{
    public static void main(String[] args) 
    {
        System.out.println("Value of PI "+PI);
        out.println("Hello");
        b=1;
    }
}
class A
{
    static int b;
}
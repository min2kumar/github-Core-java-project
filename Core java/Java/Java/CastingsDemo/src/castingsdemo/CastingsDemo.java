package castingsdemo;

public class CastingsDemo 
{
    public void m1()
    {
        //upcasting is implicit
        //storing integer value in long variable
        long l = 10;
        
        double d = 5.5f;
    }
    public void m2()
    {
        //downcasting is explicit
        int i = (int)10L;
        float f = (float)3.14;
    }
    public static void main(String[] args) 
    {
        //10 is integer literal
        //a is integer variable
        int a = 10;
        
        //5.5f is float literal
        //f is a float variable
        float f = 5.5f;
        
        //12L is long literal
        //l is a long variable
        long l = 12L;
        
        //3.14 is a double literal
        //d is a double variable
        double d = 3.14;
    }
}

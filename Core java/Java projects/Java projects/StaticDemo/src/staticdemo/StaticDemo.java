package staticdemo;

public class StaticDemo 
{
    int a;
    static int b;
    
    public void m1()
    {
        a=1;
        b=2;
    }
    public static void m2()
    {
//        a=1;
        StaticDemo obj = new StaticDemo();
        obj.a=1;
        b=2;
    }
    
    public static void main(String[] args) 
    {
//        m2();
//        m1();
//        StaticDemo obj = new StaticDemo();
//        obj.m1();
        MyClass obj = new MyClass();
        obj.f1();
        MyClass.f2();
    }
    
}

class MyClass
{
    public void f1()
    {
        
    }
    public static void f2()
    {
        
    }
}
public class StaticDemo
{
int a;
static int b;

//non static method can access both- static + nonstatic variable
public void m1()
{
a=1;
b=2;
}
//static method can use only static variables directly;
//it cannot use non-static variable directly, but indirectly
public static void m2()
{
//a=1;	//error
StaticDemo obj = new StaticDemo();
obj.a=1;
b=2;
}
public static void main(String[] args)
{
//m1();	//error
StaticDemo obj = new StaticDemo();
obj.m1();
m2();
}
}




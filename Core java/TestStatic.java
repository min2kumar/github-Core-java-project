public class TestStatic
{
public static void main(String[] args)
{
MyClass m1 = new MyClass();
MyClass m2 = new MyClass();
MyClass m3 = new MyClass();

/*
System.out.println(m1.c);
System.out.println(m2.c);
System.out.println(m3.c);
System.out.println(MyClass.c);
*/
System.out.println(MyClass.getCount());
System.out.println(m1.getCount());
System.out.println(m2.getCount());
System.out.println(m3.getCount());
}
}
class MyClass
{
static int c=0;
public MyClass()
{
c++;
}
public static int getCount()
{
return c;
}
}





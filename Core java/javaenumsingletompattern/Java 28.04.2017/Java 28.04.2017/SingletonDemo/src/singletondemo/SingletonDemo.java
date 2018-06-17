package singletondemo;

public class SingletonDemo 
{
    public static void main(String[] args) 
    {
        //create many objects of MyClass
        MyClass m1 = MyClass.getInstance();
        MyClass m2 = MyClass.getInstance();
        MyClass m3 = MyClass.getInstance();
        MyClass m4 = MyClass.getInstance();
        
        Employee e1 = Employee.getInstance();
        Employee e2 = Employee.getInstance();
        Employee e3 = Employee.getInstance();
        Employee e4 = Employee.getInstance();
        
    }
}
class MyClass
{
    private static final MyClass obj = new MyClass();
    private MyClass(){}
    public static MyClass getInstance()
    {
        return obj;
    }
}
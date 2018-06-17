package accessdemo;

public class AccessDemo 
{
    public int a;
    public void m1()
    {
        a=1;
    }
    public static void main(String[] args) 
    {
        
    }
}  
class OtherClass
{
    public void m2()
    {
        AccessDemo obj = new AccessDemo();
        obj.a=2;
    }
}
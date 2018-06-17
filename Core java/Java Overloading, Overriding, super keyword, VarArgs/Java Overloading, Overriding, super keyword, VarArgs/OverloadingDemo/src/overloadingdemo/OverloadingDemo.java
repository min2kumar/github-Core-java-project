package overloadingdemo;

public class OverloadingDemo 
{
    public void display()
    {
        System.out.println("Hello");
    }
    public void display(String name)//name is formal parameter
    {
        System.out.println("Hello "+name);
    }
    public void display(String name, int a)//name is formal parameter
    {
        for(int i=1;i<=a;i++)
        {
            System.out.println("Hello "+name);
        }
    }
    public static void main(String[] args) 
    {
        OverloadingDemo obj = new OverloadingDemo();
        obj.display();
        obj.display("Ajay");    //"Ajay" is actual parameter
        obj.display("Ethan",3);
    }
}
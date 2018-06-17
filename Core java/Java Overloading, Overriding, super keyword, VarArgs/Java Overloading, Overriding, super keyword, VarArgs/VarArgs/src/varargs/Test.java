package varargs;

public class Test 
{
    public void hello(String... names)
    {
        for(String n:names)
        {
            System.out.println("Hello "+n);
        }
    }
    public static void main(String[] args) 
    {
        new Test().hello("Ethan","Susan","Sandeep","Abhishek","Mintu","Abdul","Vipul","Arsh","Maaz","Nazir","Nihal","Samim");
    }
}

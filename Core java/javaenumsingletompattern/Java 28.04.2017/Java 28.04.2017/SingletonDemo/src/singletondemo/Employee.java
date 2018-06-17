package singletondemo;

public class Employee 
{
    private static final Employee obj = new Employee();
    private Employee(){}
    public static Employee getInstance()
    {
        return obj;
    }
}

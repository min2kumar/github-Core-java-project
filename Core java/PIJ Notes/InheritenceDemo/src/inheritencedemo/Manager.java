package inheritencedemo;

public class Manager extends Employee
{
    private String dept;

    @Override
    public void accept() 
    {
        super.accept();
        System.out.println("Enter dept");
        dept=s.next();
    }

    @Override
    public void display() 
    {
        super.display();
        System.out.println("Dept is "+dept);
    }
    
}

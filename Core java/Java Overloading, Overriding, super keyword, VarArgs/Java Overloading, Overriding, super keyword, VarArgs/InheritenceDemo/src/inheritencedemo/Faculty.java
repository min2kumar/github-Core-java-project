package inheritencedemo;

public class Faculty extends Human
{
    private int salary;

    @Override
    public void accept() 
    {
        super.accept();
        System.out.println("Enter salary");
        salary=s.nextInt();
    }

    @Override
    public void display() 
    {
        super.display();
        System.out.println("Salary is "+salary);
    }
    
}

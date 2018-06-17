package inheritencedemo;

public class Director extends Employee 
{
    private int budget;

    @Override
    public void accept() 
    {
        super.accept();
        System.out.println("Enter budget");
        budget=s.nextInt();
    }

    @Override
    public void display() 
    {
        super.display();
        System.out.println("Budget is "+budget);
    }
    
}

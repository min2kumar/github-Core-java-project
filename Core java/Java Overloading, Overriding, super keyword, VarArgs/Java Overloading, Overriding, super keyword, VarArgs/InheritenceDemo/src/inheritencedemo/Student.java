package inheritencedemo;

public class Student extends Human
{
    private int marks;

    @Override
    public void accept() 
    {
        super.accept();
        System.out.println("Enter marks");
        marks=s.nextInt();
    }

    @Override
    public void display() 
    {
        super.display();
        System.out.println("marks is "+marks);
    }

    
}

package entitydemo;

public class Test 
{
    public static void main(String[] args) 
    {
        //s1 IS-A Student
        //objects maintain separate copy of the member variables
        Student s1 = new Student();
        s1.accept();
        s1.display();
    }
}

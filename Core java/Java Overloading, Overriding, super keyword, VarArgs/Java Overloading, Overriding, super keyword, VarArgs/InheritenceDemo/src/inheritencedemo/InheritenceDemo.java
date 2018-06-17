package inheritencedemo;

public class InheritenceDemo 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.accept();
        s1.display();
        
        Faculty f1 = new Faculty();
        f1.accept();
        f1.display();
    }
}

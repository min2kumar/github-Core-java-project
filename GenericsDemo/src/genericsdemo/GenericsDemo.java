package genericsdemo;

public class GenericsDemo 
{
    public static void main(String[] args) 
    {
        //create object of Student and Faculty
        Student s1 = new Student(1,"Ethan",18);
        Faculty f1 = new Faculty(45,"Ajay",1000);
        Customer c1 = new Customer(2,"Chandan","chandan@gmail.com");
        
        //Create object of TestStudent and TestFaculty class
//        TestStudent ts1 = new TestStudent(s1);
//        TestFaculty tf1 = new TestFaculty(f1);
        TestAny<Student> ts1 = new TestAny<>(s1);
        TestAny<Faculty> tf1 = new TestAny<>(f1);
        TestAny<Customer> tc1 = new TestAny<>(c1);
    }
}

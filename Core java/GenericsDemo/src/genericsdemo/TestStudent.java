package genericsdemo;

public class TestStudent 
{
    private Student student;

    public TestStudent() {
    }

    public TestStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
}

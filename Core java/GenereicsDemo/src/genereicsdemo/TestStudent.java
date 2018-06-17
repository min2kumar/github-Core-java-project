
package genereicsdemo;

public class TestStudent
 {
  private Student student;

    public TestStudent(Student student) {
        this.student = student;
    }

    public TestStudent() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
  
}

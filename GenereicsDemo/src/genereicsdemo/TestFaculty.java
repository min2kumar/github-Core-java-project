
package genereicsdemo;

public class TestFaculty
 {
  private Faculty faculty;

    public TestFaculty() {
    }

    public TestFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
  
}

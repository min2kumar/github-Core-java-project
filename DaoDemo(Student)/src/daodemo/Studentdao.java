package daodemo;

public interface Studentdao
{
    void addStudend(Student s);
    void removeStudent( int id);
    void updateStudent( Student s);
    
    void display(Student s);
    Student findbyid( int id);
    
}

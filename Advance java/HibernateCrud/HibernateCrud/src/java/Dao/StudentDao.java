
package Dao;

import Model.Student;


public interface StudentDao 
{
    public  void addstd(Student s);
    public void removestd(Student s);
    public void upatestd(Student s);
    public void deletestd( Student s);
}

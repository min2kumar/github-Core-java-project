
package daodemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoimpl implements Studentdao
 {
private List<Student> slist ;

    public StudentDaoimpl()
    {
        slist=new ArrayList<>();
        slist.add(new Student("mintu", 1, 20, "mintuc64@gmail.com"));
        slist.add( new Student("ajay", 2, 21, "ajay@gmail.com"));
    }

    @Override
    public void addStudend(Student s)
    {
        Student obj =findbyid(s.getId());
         
       if(obj==null)
       {
           slist.add(s);
           System.out.println(" Student added succesfully");
          
       }else
       {
           System.out.println(" STUDENT ALREADY  EXIST");
       }
        
    }

    @Override
    public void removeStudent(int id1) 
    {
         Student obj = findbyid(id1);
       if(obj==null)
       {
           System.out.println(" STUDENT NOT FOUND CANNOT REMOVE");
       }else
       {
          slist.remove(obj);
           System.out.println(" Student succesfully removed");
       }
    }

    @Override
    public void updateStudent(Student s) 
    {   Student obj =findbyid(s.getId());
       if(obj==null)
       {
           System.out.println(" STUDENT NOT EXIST PLEASE ENTER VALID STUDENT ID");
       } else
       {
          slist.add(slist.indexOf(obj), s);
           slist.remove(obj);
         
           System.out.println(" updates succesfully");
       }
    }

    
      
    

    

    @Override
    public void display(Student s)
    {
        for(Student T:slist)
        {
            System.out.println(T);
        }
    }


    

    public Student findbyid(int id) 
    {
        for(Student std:slist)
        {
            
          
           if(std.getId()==id) 
           {
               System.out.println(std);
               return std;
               
               
           }else
           {
               System.out.println("please input valid id ");
           }
          
           
        }
     
        return null;
    }

    @Override
    public String toString() {
        return "StudentDaoimpl{" + "slist=" + slist + '}';
    }

  
    
}
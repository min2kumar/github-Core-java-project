package objectprint;

 
public class Employee {
    
     int id ;
     String name , designation,dept;
    
     void set( int a,String b,String c,String d)
     {     
         this.id=a;
          this.name =b;
          this.designation=d;
          this.dept=c;
          
          
     }

    @Override
    public String toString() {
        return ("id is --"+id+" ----name  is-- "+name+"----designation is--"+designation+" ----department is--- "+dept);
    }
     
     
  
    
}

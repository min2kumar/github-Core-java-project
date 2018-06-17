
package StudentDaoimpl;

import Dao.StudentDao;
import Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

public class StudentDaoimpl  extends Student implements StudentDao
{

    @Override
    public void addstd(Student s) 
    {
          SessionFactory sf= NewHibernateUtil.getSessionFactory();
         Session ss= sf.openSession();
         Transaction ts= ss.beginTransaction();
         ss.persist(s);
         ts.commit();
      
    }

    @Override
    public void removestd(Student s) {
        
    }

    @Override
    public void upatestd(Student s) {
        
    }

    @Override
    public void deletestd(Student s) {
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}


package collectiondemo;

import Model.Student;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

  
public class CollectionDemo {

 static Set<Student> slist= new HashSet<>();
    public static void main(String[] args)
    {
        
          Student s= new Student();
        Scanner sc= new Scanner(System.in);
           System.out.println(" Please Enter Your ID Number Here");
           s.setId(sc.nextInt());
         System.out.println(" Please Enter Your Name Here");
         s.setName(sc.next());
         System.out.println(" Please Enter Your Email  ID Here");
         s.setEmail(sc.next());
         System.out.println(" Please Enter Your Mobile Number ");        
         s.setMobile(sc.nextInt());
         
         
         slist.add(s);
         
         System.out.println(" Do you Want To Add More Value");
         String ans= sc.next();
         
         if (ans.equalsIgnoreCase("y")) {
             main(args);
        }else
         {
             display();
         }
         
         
    }
    
    
    public  static void display()
    {
        System.out.println(" To Display The Arralist Value ");
        for (Student object :slist ) 
        {
            System.out.println(object.toString());
        }
    }
}

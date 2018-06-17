
package genereicsdemo;

public class GenereicsDemo
 {

    public static void main(String[] args) 
   {
       Student s= new Student(1, "mintu", 14);
       Faculty f= new Faculty("mintukumar", 10, 2, 012);
      
       //// this is withoout using generics 
       TestFaculty tf= new TestFaculty(f);
       TestStudent tgs = new TestStudent(s);
       
       
       ////  with using generics
       
      TestAny<Faculty> td= new TestAny<>(f);
       
       
       
       
       
   }

}

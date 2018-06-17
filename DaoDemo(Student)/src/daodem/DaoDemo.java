
package daodem;

import java.util.Scanner;

public class DaoDemo
 {
     int choose;
        String na;
        int i;
        int ag;
        String mai;
        String again;
         Scanner s= new Scanner(System.in);
          
    public static void main(String[] args) 
   { 
//        Studentdao  d= new StudentDaoimpl();
//        d.display(new Student());
//        d.addStudend(new  Student("kumar", 3, 12, "gmail"));
//        d.display(new Student());
//        d.removeStudent(1);
//        d.display(new Student());
//        d.updateStudent(new Student("mintu", 3, 25, "thakur"));
//        d.display(new Student());
//      
        DaoDemo d= new DaoDemo();
        
        d.choose();
       
   }
    
    public  void choose()
    {   
        Studentdao  d= new StudentDaoimpl();
        System.out.println("==welcome to  java ====");
        do{
        System.out.println("=== please  choose from below once===");
        System.out.println(" 1)_>>>>>>  for adding    the Student details");
        System.out.println(" 2)_>>>>>>  for Removing  the Student details");
        System.out.println(" 3)_>>>>>>  for updating  the Student details");
        System.out.println(" 4)_>>>>>>  for finding   the Student details");
        System.out.println(" 5)_>>>>>>  for display   the Student details");
        choose = s.nextInt();
        switch(choose)
        {
            case 1:
              action();
                d.addStudend(new Student(na, i, ag, mai));
                break;
            case 2:
                 System.out.println(" enter id no of student");
                i=s.nextInt();
                d.removeStudent(i);
               
                break;
            case 3:
                System.out.println(" id is unique hence id cannot change / please entger id as it is ");
                action();
                d.updateStudent(new Student(na, i, ag, mai));
                break;
            case 4:
                System.out.println(" enter id no of student");
                i=s.nextInt();
                d.findbyid(i);
                break;
            case 5:
                d.display(new Student());
                break;
            default:
                System.out.println("INVALID KEY PLEASE INPUT RIGHT KEY");
                choose();
                break;
               
        }
         System.out.println(" do you want to do more operation");
         again=s.next();
        }while(again.equalsIgnoreCase("y")||again.equalsIgnoreCase("yes"));
        
        
         
    }
    
    public void action()
    {
                System.out.println(" please enter the stuednt id");
                i= s.nextInt();
                System.out.println(" please enter the stuednt name");
                na= s.next();
                System.out.println(" please enter the stuednt age");
                ag= s.nextInt();
                System.out.println(" please enter the stuednt email address");
                mai= s.next();
    }

}

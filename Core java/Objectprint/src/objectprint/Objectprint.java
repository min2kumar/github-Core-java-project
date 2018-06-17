package objectprint;

import java.util.Scanner;

public class Objectprint {


    public static void main(String[] args) 
    {  int id;
    String name,dept,designation;
        Scanner s= new Scanner(System.in);
        System.out.println(" enter your id");
        id=s.nextInt();
        System.out.println(" enter your name ");
        name= s.next();
        System.out.println(" enter your department");
        dept= s.next();
        System.out.println(" enter your designation");
        designation= s.next();
     Employee e= new  Employee();
      e.set(id, name, dept, designation);
    
        System.out.println(" the answer is "+e);

    }
    
}

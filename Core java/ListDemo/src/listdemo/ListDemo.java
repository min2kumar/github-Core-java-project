package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo 
{
    public static void without()
    {
        //first create a list
        List names = new ArrayList();
        
        //now add some names to this list
        names.add("Arsh");
        names.add("Ethan");
        names.add("Shlok");
        names.add("Sandeep");
        names.add("Nazim");
        
        //now display
        //using enhanced for loop
//        for()
//        {
//            
//        }
        
        //using Iterator
        Iterator it = names.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    public static void with()
    {
        List<String> names = new ArrayList<>(3);
        
        //now add some names to this list
        names.add("Arsh");
        names.add("Ethan");
        names.add("Shlok");
        names.add("Sandeep");   //size will dynamically increase
        names.add(0,"Nazim");
        
        //display using enhanced for loop
//        for(String s:names)
//        {
//            System.out.println(s);
//        }
        //display using Interator
        Iterator it = names.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    public static void demo()
    {
        //create a list of Employees
        List<Employee> empList = new ArrayList<>();
        
        //now create some Employee objects
        Employee e1 = new Employee(1,"Arsh",18);
        Employee e2 = new Employee(2,"Ethan",18);
        Employee e3 = new Employee(3,"Shlok",18);
        Employee e4 = new Employee(4,"Sandeep",18);
        Employee e5 = new Employee(5,"Maaz",18);
        Employee e6 = new Employee(6,"Nazir",18);
        
        //now add the employees to the list
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        
        //display using enhanced for loop
//        for(Employee e:empList)
//        {
//            System.out.println("ID is "+e.getId());
//            System.out.println("Name is "+e.getName());
//            System.out.println("Age is "+e.getAge());
//            System.out.println("");
//            System.out.println(e);
//        }

        Iterator<Employee> it = empList.iterator();
        while(it.hasNext())
        {
            Employee e = it.next();
            System.out.println(e);
        }
    }
    public static void main(String[] args) 
    {
//        without();
//        with();
        demo();
    }
}

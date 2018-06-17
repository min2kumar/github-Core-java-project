package setdemo;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo 
{
    public static void main(String[] args) 
    {
        //create a set of string
        Set<String> names = new TreeSet<>();
        
        //now add names to this set
        names.add("Chandan");
        names.add("Abhishek");
        names.add("Sadaf");
        names.add("Susan");
        names.add("Mintu");
        names.add("Abdul");
        names.add("Ethan");
        names.add("Sandeep");
        names.add("Shlok");
        names.add("Maaz");
        names.add("Nihal");
        names.add("Nihal");     //not added, only unique, no duplicate
        
        //using enhanced for loop
        for(String a:names)
        {
            System.out.println(a);
        }
        
    }
}

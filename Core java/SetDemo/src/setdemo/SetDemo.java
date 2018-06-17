
package setdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
 {

    public static void main(String[] args) 
{
     // crate a set 
      Set<String> name = new  TreeSet<>();
      name.add("mintu");
      name.add("kumar");
      name.add("binda");
      name.add("chauhan");
      
      //  now we will display the thing
    for(String n:name)
    {
        System.out.println(" the name is "+n);
    }
    
    
  }

}

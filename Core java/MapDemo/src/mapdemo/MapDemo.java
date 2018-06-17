
package mapdemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo
 {

    public static void main(String[] args) 
{
  // now first create a map of sdtring key and and SAtring  value
     Map <String,String> m=  new  TreeMap<>();
    
     // now we are putiing some data to this map\
     m.put("S140012700346", "mintukumar");
     m.put("S140012700348", "chauhan");
     m.put("S140012700396", "jai hind");
     m.put("S140012700376", "MINTUKUMAR");
     m.put("S140012700456", "maharaja");
     m.put("S140012700986", "BINDA CHAUHAN");
     
     // NOW STORE THE KEY IN SET
     
      Set<String> mp=m.keySet();
     
      // now we will display the data using enhanced for loop
      for( String l :mp)
      {
          System.out.println(" the id is "+l+"  the name is "+m.get(l));
      }
     
  }

}

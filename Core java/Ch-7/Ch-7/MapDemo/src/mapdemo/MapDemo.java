package mapdemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{
    public static void main(String[] args) 
    {
        //first create a Map of String key and String value
        Map<String,String> m = new TreeMap<>();
        
        //now put some data to this map
        m.put("S140012700195","Chandan");
        m.put("S140012700193","Abhishek");
        m.put("S170012700087","Sadaf");
        m.put("S160012700497","Susan");
        m.put("S140012700346","Mintu");
        m.put("S160012700416","Abdul");
        m.put("S170012700192","Ethan");
        m.put("S170012700179","Sandeep");
        m.put("S170012700138","Nihal");
        m.put("S160012700341","Maaz");
        m.put("S170012700218","Shlok");
//        m.put("S170012700218","Ajay");      //this will overwrite the value
        
        //store the keys in a set
        Set<String> keys = m.keySet();
        
        //now display using enhanced for loop
        for(String k:keys)
        {
            System.out.println("ID is "+k+"\tName is "+m.get(k));
        }
    }
}

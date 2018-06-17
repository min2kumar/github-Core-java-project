
package dequedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo
 {

    public static void main(String[] args) 
{
  //  now first we will create the  deque of String
     Deque <String> n= new ArrayDeque<>();
     
    // now we will push the data in the deque
    n.push("mintukumar");
    n.push("kumar");
    n.push("chauhan");
    n.push("binda");
    
    // now will pop the data
      int l=n.size();
      
      while(l>0)
      {
          System.out.println(n.pop());  
          l--;
      }
    
  }

}

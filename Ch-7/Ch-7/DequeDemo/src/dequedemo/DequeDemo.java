package dequedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo 
{
    public static void main(String[] args) 
    {
        //first create a deque of Strings
        Deque<String> m = new ArrayDeque<>();
        
        //now push some data to this deque
        m.push("Chandan");
        m.push("Abhishek");
        m.push("Sadaf");
        m.push("Susan");
        m.push("Mintu");
        m.push("Abdul");
        m.push("Ethan");
        m.push("Sandeep");
        m.push("Shlok");
        m.push("Maaz");
        m.push("Nihal");
        
        //now pop data
        int l = m.size();
        
        while(l>0)
        {
            System.out.println(m.pop());
            l--;
        }
    }
}

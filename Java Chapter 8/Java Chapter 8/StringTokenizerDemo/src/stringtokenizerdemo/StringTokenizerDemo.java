package stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{
    public static void main(String[] args) 
    {
        String s = "Ethan Dsouza, Sadaf Sayyed, Susan Crasta, Shlok Achrekar, Sandeep Chouhan, Maaz Sunasara, Sarvesh Phate, Abdul Shaikh, Mintu Kumar, Vipul Yadav, Nazir Khan";
        StringTokenizer obj = new StringTokenizer(s,", ");  //comma or space
        while(obj.hasMoreTokens())
        {
            System.out.println(obj.nextToken());
        }
    }
}

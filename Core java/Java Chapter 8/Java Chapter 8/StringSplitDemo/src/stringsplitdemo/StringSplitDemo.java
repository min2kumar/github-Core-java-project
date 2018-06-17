package stringsplitdemo;

public class StringSplitDemo 
{
    public static void main(String[] args) 
    {
        String s = "Ethan Dsouza, Sadaf Sayyed, Susan Crasta, Shlok Achrekar, Sandeep Chouhan, Maaz Sunasara, Sarvesh Phate, Abdul Shaikh, Mintu Kumar, Vipul Yadav, Nazir Khan";
        String[] names = s.split(", "); // comma and space
        for(String n:names)
        {
            System.out.println(n);
        }
    }
}

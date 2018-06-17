package arraydemo;

public class ArrayDemo 
{
    public static void main(String[] args) 
    {
        String[] names = {"Ethan","Arsh","Sadaf","Susan","Sarvesh","Samim","Jash","Abhishek","Nihal","Shlok","Mintu","Ajay"};
        
        //using for loop
//        for(int i=0;i<names.length;i++)
//        {
//            System.out.println(names[i]);
//        }
        
        //using enhanced for loop
        for(String s:names)
        {
            System.out.println(s);
        }
    }
}

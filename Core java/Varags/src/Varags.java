
public class Varags {

    
    public static void main(String[] args) {
        Varags v= new Varags();
        v.displayint(10,20,22,25);
        v.displaystring("mintu","kumar","chauhan");
    }

    
    
    
    void displayint( int ... a)
    {
        
        for( int d:a)
        {
        System.out.println(" the data is "+d);
        }
        
    }
    void displaystring( String ... b)
    {
        
        for(String s:b)
        {
        System.out.println(" the name is "+ s);
        }
    }
    
}

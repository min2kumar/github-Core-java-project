package populationdemo;

public class PopulationDemo 
{
    public static void main(String[] args) 
    {
        int t,m,l,i;
        
        t=80000;
        m=t*52/100;
        l=m*35/100;
        i=m-l;  //i=m*65/100
        
        System.out.println("Illiterate men "+i);
    }
}

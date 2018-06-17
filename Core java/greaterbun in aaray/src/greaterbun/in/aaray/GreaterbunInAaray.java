
package greaterbun.in.aaray;



import java.util.Scanner;

public class GreaterbunInAaray {

    
    public static void main(String[] args) {
        
        New n= new New();
        n.getnum();
        n.larg();
               
        
    }
    
}


class New
{
    int a[]= new int[10];
    Scanner s= new Scanner(System.in);
    private int largest;
   
    void getnum()
    {
        
        for (int i=0;i<10;i++)
        {
            System.out.println(" plaease enter the number");
            a[i]=s.nextInt();
            
            
        }
        
         for (int i=0;i<10;i++)
        {
            System.out.println(" the number of index"+i+" is" +"   "+a[i]);
            
            
            
        }
        
        
    }
    
    void larg(int smalest)
            
    {
        int larg;
        int small;
        for(int i=0;i<number.lenth;i++)
        {
        
        if(a[i]>largest)
        {
            larg=largest();
            
            System.out.println("the greatest number is "+larg);
        }
        else{
            
            if(a[i]<smalest)
            {
                small=smalest();
            System.out.println(" please"+small);
            }
        }
        
        }
        }

    private int smalest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int largest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void larg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
       
  
    
    
    
    



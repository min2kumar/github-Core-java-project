
package objectclass;

import java.util.Scanner;

public class Objectclass
{
 
   long pchoice;
   String pan;
    
        int  how;
         long absorb;
         int t;
    Scanner s= new Scanner(System.in);
    public static void main(String[] args)
    {
        
        Objectclass obj = new Objectclass();
        obj.proim();
    
    }
   
   
  
    void prime3()
            {   
            
           // do{
            System.out.println(" how many number you want to enter");
             how= s.nextInt();
             long [] tem = new long[(int)how];
             
              for(int il=0; il<how;il++)
              {
                  System.out.println(" enter the---"+(il+1)+"number");
                  tem[il]=s.nextLong();
                  
                  
              }
              System.out.println(" the number you entered is ");
              
              for(long show:tem)
             {
                  System.out.println(show);
             }
            
              for( t=0;t<how;t++);
               {
                    absorb=tem[t];
                   if (absorb==0)
                  {
                       System.out.println(absorb+" is not prime number");
                   }
                  else {
                       int countp=0;
                       for(int j= 1; j<=absorb;j++)
                       {
                           System.out.println(absorb);
                           System.out.println(j);
                          
                         if(absorb%j==0)
                        {
                            countp++;
                         }
                           }
                      if(countp==2)
                        {
                              System.out.println( absorb+"---is prime number");
                         }
                           
                       }
               }
            }
    
    
                         void proim()
                         { 
                             do{
                             System.out.println(" how many number you want to enter ");
                             how=s.nextInt();
                             long tem []= new long[how];
                             for(int i=0;i<how;i++)
                             {
                             System.out.println(" enter  the"+(i+1)+" number ");
                             tem[i]=s.nextLong();
                             
                             }
                            
               for (int i=0; i<how; i++)
            { 
                 int nocount=0;
            for(int j= 1; j<=tem[i];j++)
            { 
            if(tem[i]%j==0)
            {
            nocount++;   
            }
            }
            
            if(nocount==2)
            {  
            System.out.println("prime number is "+tem[i]);
            }

            }
            
            

            
                         
                       
                  
                     
           
               System.out.println(" one more try y/n");
               pan=s.next();
          }while(pan.equals("y")||(pan.equals("Y")));
    
}
}

package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
     
        
        Polymorphism p = new Polymorphism();
        p.add(10,20);
        p.add(15, 25, 30);
        p.add(5/5, 6/6, 8/8);
    }

    
     void add(int a,int b){
         System.out.println(" the addtition is "+(a+b));
     }
    
     void add( int a, int b, int c )
     {
         System.out.println(" the addition is "+(a+b+c));
         
     }
     
     void add(float a, float b, float c)
     {
         System.out.println(" the addition is"+ (a+b+c));
         
              }
}

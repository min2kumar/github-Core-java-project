package switchcase;

import java.util.Scanner;

public class Switchcase {
    int a,b;
    String d;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    Switchcase sw=new Switchcase();
    sw.get();
    sw.calc();

    }
    
    void get()
    {
        System.out.println("please enter a first number");
        a=sc.nextInt();
        System.out.println("please enter a second number");
        b=sc.nextInt();
    }
    
    void calc()
    { int ch;
        
        System.out.println("please enteryour choice");
        System.out.println("1    for addition");
        System.out.println("2    for subtraction");
        System.out.println("3    for multiplication");
        System.out.println("4    for division");
        System.out.println("5    for remainder");
        System.out.println("6    for swapping");
        ch=sc.nextInt();
        
        switch(ch){
            case 1:
                System.out.println(" the addition is"+(a+b));
                break;
            case 2:
                 System.out.println(" the addition is"+(a-b));
                break;
            case 3:
                System.out.println(" the addition is"+(a*b));
                break;
            case 4:
                System.out.println(" the addition is"+(a/b));
                break;
            case 5:
                System.out.println(" the addition is"+(a%b));
                break;
            case 6:
                  System.out.println("value before swapping"+a);
        System.out.println("value before swapping"+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("value after swapping"+a);
        System.out.println("value after swapping"+b);
                break;
            default:
                System.out.println("invalid choice ");
                System.out.println("enter between 1 to 6 ");
                get();
                break;
        }
       
        
          System.out.println(" do you want to continue press yes /no");
        d = sc.next();
        System.out.println("");
        if ("yes".equals(d)) {
            System.out.println("NICE to see you again");
           get();
           calc();

        } else {
            System.out.println("thank you for participation");
        }
}
        
    }
   
        



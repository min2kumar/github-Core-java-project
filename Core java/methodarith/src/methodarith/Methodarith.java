
package methodarith;

import java.util.Scanner;

public class Methodarith {
   
    public static void main(String[] args) {
        Arithop ar=new Arithop();
       
              ar.first();
          
    } 
    
}



class Arithop
{int a,b,ch;
double ans;
    String e;
Scanner sc = new Scanner(System.in);

void first()
{      takeval();
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
                add();
                break;
            case 2:
                sub();
                break;
            case 3:
                multi();
                break;
            case 4:
                div();
                break;
            case 5:
                remain();
                break;
            case 6:
                swapp();
                break;
            default:
                System.out.println("invalid choice ");
                System.out.println("enter between 1 to 6 ");
                first();
                break;
        }
        dis();
        
          System.out.println(" do you want to continue press yes /no");
        e = sc.next();
        System.out.println("");
        if ("yes".equals(e)) {
            System.out.println("NICE to see you again");
           first();

        } else {
            System.out.println("thank you for participation");
        }
}
    void takeval()
    {
        
        
        System.out.println("please enter a first number");
        a=sc.nextInt();
        System.out.println("please enter a second number");
        b=sc.nextInt();
    }
    
    void add()
    {
       ans=a+b; 
    } 
    void sub()
    {
        ans=a-b;
       
    }
    void multi()
    {
       ans=a*b; 
    }
    void div()
    {
       ans=a/b; 
    }
    void remain()
    {
       ans=a%b;
       
    }
    void swapp()
    {
        System.out.println("value before swapping"+a);
        System.out.println("value before swapping"+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("value after swapping"+a);
        System.out.println("value after swapping"+b);
    }
    void dis()
    {
        System.out.println(" the answer is"+ans);
    }
}
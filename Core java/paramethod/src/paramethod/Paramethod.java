package paramethod;

import java.util.Scanner;

public class Paramethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String nm;

        Operation op = new Operation();
        System.out.println(" enter your name here");
        nm = sc.next();

        System.out.println(" enter first number");
        a = sc.nextInt();
        System.out.println(" enter  second  number");
        b = sc.nextInt();

        op.value(nm, a, b);

    }
void abc()
{
    
}
}

class Operation {

    int a, b,  d;
    double c;
    String e,f;
    Scanner sc = new Scanner(System.in);

    void value(String nm, int num1, int num2) {
        a = num1;
        b = num2;
if( "yes".equals(f))
{System.out.println(" enter first number");
        a = sc.nextInt();
        System.out.println(" enter  second  number");
        b = sc.nextInt();
    
}

        System.out.println("Welcome  mr/mrs    "+"[" + nm + "]"+"  press your  choice");
        System.out.println("");
        System.out.println("for addition        press  1");
        System.out.println("for subtraction     press  2");
        System.out.println("for multiplication  press  3");
        System.out.println("for division        press  4");
        System.out.println("for remainder       press  5");
        System.out.println("for swappimg        press  6");
        d = sc.nextInt();
        System.out.println("  ");

        switch (d) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                multiply(a, b);
                break;
            case 4:
                div(a, b);
                break;
            case 5:
                remainder(a, b);
                break;
            case 6:
                swapp(a,b);
                break;
            default:
                System.out.println(" plase enter number between 1 to 5");
                System.out.println("");
                value(nm, a, b);
                
        }

        System.out.println(" do you want to continue press yes /no");
        e = sc.next();
        System.out.println("");
        if ("yes".equals(e)) {
            System.out.println("do you want to enter a new number enter yes");
            System.out.println("if you don't want  new number and use existing number enter no");
            System.out.println("");
            f=sc.next();
            if("yes".equals(f)){
                 System.out.println("NICE to see you again");
            value(nm, num1, num2);
            }
            else
            {
                 System.out.println("NICE to see you again");
            value(nm, num1, num2);
            }
           
        
        } else {
            System.out.println("thank you for participation mr /mrs "+"["+nm+"]");
        }

    }

    void add(int x, int y) {
        a = x;
        b = y;
        c = a + b;
        System.out.println(" the answer after addition  is " + c);
    }

    void sub(int x, int y) {
        a = x;
        b = y;
        c = a - b;
        System.out.println(" the answer after subtractio is " + c);
    }

    void multiply(int x, int y) {
        a = x;
        b = y;
        c = a * b;
        System.out.println(" the answer after multiplication is " + c);
    }

    void div(int x, int y) {
        a = x;
        b = y;
        c = a / b;
        System.out.println(" the answer after divisionis " + c);
    }

    void remainder(int x, int y) {
        a = x;
        b = y;
        c = a % b;
        System.out.println(" the remainder is  " + c);

    }
    void swapp(int x,int y)
    {a=x;
    b=y;
        System.out.println("value before swapping "+a);
        System.out.println("value before swapping "+b);
    a=a+b;
    b=a-b;
    a=a-b;
        System.out.println("value after swapping"+a);
        System.out.println("value after swapping"+b);
        
    }

}

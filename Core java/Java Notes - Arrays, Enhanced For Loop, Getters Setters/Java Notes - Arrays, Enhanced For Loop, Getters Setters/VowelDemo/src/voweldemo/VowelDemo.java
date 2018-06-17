package voweldemo;

import java.util.Scanner;

public class VowelDemo 
{
    public static void main(String[] args) 
    {
//        char c;
        String c;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a character");
//        c=s.next().charAt(0);
        c=s.next();
        
        switch(c)
        {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("It is a Vowel");
                break;
                
            default:
                System.out.println("It is a Consonant");
        }
    }
}

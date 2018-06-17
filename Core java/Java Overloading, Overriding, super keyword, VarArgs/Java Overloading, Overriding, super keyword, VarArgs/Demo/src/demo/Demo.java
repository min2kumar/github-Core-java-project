package demo;

import java.util.Scanner;

public class Demo 
{
    public static void enterData()
    {
        System.out.println("enterData method is invoked");
    }
    public static void displayData()
    {
        System.out.println("displayData method is invoked");
    }
    public static void main(String[] args) 
    {
        int c;
        Scanner obj = new Scanner(System.in);
        
        do
        {
        System.out.println("--Menu--");
        System.out.println("1. Enter Data");
        System.out.println("2. Display Data");
        System.out.println("3. Exit");
        System.out.println("Choose the option");
        c=obj.nextInt();
        
        switch(c)
        {
            case 1:
                enterData();
                break;
                
            case 2:
                displayData();
                break;
                
            case 3:
                System.out.println("Bye");
                break;
                
            default:
                System.out.println("Invalid Option");
        }
        }while(c!=3);
    }
}

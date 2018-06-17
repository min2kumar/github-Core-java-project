package employeedetails;

import java.util.Scanner;

public class EmployeeDetails 
{
    public void enterData()
    {
        System.out.println("enterData method is invoked");
    }
    public void displayData()
    {
        System.out.println("displayData method is invoked");
    }
    public void exit()
    {
        System.out.println("exit method is invoked");
    }
    public static void main(String[] args) 
    {
        int c;
        
        Scanner s = new Scanner(System.in);
        EmployeeDetails obj = new EmployeeDetails();
        
        System.out.println("---Menu---");
        System.out.println("1. Enter Data");
        System.out.println("2. Display Data");
        System.out.println("3. Exit");
        System.out.println("Choose the option");
        c=s.nextInt();
        
        switch(c)
        {
            case 1:
                obj.enterData();
                break;
                
            case 2:
                obj.displayData();
                break;
                
            case 3:
                obj.exit();
                break;
                
            default:
                System.out.println("Invalid Input");
        }
    }
}

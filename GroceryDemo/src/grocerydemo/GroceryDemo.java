
package grocerydemo;

import java.util.Scanner;
import javafx.application.Platform;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import jdk.nashorn.internal.objects.Global;


public class GroceryDemo
{
private String nm,a;
private int add,remove,weight,ans;
private Scanner s= new Scanner (System.in);

public static void main(String[] args) {
GroceryDemo  g= new GroceryDemo();
g.get();
}



void get()
{

System.out.println(" enter grocery name");
nm= s.next();
System.out.println(" enter  the required weight ");
weight=s.nextInt();
accept();
}

void accept()
{

do{
System.out.println(" do you want to add some more weight or remove ");
System.out.println(" 1) for adding the weight ");
System.out.println(" 2) for removing the weight ");
System.out.println(" 3) for showing the current  details  ");
System.out.println(" 4) exit from here  ");
ans=s.nextInt();

switch(ans)
{
case 1:
add();
break;
case 2:
remove();
 break;
 case 3:
     display();
     break;
 case 4:
     System.exit(ans);
     
    
 default:
     System.out.println(" please enter a valid input");
     accept();




}
System.out.println(" do you want to repeat  procedure y/n");
a= s.next();


}while(a.equals("y") );
display();
}


void add()
{
    System.out.println(" enter the weight you want to add");
    add= s.nextInt();
weight=weight+add;
    System.out.println(" added succesfully");
}

void remove()
{
    System.out.println(" enter the weight that you want to remove ");
    remove=s.nextInt();
weight=weight-remove;
    System.out.println(" removed succesfully");


}


void display()
{
System.out.println(" -------details is------ ");
System.out.println("  glocery name  *****"+nm);
System.out.println("  current weight   >>"+weight);
System.out.println(" do you want to repeat  procedure y/n");
a= s.next();

}

}

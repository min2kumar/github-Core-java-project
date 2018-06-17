
                            package enumdemo;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
                            import java.util.Scanner;

                            public class Enumdemo
                            {
 int a;
 Scanner s= new Scanner(System.in);

                            public static void main(String[] args) 
                            { 
                                Enumdemo e= new Enumdemo();
                                e.day();
                            
                          
                            }
                            
                            void day()
                            {
                                  Week w= new Week();
                            System.out.println(" == ENTER ANMY NUMBER BETWEEN 1 TO 7 TO KNOW THE DATE =====");
                            a=s.nextInt();
                            switch(a)
                            {
                            case 1:
                            w.changeday(Weekday.SUNDAY);
                            break;
                            case 2:
                            w.changeday(Weekday.MONDAY);
                            break;
                            case 3:
                            w.changeday(Weekday.TUESDAY);
                            break;
                            case 4:
                            w.changeday(Weekday.WEDNESDAY);
                            break;
                            case 5:
                            w.changeday(Weekday.THURSDAY);
                            break;
                            case 6:
                            w.changeday(Weekday.FRIDAY);
                            break;
                            case 7:
                            w.changeday(Weekday.SATURDAY);
                            break;
                            default:
                            System.out.println(" polease enter number betwwen 1 to 7 only ");
                                day();
                            break;






                            }
                            
                            }

                            }



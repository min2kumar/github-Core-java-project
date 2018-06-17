
package enumdemo;

public class Week
 {
    Weekday w =Weekday.SUNDAY;
    void changeday( Weekday w)
    {
        this.w=w;
        
        switch(this.w)
        {
            case MONDAY:
                System.out.println(" today is monday");
                break;
            case TUESDAY:
                System.out.println(" today is tuesday");
                break;
            case FRIDAY:
                System.out.println(" today is friday");
                break;
            case SATURDAY:
                System.out.println(" today is saturday");
                break;
            case SUNDAY:
                System.out.println(" today is sunday");
                break;
            case THURSDAY:
                System.out.println(" today is thrusday");
                break;
                case WEDNESDAY:
                    System.out.println(" today is wednesday");
            
        }
    }
    

}

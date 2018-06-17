package enumdemo1;

import static enumdemo1.Profile.*;

public class Mobile 
{
    //member variable
    private Profile profile = GENERAL;  //private int id = 1
    
    //member method
    public void changeProfile(Profile profile)
    {
        this.profile=profile;
        switch(this.profile)
        {
            case FLIGHT:
                System.out.println("Mobile is in Flight mode");
                break;
                
            case GENERAL:
                System.out.println("Mobile is in General mode");
                break;
                
            case MEETING:
                System.out.println("Mobile is in Meeting mode");
                break;
                
            case OUTDOOR:
                System.out.println("Mobile is in Outdoor mode");
                break;
                
            case SILENT:
                System.out.println("Mobile is in Silent mode");
                break;
                
            case VIBRATION:
                System.out.println("Mobile is in Vibration mode");
                break;
                
        }
    }
}

package testenum;
import static testenum.Profile.*;
public class Mobile 
{
    private Profile profile=GENERAL;
    public void changeProfile(Profile profile)
    {
        this.profile=profile;
        switch(this.profile)
        {
            case FLIGHT:
                System.out.println("Mobile is in Flight mode");
                break;
                
            case GENERAL:
                System.out.println("Mobils is in General mode");
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
                
            default:
                System.out.println("No such profile");
        }
    }
}

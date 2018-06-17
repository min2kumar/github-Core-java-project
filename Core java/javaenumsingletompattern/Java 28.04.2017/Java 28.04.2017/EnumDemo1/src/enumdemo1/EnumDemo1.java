package enumdemo1;

import static enumdemo1.Profile.*;

public class EnumDemo1 
{
    public static void main(String[] args) 
    {
        Mobile m = new Mobile();
        
        m.changeProfile(SILENT);
        m.changeProfile(GENERAL);
        m.changeProfile(FLIGHT);
        m.changeProfile(OUTDOOR);
        m.changeProfile(SILENT);
        m.changeProfile(MEETING);
        m.changeProfile(VIBRATION);
    }
}

package testenum;

public class Main 
{
    public static void main(String[] args) 
    {
        Mobile m = new Mobile();
        m.changeProfile(Profile.FLIGHT);
        m.changeProfile(Profile.MEETING);
        m.changeProfile(Profile.GENERAL);
        m.changeProfile(Profile.SILENT);
        m.changeProfile(Profile.OUTDOOR);
    }
}

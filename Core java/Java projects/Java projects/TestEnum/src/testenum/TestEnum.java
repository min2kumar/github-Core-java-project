package testenum;

public class TestEnum 
{
    public static void main(String[] args) 
    {
        Mobile m = new Mobile();
        m.changeProfile(Profile.SILENT);
        m.changeProfile(Profile.FLIGHT);
        m.changeProfile(Profile.GENERAL);
        m.changeProfile(Profile.SILENT);
        m.changeProfile(Profile.VIBRATION);
        m.changeProfile(Profile.OUTDOOR);
    }
}

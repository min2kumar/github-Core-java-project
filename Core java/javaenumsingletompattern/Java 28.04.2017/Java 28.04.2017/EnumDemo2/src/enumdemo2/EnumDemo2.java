package enumdemo2;

import static enumdemo2.Mode.*;

public class EnumDemo2 
{
    public static void main(String[] args) 
    {
        Computer c = new Computer();
        
        c.changeMode(SLEEP);
        c.changeMode(RESTART);
        c.changeMode(SHUTDOWN);
        c.changeMode(STARTUP);
        c.changeMode(SIGNOUT);
        c.changeMode(SLEEP);
        c.changeMode(SLEEP);
        
    }
}

package demo;
import static demo.Mode.*;
public class Test 
{
    public static void main(String[] args) 
    {
        Computer c = new Computer();
        c.changeMode(RESTART);
        c.changeMode(SHUTDOWN);
        c.changeMode(SIGNOUT);
        c.changeMode(STARTUP);
        c.changeMode(SLEEP);
        c.changeMode(SWITCHUSER);
    }
}

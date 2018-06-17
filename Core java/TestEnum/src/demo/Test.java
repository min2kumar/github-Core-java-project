package demo;

public class Test 
{
    public static void main(String[] args) 
    {
       Computer c = new Computer();
       c.changeMode(Mode.RESTART);
       c.changeMode(Mode.STARTUP);
       c.changeMode(Mode.SLEEP);
       c.changeMode(Mode.SIGNOUT);
    }
}

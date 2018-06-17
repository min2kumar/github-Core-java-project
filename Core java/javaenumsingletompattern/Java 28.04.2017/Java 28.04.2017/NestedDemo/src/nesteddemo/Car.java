package nesteddemo;

public class Car //enclosing class/outer class
{
    Engine e = new Engine();
    boolean running = false;
    class Engine//nested class/inner class
    {
        public void start()
        {
            System.out.println("Engine is started");
            running = true;
            System.out.println("Car is running");
        }
    }
    public void start()
    {
        System.out.println("Car started");
        e.start();
    }
}

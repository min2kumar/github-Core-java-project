package nesteddemo;

public class NestedDemo 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.start();
        
        //Engine e = new Engine();
        Car.Engine e = c.new Engine();
    }
}

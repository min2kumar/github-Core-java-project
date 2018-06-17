package wrapperdemo;

public class WrapperDemo 
{
    public static void m1()
    {
        //boxing = converting value type to reference type
        Integer i = new Integer(10);
        Float f = new Float(5.5f);
        Double d = new Double(1.1);
        Long l = new Long(12L);
        Character c = new Character('A');
        
        //unboxing = converting reference type to value type
        int a = i.intValue();
        float b = f.floatValue();
        double e = d.doubleValue();
        long g = l.longValue();
        char h = c.charValue();
    }
    public static void m2()
    {
        //autoboxing = converting value type to reference type
        Integer i = 10;
        Float f = 5.5f;
        Double d = 1.1;
        Long l = 12L;
        Character c = 'A';
        
        //autounboxing = converting reference type to value type
        int a = i;
        float b = f;
        double e = d;
        long g = l;
        char h = c;
    }
    public static void main(String[] args) 
    {
        
    }
}

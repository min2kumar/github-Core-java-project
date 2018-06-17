package varargs;

public class VarArgs 
{
//    public void sum(int a, int b)
//    {
//        System.out.println(a+b);
//    }
//    public void sum(int a, int b, int c)
//    {
//        System.out.println(a+b+c);
//    }
    public void sum(int... a)
    {
        int t=0;
        for(int i:a)
        {
            t+=i;
        }
        System.out.println(t);
        System.out.println(t/a.length);
    }
    public static void main(String[] args) 
    {
        VarArgs obj = new VarArgs();
        obj.sum(10,20);
        obj.sum(10,20,30);
        obj.sum(10,20,30,40,50,60,70);
    }
}

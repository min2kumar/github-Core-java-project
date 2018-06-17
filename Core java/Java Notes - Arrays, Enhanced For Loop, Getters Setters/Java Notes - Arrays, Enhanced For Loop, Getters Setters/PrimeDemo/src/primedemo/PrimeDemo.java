package primedemo;

public class PrimeDemo 
{
    public static void main(String[] args) 
    {
        for(int i=2;i<=50;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println("Prime Number "+i);
                System.out.println("Count is "+c);
            }
        }
    }
}

package comparatordemo;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product>
{

    //sort logic
    @Override
    public int compare(Product p1, Product p2) 
    {
        //sort by price
        if(p1.getPrice()>p2.getPrice())
        {
            return 1;
        }
        else if(p1.getPrice()<p2.getPrice())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

}

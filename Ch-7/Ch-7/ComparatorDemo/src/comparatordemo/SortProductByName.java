package comparatordemo;

import java.util.Comparator;

public class SortProductByName implements Comparator<Product>
{
    //sort logic
    @Override
    public int compare(Product p1, Product p2) 
    {
        //sort by name - ascending
        int r = p1.getName().compareTo(p2.getName());
        if(r>0)
        {
            return 1;
        }
        else if(r<0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

}

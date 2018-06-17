
package comparableddemo;

import java.util.Comparator;

public class SortByName implements Comparator<Product>


 {

    @Override
    public int compare(Product p1, Product p2)
    {
        int r=p1.getName().compareTo(p2.getName());
        if(r>1)
        {
            return 1;
        }else if(r<1)
        {
            return -1;
        }else{
            return 0;
        }
    }

}

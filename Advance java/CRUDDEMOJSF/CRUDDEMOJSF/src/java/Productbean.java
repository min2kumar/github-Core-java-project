
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Productbean 
{
    private Product p= new Product();
    private ArrayList<Product>products= new ArrayList<>();
    private boolean flag=false;

    
    
    
    public void add()
    {
        p=new Product(0, name , gender , 0, dept , 0);
        
    }
    
    
    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    
    
}

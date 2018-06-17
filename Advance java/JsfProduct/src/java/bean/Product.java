
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


@ManagedBean

public class Product implements Serializable
{
    private int id;
    private String name;
    private int price;
    private List<Product> p;
    
        public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
        
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
   
    
  

    public List<Product> getP() {
        return p;
    }

    public void setP(List<Product> p) {
        this.p = p;
    }
    
      public  String doit()
    {
        p= new  ArrayList<Product>();
        
         p.add( new Product(1, "mintu", 25000));
          return "Display";
    }
    
    
}

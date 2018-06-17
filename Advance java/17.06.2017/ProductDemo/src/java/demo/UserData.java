
package demo;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Product;

@ManagedBean(name = "userData")
@SessionScoped
public class UserData
{
    private int id;
    private int price;
    private String name;
    private ArrayList<Product> products=new ArrayList<>();

    public UserData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String addProduct()
    {
        Product p=new Product(id, price, name);
        products.add(p);
        return "Success";
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
}

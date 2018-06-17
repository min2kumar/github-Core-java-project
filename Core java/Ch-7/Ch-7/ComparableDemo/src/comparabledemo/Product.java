package comparabledemo;

public class Product implements Comparable<Product>
{
    private String name;
    private int price;
    private String brand;

    public Product() {
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }
    //business logic
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    //sort logic
    @Override
    public int compareTo(Product p) 
    {
        //sort by price ascending order
//        if(this.price>p.price)
//        {
//            return 1;
//        }
//        else if(this.price<p.price)
//        {
//            return -1;
//        }
//        else
//        {
//            return 0;
//        }
        //sort by name ascending order
        int r = this.name.compareTo(p.name);
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

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", brand=" + brand + '}';
    }
    
}

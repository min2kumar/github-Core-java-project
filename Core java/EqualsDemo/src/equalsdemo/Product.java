package equalsdemo;

public class Product 
{
 private int id;
 private String name;
 private int price;

 public Product() {
 }

 public Product(int id, String name, int price) {
  this.id = id;
  this.name = name;
  this.price = price;
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

 @Override
 public boolean equals(Object obj) 
 {
  Product p = (Product)obj;
  if(this.id==p.id&&this.name.equals(p.name)&&this.price==p.price)
  {
   return true;
  }
  else
  {
   return false;
  }
 }
 
}

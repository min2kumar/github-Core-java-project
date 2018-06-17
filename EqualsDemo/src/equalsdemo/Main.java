package equalsdemo;

public class Main 
{
    public static void main(String[] args) 
    {
//     Customer nihal = new Customer(2,"Nihal",19,"nihal@gmail.com");
//     Customer nazir = new Customer(2,"Nihal",19,"nihal@gmail.com");
//     nihal=nazir;
//     if(nihal.equals(nazir))
//     {
//      System.out.println("Both are equal");
//     }
//     else
//     {
//      System.out.println("Not equal");
//     }
     Product p1 = new Product(1,"A",500);
     Product p2 = new Product(1,"a",500);
//     p1=p2;
     if(p1.equals(p2))
     {
      System.out.println("Both are equal");
     }
     else
     {
      System.out.println("Not equal");
     }
    }
}

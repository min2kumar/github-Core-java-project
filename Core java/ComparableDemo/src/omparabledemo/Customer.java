
package omparabledemo;

public class Customer implements Comparable<Customer>
 {
  private int id;
  private String name;
  private int number;

    public Customer() {
    }

    public Customer(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    @Override
    public int compareTo(Customer c) {
         
        if(this.id>c.id)
        {
          return 1;
        } else if(this.id<1)
        {return -1;
        }
            else
            {
                  return 0;  
                    }
        }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", number=" + number + '}';
    }
 
}
  


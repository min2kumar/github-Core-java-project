
package listdeno;

public class Customer
 {
  private int id;
  private int age;
  private String name;

    public Customer() {
    }

    public Customer(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", age=" + age + ", name=" + name + '}';
    }
    
  
}

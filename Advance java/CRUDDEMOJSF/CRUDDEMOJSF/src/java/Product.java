
public class Product 
{
private int id;
private String name;
private String gender;
private int age;
private String dept;
private int salary;

    public Product(int id, String name, String gender, int age, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


  
}

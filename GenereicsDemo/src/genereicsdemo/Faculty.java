
package genereicsdemo;

public class Faculty
 {
    private String name;
    private int id;
 private int age;
    private int salary;
    public Faculty(String name, int id, int age, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public Faculty() {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
   
}

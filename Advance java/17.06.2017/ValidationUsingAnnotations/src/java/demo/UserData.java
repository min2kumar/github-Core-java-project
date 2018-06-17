
package demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.*;
@ManagedBean(name = "userData")
@SessionScoped
public class UserData 
{
    
    @Size(min = 5, max = 10,message = "First name length should be 5 to 10")
    private String fname;
    @NotNull(message = "Last name can't be null")
    private String lname;
    
    @DecimalMin(value = "100.00",message = "salay must be minimum 100.00")
    @DecimalMax(value = "10000.00",message = "max sal 10000.00")
    private float sal;
    
//    @Digits(integer = 1,fraction = 2,message = "salay must be minimum 100.00")
    
    @Max(value = 120,message = "Age Cannot be greater than 120")
    @Min(value = 18,message = "Age should be minimum than 18")
    private int age;
    
    
    public UserData() {
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    
}

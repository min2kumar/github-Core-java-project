package Model;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.util.Objects;

public class Student  
{
     private int id;
    private String name;
    private String email;
    private Integer mobile;

    private Student(int id, String name, String email, Integer mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public Student() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + '}';
    }
  
    
}

package Mintu;

public class UserDetails 
{
    private String name;
    private String mobile;


    public UserDetails() {
    }

    public UserDetails(String name,String mobile) {
        this.name = name;
        this.mobile = mobile;
        
    }

   

   

    public String getname() {
        return name;
    }

    public void setname(String fname) {
        this.name = name;
    }

   

   
    
    

    public String getmobile() {
        return mobile;
    }

    public void setmobile(String mobile) {
        this.mobile = mobile;
    }
    
}

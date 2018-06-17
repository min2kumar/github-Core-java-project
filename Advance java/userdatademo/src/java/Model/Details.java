
package Model;

public class Details 
{
    
    private static String name;
    private static String dob;
    private   static String color;
    private   static String gender;
    private   static String [] hobbies;

    public static String getGender() {
        return gender;
    }

    public static void setGender(String aGender) {
        gender = aGender;
    }

    public static String[] getHobbies() {
        return hobbies;
    }

    public static void setHobbies(String[] aHobbies) {
        hobbies = aHobbies;
    }

   
    

    public Details() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

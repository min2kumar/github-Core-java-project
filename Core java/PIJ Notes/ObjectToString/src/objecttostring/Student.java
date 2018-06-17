package objecttostring;

public class Student 
{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return "ID is "+id;
    }
    
}

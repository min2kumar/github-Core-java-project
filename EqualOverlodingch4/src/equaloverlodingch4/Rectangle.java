
package equaloverlodingch4;

public class Rectangle
 {
    long lenth,breadth;


    public long getLenth() {
        return lenth;
    }

    public void setLenth(long lenth) {
        this.lenth = lenth;
    }

    public long getBreadth() {
        return breadth;
    }

    public Rectangle(long lenth, long breadth) {
        this.lenth = lenth;
        this.breadth = breadth;
    }

    public void setBreadth(long breadth) {
        this.breadth = breadth;
    }

    public Rectangle() {
    }

    @Override
    public boolean equals(Object obj) {
        
        Rectangle rp= (Rectangle)obj;
        if(this.lenth==rp.lenth && this.breadth==rp.breadth)
                {
                    return true;
                }else
        {
            return  false;
        }
        
        
 }


    
    
               
    
    

}

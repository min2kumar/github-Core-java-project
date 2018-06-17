
package genereicsdemo;

public class TestAny <T>
 {
   private T t;

    public TestAny() {
    }

    public TestAny(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
   
 
}

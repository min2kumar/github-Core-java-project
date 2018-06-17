package Model;


public class Student
{
     private int sid;
     private String sname;
     private int sclass;
     private String scoll;

    public Student() {
    }

    public Student(int sid, String sname, int sclass, String scoll) {
        this.sid = sid;
        this.sname = sname;
        this.sclass = sclass;
        this.scoll = scoll;
    }

    public String getScoll() {
        return scoll;
    }

    public void setScoll(String scoll) {
        this.scoll = scoll;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSclass() {
        return sclass;
    }

    public void setSclass(int sclass) {
        this.sclass = sclass;
    }
     
     
     
     
     
}

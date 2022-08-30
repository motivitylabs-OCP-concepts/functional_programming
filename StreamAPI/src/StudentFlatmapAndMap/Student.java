package StudentFlatmapAndMap;

import java.util.List;

public class Student {
   private int id;
   private String ename;
    private String email;
   private List<String> phoneNo;

    public Student(int id, String ename, String email, List<String> phoneNo) {
        this.id = id;
        this.ename = ename;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
}

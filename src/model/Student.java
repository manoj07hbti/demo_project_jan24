package model;

public class Student {

      String Name ;
      String rolllNo ;
      String dept;

    // param construction
    public Student(String name, String rolllNo, String dept) {
        Name = name;
        this.rolllNo = rolllNo;
        this.dept = dept;
    }





      //getter and setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRolllNo() {
        return rolllNo;
    }

    public void setRolllNo(String rolllNo) {
        this.rolllNo = rolllNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

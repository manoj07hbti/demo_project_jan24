package model;

public class Student {

    String name;
    int rollNo;
    String dept;

    //param constructor

    public Student(String name, int rollNo, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
    }

    //getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

package model;

import java.util.Objects;

public class Student {

    String name;
    int rollNo;
    String dept;

    // override hashcode and equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name) && Objects.equals(dept, student.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, dept);
    }


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

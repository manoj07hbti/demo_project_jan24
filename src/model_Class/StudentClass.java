package model_Class;

public class StudentClass {
    String name;

    int rollNo;

    String Section;
    //Create param constructor


    public StudentClass(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        Section = section;
    }

    // use  getter and setter


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

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }


}

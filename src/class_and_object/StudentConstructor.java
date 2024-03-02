package class_and_object;

import java.util.SplittableRandom;

public class StudentConstructor {

    String name;
    String section;
    String collageName;
    Double attendancePercentage;
    int rollNo;
  //   Use Parameterized Constructor
    public StudentConstructor(String name, String section, String collageName, Double attendancePercentage, int rollNo) {
        this.name = name;
        this.section = section;
        this.collageName = collageName;
        this.attendancePercentage = attendancePercentage;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {

        StudentConstructor student = new StudentConstructor("Rohan","Science","A M college Law",56.33,44);

        System.out.println("Printing Student Name :"+student.name);
        System.out.println("Printing Student Section :"+student.section);
        System.out.println("Printing Student College Name :"+student.collageName);
        System.out.println("Printing Student attendancePercentage :"+student.attendancePercentage);
        System.out.println("Printing Student roll No :"+student.rollNo);

    }

}

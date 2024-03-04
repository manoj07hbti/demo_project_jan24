package demoClassAndObj;

public class StudentParam {
    String name;
    int RollNo;
    String subject;

    public StudentParam(String name, int rollNo, String subject) {
        this.name = name;
        RollNo = rollNo;
        this.subject = subject;
    }

    public static void main(String[] args) {
        StudentParam obj1=new StudentParam("Rahul",12,"science");
        System.out.println("Student name: "+obj1.name+ "Rollno: "+obj1.RollNo+ "Subject: "+obj1.subject);
    }
}

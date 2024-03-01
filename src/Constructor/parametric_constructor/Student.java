package Constructor.parametric_constructor;

public class Student {
    int Roll_no;
    String name;
    String batch;
    String course;
    double fee;


    public Student(int Roll_no, String name, String batch, String course, double fee) {
        this.Roll_no = Roll_no;
        this.name = name;
        this.batch = batch;
        this.course = course;
        this.fee = fee;

    }

    public static void main(String[] args) {
        Student student = new Student(1,"Idd","2024","java",600000);

        System.out.println("=======Student detail========\n"+"Name     : "+student.name+"\nRoll.No. : "+student.Roll_no
                             +"\nCourse   : "+student.course+"\nBatch    : "+student.batch+"\nFees     : "+student.fee);

        Student student1 =new Student(2,"Mohammad","2024","java",300000);

        System.out.println("=======Student detail========\n"+"Name     : "+student1.name+"\nRoll.No. : "+student1.Roll_no
                +"\nCourse   : "+student1.course+"\nBatch    : "+student1.batch+"\nFees     : "+student1.fee);

    }
}

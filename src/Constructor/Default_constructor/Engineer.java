package Constructor.Default_constructor;

public class Engineer {
    String Hno = "17265-M-29";
    String name = "Akhlad Khan";
    String Branch = "Mechanical Engineering";
    String semester = "iii";
    String Batch = "2017-20";

    public static void main(String[] args) {
        Engineer engineer = new Engineer();

        System.out.println("Hall ticket no.: "+ engineer.Hno);
        System.out.println("Student Name   : "+ engineer.name);
        System.out.println("Branch name    : "+ engineer.Branch);
        System.out.println(" Semester      : "+ engineer.semester);
        System.out.println(" Batch         : "+  engineer.Batch);
    }
}

package class_and_object;

public class StudentData {
    //properties : data member
     String name="Pankaj";

     String section="Biology";

     int rollNo=56;

     double percentage=71.60;

    public static void main(String[] args) {
        // ClassName objName= new ClassName(); // default Constructor

        StudentData student1 = new StudentData();

        System.out.println("Printing Student Details : "+student1.name+"section:"+student1.section+"rollNo :"+student1.rollNo+"percentage:"+student1.percentage);
    }
}




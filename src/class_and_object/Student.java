package class_and_object;

public class Student {

    String Name = "Rajeev";
    String Section = "IT";
    String CourseName = "Java";
    int age = 38;
    String Semester ="Final";

    public static void main(String[] args) {

        Student Student1 = new Student();

        System.out.println("Printing Student Name :"+Student1.Name);
        System.out.println("Printing Student Section :"+Student1.Section);
        System.out.println("Printing Student CourseName :"+Student1.CourseName);
        System.out.println("Printing Student age :"+Student1.age);
        System.out.println("Printing Student Semester :"+Student1.Semester);



    }





}

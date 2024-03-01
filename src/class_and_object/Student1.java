package class_and_object;

public class Student1 {
    String Name;
    String Section;
    String CourseName;
    int age;
    String Semester;

    public Student1(String name, String section, String courseName, int age, String semester) {
        Name = name;
        Section = section;
        CourseName = courseName;
        this.age = age;
        Semester = semester;
    }

    public static void main(String[] args) {
        Student1 Student2 = new Student1("Rajeev","IT","Java",38,"Final");
        System.out.println("Printing Student1 Name:"+Student2.Name);
        System.out.println("Printing Student1 Section:"+Student2.Section);
        System.out.println("Printing Student1 CourseName:"+Student2.CourseName);
        System.out.println("Printing Student1 Age:"+Student2.age);
        System.out.println("Printing Student1 Semester:"+Student2.Semester);

    }



}

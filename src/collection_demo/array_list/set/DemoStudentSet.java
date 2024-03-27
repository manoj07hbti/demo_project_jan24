package collection_demo.array_list.set;

import model.Student;

import java.util.HashSet;

public class DemoStudentSet {

    public HashSet<Student> createStudentSet(){

        HashSet<Student> studentHashSet= new HashSet<>();

        Student student1 = new Student("Raj",1,"CS");
        System.out.println("HashCode of student1: "+student1.hashCode());

        Student student2 = new Student("Raj",1,"CS");
        System.out.println("HashCode of student2: "+student2.hashCode());

        Student student3 = new Student("Rahul",3,"CS");
        System.out.println("HashCode of student3: "+student3.hashCode());

        Student student4 = new Student("Mukesh",4,"CS");
        System.out.println("HashCode of student4: "+student4.hashCode());

        Student student5 = new Student("Mukesh",4,"CS");
        System.out.println("HashCode of student5: "+student5.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);

        return studentHashSet;
    }


    public static void main(String[] args) {

        DemoStudentSet obj = new DemoStudentSet();

        for(Student var : obj.createStudentSet()){

            System.out.println("Printing Set:: "+var.getName());
        }
    }
}

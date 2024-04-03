package collection;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    public ArrayList<Student> createStudentList(){

        // SYNTAX //CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<Student> studentArrayList=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Students you want to add : ");
        int number = scanner.nextInt();
        for (int i=1; i<=number; i++){
            System.out.println("Please Enter Name");
            String name = scanner.next();
            System.out.println("Please Enter rollNo");
            String rollNo = scanner.next();
            System.out.println("Please Enter dept");
            String dept = scanner.next();
            Student student1=new Student(name , rollNo , dept);

            studentArrayList.add(student1);
        }

        // create student data

        Student student1 = new Student("Somesh" , "4", "HR");
        Student student2 = new Student("Vinay" ,"2","DEO" );
        Student student3 = new Student("Praveen" , "8" , "CO");
        Student student4 = new Student("Amit" , "11" , "CS");
        Student student5 = new Student("Ajay" , "14", "IPS");

        // add data to list
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);



        return studentArrayList;

    }

    public static void main(String[] args) {
        StudentList obj = new StudentList();
        ArrayList<Student> students=obj.createStudentList();

        for(Student var : students){
            System.out.println("Printing Student Info Name : " +var.getName() + " rollNo : " +var.getRolllNo() + " Section : " +var.getDept());
        }


    }

}

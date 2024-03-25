package Collection;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

//TODO Ask user to give input like how many students you want to add :n
// it will ask n times to enter student information Name, rollNo and Section

public class Arraylistwithcustomobject {
    public ArrayList<Student> studentlist() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter number of students");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("please enter name");
            String name = scan.next();
            System.out.println("please enter age");
            int age = scan.nextInt();
            System.out.println("please enter Sec");
            String sec = scan.next();
            Student student1 = new Student(name, age, sec);


            studentArrayList.add(student1);
        }

        return studentArrayList;


    }

    public static void main(String[] args) {

        Arraylistwithcustomobject Student = new Arraylistwithcustomobject();
        ArrayList<Student> S = Student.studentlist();

        for (Student var : S) {
            System.out.println("Name =  "+var.getName()+"   Age =  "  + var.getAge()+"  Sec  =  " + var.getSec());
        }


    }


}

package HashMap.adv;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Assign {
    /*we need to maintain data of multiple college
    Agra-----------> studentsList
    DPS -----------> studentsList
    JNU -----------> studentsList
    HashMap<String, ArrayList<Student>>
    Print details of JNU College*/

    public static void main(String[] args) {
        HashMap<String, ArrayList<Student>> map = new HashMap<>();

        ArrayList<Student> Agra = new ArrayList<>();
        ArrayList<Student> DPS = new ArrayList<>();
        ArrayList<Student> JNU = new ArrayList<>();

        Student Student_1 = new Student("raj", 25, "A");
        Student Student_2 = new Student("Rahul", 26, "B");
        Student Student_3 = new Student("Raja", 27, "A");
        Student Student_4 = new Student("priya", 28, "A");
        Student Student_5 = new Student("anjali", 29, "B");
        Student Student_6 = new Student("honey", 30, "C");
        Student Student_7 = new Student("riya", 31, "D");
        Student Student_8 = new Student("ayushi", 32, "A");
        Student Student_9 = new Student("ronak", 33, "C");
        Student Student_10 = new Student("shalini", 36, "A");
        Student Student_11 = new Student("ruchi", 25, "A");
        Student Student_12 = new Student("tara", 24, "C");
        Agra.add(Student_1);
        Agra.add(Student_2);
        Agra.add(Student_3);
        Agra.add(Student_4);
        DPS.add(Student_5);
        DPS.add(Student_6);
        DPS.add(Student_7);
        DPS.add(Student_8);
        JNU.add(Student_9);
        JNU.add(Student_10);
        JNU.add(Student_11);
        JNU.add(Student_12);
        map.put("Agra", Agra);
        map.put("DPS", DPS);
        map.put("JNU", JNU);

        Scanner scan = new Scanner(System.in);
        System.out.println("pls choose college 1= JNU , 2 = AGRA , 3 = DPS");
        int input = scan.nextInt();

        switch (input) {
            case 1: {
                for (Student student : JNU) {
                    System.out.println(student.getName());
                }
                break;
            }
            case 2: {
                for (Student student : Agra) {
                    System.out.println(student.getName());
                }
                break;

            }
            case 3: {
                for (Student student : DPS) {
                    System.out.println(student.getName());
                }
                break;

            }
            default: {
                System.out.println("Invalid choice");
            }
            break;
        }


    }


}

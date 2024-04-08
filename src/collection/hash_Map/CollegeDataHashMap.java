package collection.hash_Map;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CollegeDataHashMap {
    //Data store with multiple college students.

    //DPS .....student list
    //JNU ....student list
    //TUNDLA......student list

    public static void main(String[] args) {
        HashMap<String, ArrayList<Student>> mapData = new HashMap<>();
        ArrayList<Student> DPS = new ArrayList<>();
        ArrayList<Student> JNU = new ArrayList<>();
        ArrayList<Student> TUNDLA = new ArrayList<>();

        Student Student1 = new Student("Pranav", "One", "BIO");
        Student Student2 = new Student("Atul", "TWO", "MATH");
        Student Student3 = new Student("Praveen", "THREE", "CS");
        Student Student4 = new Student("Aajeet", "FOUR", "EE");
        Student Student5 = new Student("Ajay", "FIVE", "IT");
        Student Student6 = new Student("Amit", "SIX", "AI");
        Student Student7 = new Student("Deepak", "SEVEN", "ME");
        Student Student8 = new Student("Yogesh", "EIGHT", "CIVIL");
        Student Student9 = new Student("Kelash", "NINE", "IT");
        Student Student10 = new Student("Naveen", "TEN", "Petro");
        Student Student11 = new Student("Vijay", "ELEVEN", "ART");
        Student Student12 = new Student("Tanvar", "TWELTH", "AG");


        DPS.add(Student1);
        DPS.add(Student2);
        DPS.add(Student3);
        DPS.add(Student4);

        JNU.add(Student5);
        JNU.add(Student6);
        JNU.add(Student7);
        JNU.add(Student8);

        TUNDLA.add(Student9);
        TUNDLA.add(Student10);
        TUNDLA.add(Student11);
        TUNDLA.add(Student12);

        mapData.put("DPS", DPS);
        mapData.put("JNU", JNU);
        mapData.put("TUNDLA", TUNDLA);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Choice  : 1 = DPS, 2 = JNU, 3 = TUNDLA ");

        int input = scanner.nextInt();

        //using loop.
        switch (input) {
            case 1: {
                for (Student student : DPS) {
                    System.out.println(student.getDept());
                }
                break;
            }
            case 2: {
                for (Student student : JNU) {
                    System.out.println(student.getDept());
                }
                break;
            }
            case 3:
                for (Student student : TUNDLA) {
                    System.out.println(student.getDept());
                }
                break;
            default: {
                System.out.println("INVALID CHOICE");

            }
            break;


        }
    }
}
package collection_array_list.hashmap;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student_Data {

    // TODO we need to maintain data of multiple college and Print details of JNU College only
    //  Agra-----------> studentsList
    //  DPS -----------> studentsList
    //  JNU -----------> studentsList
    //  HashMap<String, ArrayList<Student>>

    public static void main(String [] args){

        HashMap<String , ArrayList<Student>> map = new HashMap<>();

        ArrayList<Student> Agra = new ArrayList<>();
        ArrayList<Student> DPS = new ArrayList<>();
        ArrayList<Student> JNU = new ArrayList<>();

        Student student1 = new Student("Nitin" , "1" , "IT");
        Student student2 = new Student("Rajeev" , "2" , "IT");
        Student student3 = new Student("Neeru" , "3", "CS");
        Student student4 = new Student("Renu" , "4" , "CS");
        Student student5 = new Student("Shivani" , "5" , "Science");
        Student student6 = new Student("Himanshi" , "6" , "Art");
        Student student7 = new Student("Deepti" , "7" , "Doctor");
        Student student8 = new Student("Vardhan" , "8" , "Cricketer");
        Student student9 = new Student("Gaurav" , "9" , "Mechanical");
        Student student10 = new Student("Saurabh" , "10" , "Civil");
        Student student11 = new Student("Dhiraj" , "11" , "IT");
        Student student12 = new Student("Anoop" , "12" , "Finance");
        Student student13 = new Student("Amit" , "13" , "Finance");
        Student student14 = new Student("Suraj" , "14" , "Finance");
        Student student15= new Student("Rahul" , "15" , "Credit");

        Agra.add(student1);
        Agra.add(student2);
        Agra.add(student3);
        Agra.add(student4);
        Agra.add(student5);
        DPS.add(student6);
        DPS.add(student7);
        DPS.add(student8);
        DPS.add(student9);
        DPS.add(student10);
        JNU.add(student11);
        JNU.add(student12);
        JNU.add(student13);
        JNU.add(student14);
        JNU.add(student15);

        map.put("Agra" , Agra);
        map.put("DPS" , DPS);
        map.put("JNU" , JNU);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Press College 1 for AGRA , 2 For DPS , 3 for JNU");
        int input = scanner.nextInt();

        switch (input){
            case 1 : {
                for(Student student : Agra){
                    System.out.println("Printing Data for Agra :"+student.getName());
                }
                break;
            }
            case 2 : {
                for(Student student : DPS){
                    System.out.println("Printing Data for DPS :"+student.getName());
                }
                break;
            }
            case 3 : {
                for(Student student : JNU){
                    System.out.println("Printing Data for JNU :"+student.getName());
                }
                break;
            }
            default:{
                System.out.println("Printing Invalid Choice");
            }
            break;
        }

    }

}

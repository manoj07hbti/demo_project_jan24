package collection;

import model_Class.StudentClass;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemoList {
    int rollNo ;
    String name;
    double fees;
    public StudentDemoList(int rollNo, String name, double fees) {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
    }

    public int getId() {
        return rollNo;
    }

    public void setId(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
class user{
    public  ArrayList<StudentDemoList> student(){
        ArrayList<StudentDemoList> students=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print Number u want to store : ");


        int o = scanner.nextInt();

        for (int x=0;x<o;x++) {
            System.out.println("Print data ");
            System.out.println("Enter student details : ");
            System.out.println("Enter student rollNo : ");


            int i = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter student name : ");
            String n = scanner.nextLine();
            System.out.println("Enter student fees : ");
            double d = scanner.nextDouble();

            StudentDemoList student1 = new StudentDemoList(i,n,d);
            students.add(student1);
            System.out.println("Given Details is stored..");
        }
        return students;
    }

    public static void main(String[] args) {
        user user=new user();


        ArrayList<StudentDemoList> us = user.student();
        System.out.println("Print Name");
        System.out.print("printing data");


        for (StudentDemoList v :us){
            System.out.println();
            System.out.println("id : "+v.getId()+"\nname : "+v.getName()+ " \nfees : "+v.getFees());
            System.out.print("PrintName");
        }

    }
}

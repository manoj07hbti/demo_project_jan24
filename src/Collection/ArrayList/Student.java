package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int id ;
    String name;
    double fees;
    public Student(int id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    private  ArrayList<Student> student(){
        ArrayList<Student> students=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of student want to store : ");
        int o = scanner.nextInt();
        for (int k=0;k<o;k++) {
            System.out.println("=======================================");
            System.out.println("Enter student details : ");
            System.out.println("Enter student Id : ");
            int i = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter student name : ");
            String n = scanner.nextLine();
            System.out.println("Enter student fees : ");
            double d = scanner.nextDouble();

            Student student1 = new Student(i,n,d);
            students.add(student1);
            System.out.println("Given Details is stored..");
        }
        return students;
    }

     public static void main(String[] args) {
         user user=new user();
         ArrayList<Student> us = user.student();
         System.out.println("###########################");
         System.out.print("printing data");
         for (Student v :us){
             System.out.println();
             System.out.println("id : "+v.getId()+"\nname : "+v.getName()+ " \nfees : "+v.getFees());
             System.out.print("*****************************");
         }

     }
}

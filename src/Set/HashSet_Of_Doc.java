package Set;

import model.Doctor;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Of_Doc {


    public HashSet<Doctor> Doc() {
        HashSet<Doctor> data = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("add num of doctors");
        int num;
        num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("doc name");
            String name = scan.next();
            System.out.println("please enter age");
            int age = scan.nextInt();
            System.out.println("please enter dep");
            String dep = scan.next();
            System.out.println("please enter salary");
            Double salary = scan.nextDouble();
            Doctor doc1 = new Doctor(name, age, salary, dep);
            data.add(doc1);
        }
        return data;
    }
    public static void main(String[] args) {
        HashSet_Of_Doc obj = new HashSet_Of_Doc();
        HashSet<Doctor> S = obj.Doc();
        for (Doctor var : S) {
            System.out.println(var.getName());
        }
    }
}



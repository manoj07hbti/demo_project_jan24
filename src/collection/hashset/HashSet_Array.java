package collection.hashset;

import java.util.HashSet;

public class HashSet_Array {
        //LIST 1 ....String Name
        //LIST 2 ....Integer No
        //LIST 3 ....Double Int No.
    public static void main(String[]args){
        HashSet<String> Name = new HashSet<>();

        Name.add("VIPIN");
        Name.add("VIJAY");
        Name.add("DEV");
        Name.add("RAJAT");

        for(String variable : Name){
            System.out.println("Printing :"+variable);
        }

        HashSet<Integer> rollNo = new HashSet<>();

        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(3);
        rollNo.add(3);

        for(Integer varible : rollNo){
            System.out.println("Printing :"+varible);
        }

        HashSet<Double> Salary = new HashSet<>();

        Salary.add(45677.33);
        Salary.add(76154.99);
        Salary.add(45367.98);
        Salary.add(98766.25);

        for(Double varible : Salary){
            System.out.println("Printing Set Salary:"+varible);
        }

    }



}

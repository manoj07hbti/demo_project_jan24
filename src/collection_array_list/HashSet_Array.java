package collection_array_list;

import java.util.HashSet;

public class HashSet_Array {

    public static void main(String[]args){
        HashSet<String> Name = new HashSet<>();

        Name.add("Rahul");
        Name.add("Sumit");
        Name.add("Rahul");
        Name.add("Deepak");

        for(String var : Name){
            System.out.println("Printing Set Name:"+var);
        }

        HashSet<Integer> rollNo = new HashSet<>();

        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(3);
        rollNo.add(3);

        for(Integer var : rollNo){
            System.out.println("Printing Set rollNo:"+var);
        }

        HashSet<Double> Salary = new HashSet<>();

        Salary.add(98766.66);
        Salary.add(56789.45);
        Salary.add(75585.98);
        Salary.add(56789.45);

        for(Double var : Salary){
            System.out.println("Printing Set Salary:"+var);
        }

    }



}

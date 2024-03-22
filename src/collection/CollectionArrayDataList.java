package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArrayDataList {

        // TODO take input from user and add to your list, ask user to continue or exit
        // create a String arrayList
    public ArrayList<String> StringArrayList(){

        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<String> studentData= new ArrayList<>();
        studentData.add("Prveen");
        studentData.add("Vijay");
        studentData.add("Hardik");
        studentData.add("Satendra");
        studentData.add("Vijay");
        studentData.add("Aman");

        Scanner input=new Scanner(System.in);

        String choice;
        do {
            System.out.println("Enter a students name :");
            String name=input.nextLine();
            studentData.add(name);
            System.out.println("Do you want to continue adding names? (Yes/No");
            choice=input.nextLine();

        }while
        (choice.equalsIgnoreCase("yes"));
        return studentData;
    }




    // create with  String arrayList
    public ArrayList<Integer> IntList(){
        ArrayList<Integer> marks =new ArrayList<>();
        marks.add(44);
        marks.add(32);
        marks.add(22);
        marks.add(61);
        marks.add(43);

        return marks;
    }






    //TODO create with double Arraylist
    public ArrayList<Double> doubleList(){

        ArrayList<Double> salary = new ArrayList<>();

        salary.add(23575.44);
        salary.add(87644.23);
        salary.add(98976.77);

        return salary;

    }

    public static void main(String[] args) {
        CollectionArrayDataList obj = new CollectionArrayDataList();
        ArrayList<String> studentName = obj.StringArrayList();
        ArrayList<Integer>marks=obj.IntList();





        //TODO find out all the marks between 33 to 44

        for(Integer var : marks){
            if(var>=33 && var<=44)
                System.out.println("Printing Marks:"+var);
        }
        ArrayList<Double> salary = obj.doubleList();
        for(Double var : salary){
            System.out.println("Printing Salary:"+var);

        }

    }

}
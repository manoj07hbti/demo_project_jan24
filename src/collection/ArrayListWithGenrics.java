package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithGenrics {

    public ArrayList<String> createStringArrayList(){
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <String> studentNames= new ArrayList<>();
        studentNames.add("Rajat");
        studentNames.add("Mohan");
        studentNames.add("Rakesh");
        studentNames.add("Amit");
        studentNames.add("Amir");
        studentNames.add("Ajay");
        studentNames.add("Akshay");
        studentNames.add("Akhtar");


        Scanner input=new Scanner(System.in);

        String choice;
        do {
            System.out.println("Enter a students name :");
            String name=input.nextLine();
            studentNames.add(name);
            System.out.println("Do you want to continue adding names? (Yes/No");
            choice=input.nextLine();

        }while
        (choice.equalsIgnoreCase("yes"));
        return studentNames;

    }


    //create a Integer ArrayList

    public ArrayList <Integer> createIntList(){
        ArrayList <Integer> marks= new ArrayList<>();
        marks.add(53);
        marks.add(62);
        marks.add(49);
        marks.add(32);

        return marks;
    }

    //TODO create double Arraylist
    public static void main(String[] args) {


        ArrayListWithGenrics obj = new ArrayListWithGenrics();
        ArrayList<String> studentNames = obj.createStringArrayList();

        //TODO find out the name which starts with Letter A
        for (String var : studentNames) {
            if(var.startsWith("A"))
                System.out.println("printing student  "+var);

        }

        ArrayList<Integer> marks = obj.createIntList();
        //TODO find out all the marks between 33 to 44
        for (Integer var : marks) {
            if( var>=33 && var<=44)
                //System.out.println("students will be marks between 33 and 44 :"+var);
                System.out.println("Marks is : " + var);

        }
    }



}

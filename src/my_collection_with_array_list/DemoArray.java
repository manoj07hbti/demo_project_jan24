package my_collection_with_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArray {
   // TODO take input from user and add to your list, ask user to continue or exit
    public ArrayList<String> createStringArrayList(){
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <String> studentNames= new ArrayList<>();
        studentNames.add("Rahul");
        studentNames.add("Mohit");
        studentNames.add("Rakesh1");
        studentNames.add("Akhil2");
        studentNames.add("Akhil3");
        studentNames.add("Akhil4");
        studentNames.add("Akhil5");
        studentNames.add("Akhil5");
        studentNames.add("Akash6");

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
      //  studentNames.add("Rahul");
        //studentNames.add("Mohit");
      //  studentNames.add("Rakesh");
       // studentNames.add("Akhil");
//        studentNames.add("Akeel");
        //return studentNames;
    }


    //create a Integer ArrayList

    public ArrayList <Integer> createIntList(){
        ArrayList <Integer> marks= new ArrayList<>();
        marks.add(23);
        marks.add(44);
        marks.add(40);
        marks.add(35);

        return marks;
    }

    //TODO create double Arraylist
    public static void main(String[] args) {


        DemoArray obj = new DemoArray();
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

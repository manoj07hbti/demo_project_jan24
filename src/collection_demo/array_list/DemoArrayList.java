package collection_demo.array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {

    // create a String arrayList
// TODO take input from user and add to your list, ask user to continue or exit
    public ArrayList<String> createStringArrayList(){
    //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <String> studentNames= new ArrayList<>();

        studentNames.add("Rahul");
        studentNames.add("Mohit");
        studentNames.add("Rakesh");
        System.out.println("Printing exisiting list: "+studentNames);
        String flag="Y";
        Scanner scanner= new Scanner(System.in);
        Scanner scanner_new= new Scanner(System.in);

        String name="";

        while (flag.equals("Y")){
            System.out.println("Please enter name to be added into list");
            name=scanner.nextLine();
            if(!studentNames.contains(name)){
                studentNames.add(name);
            }

            System.out.println("Printing list data: "+studentNames);

            System.out.println("Do you want to add more name ? press Y to continue or press any other key exit...");
            flag=scanner_new.nextLine();
        }

      return studentNames;
    }


    //create a Integer ArrayList

    public ArrayList <Integer> createIntList(){
         ArrayList <Integer> marks= new ArrayList<>();
         marks.add(23);
         marks.add(49);
         marks.add(92);
         marks.add(72);

      return marks;
    }

    //TODO create double Arraylist
    public static void main(String[] args) {

        DemoArrayList obj= new DemoArrayList();
        ArrayList <String> studentNames=  obj.createStringArrayList();
        //TODO find out the name which starts with Letter A
        for(String var:studentNames){
            System.out.println("Printing names: "+var);
        }




       ArrayList<Integer> marks= obj.createIntList();
       //TODO find out all the marks between 33 to 44
        for(Integer var: marks){
            System.out.println("Marks is : "+var);
        }
    }
}

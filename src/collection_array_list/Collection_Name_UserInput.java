package collection_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_Name_UserInput {

    // TODO take input from user and add to your list, ask user to continue or exit
    // create a String arrayList
    public ArrayList<String> StringArrayList(){
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<String> studentName = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "Y";
        studentName.add("Ankit");
        studentName.add("Gaurav");
        studentName.add("Saurabh");
        studentName.add("Nitin");
        studentName.add("Vardhan");

        while (input.equals("Y")) {
            System.out.println("Enter student name:");

            studentName.add(scan.next());
            System.out.println("Student Name Add Done:"+studentName);

            System.out.println("Do you want to continue add name press Y or press any ket for Exit");
            input = scan.next();
        }

        return studentName;

    }

    public static void main(String[] args) {
        Collection_Name_UserInput obj = new Collection_Name_UserInput();
        ArrayList<String> studentName = obj.StringArrayList();
        for (String var :studentName) {
            System.out.println("Printing Name :"+var);
        }

    }
}

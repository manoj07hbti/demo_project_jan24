package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_ArrayList_withInput {


    // TODO take input from user and add to your list, ask user to continue or exit
    public ArrayList<String> createStringArrayList() {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "y";

        studentNames.add("ram");
        studentNames.add("sita");
        studentNames.add("ravan");
        studentNames.add("hari");


        while (input.equals("y")) {
            System.out.println("Enter student name:");

            studentNames.add(scan.next());

            System.out.println("Do you want to continue? (y/n)");
            input = scan.next();
        }

        return studentNames;
    }





    public static void main(String[] args) {
        Collection_ArrayList_withInput obj = new Collection_ArrayList_withInput();
        ArrayList<String> S = obj.createStringArrayList();
        for (String s : S) {
            System.out.println(s);
        }









    }




}

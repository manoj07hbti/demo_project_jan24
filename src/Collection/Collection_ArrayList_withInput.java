package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_ArrayList_withInput {


    // TODO take input from user and add to your list, ask user to continue or exit


    public ArrayList<String> createStringArrayList() {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "y";



        while (input.equals("y")) {
            System.out.println("Enter student name:");

            studentNames.add(scan.next());

            System.out.println("Do you want to continue? (y/n)");
            input = scan.next();
        }

        return studentNames;
    }


    public ArrayList<String> sss(ArrayList<String> createStringArrayList2) {

        ArrayList<String> Astart = new ArrayList<>();


        for (String Ann : createStringArrayList2) {
            if (Ann.toLowerCase().startsWith("a") || Ann.toUpperCase().startsWith("A")) {
                Astart.add(Ann);
            }

        }


        return Astart;
    }


    public static void main(String[] args) {
        Collection_ArrayList_withInput obj = new Collection_ArrayList_withInput();
        ArrayList<String> Sort = obj.createStringArrayList();
        for (String s : Sort) {
            System.out.println(s);
        }
        System.out.println("\n"+"***********"+"\n");

        ArrayList<String> A = obj.sss(Sort);
        System.out.println("\n"+"Names starting with letter 'A':");
        for (String name : A) {
            System.out.println(name);
        }


    }




}

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {

    public ArrayList<String> createStringArraylist() {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of element want to store : ");
        int num = scanner.nextInt();
        System.out.println("Enter Names to store : ");
        for (int i = 0; i <= num; i++) {
            String Add = scanner.nextLine();
            name.add(Add);
        }
        System.out.print("======Printing names====");
        for (String var : name) {
            System.out.println(var);
        }
        return studentNames;
    }
}



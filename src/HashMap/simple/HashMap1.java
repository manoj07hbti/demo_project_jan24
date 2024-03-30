package HashMap.simple;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
  /*  Assignment :
    create a hashMap of interger key and String value */


    public void map() {
        HashMap<Integer, String> menu = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose ur order");


        while (true) {
            menu.put(1, "taco");
            menu.put(2, "coke");
            menu.put(3, "burger");
            menu.put(4, "pizza");

            int input = scan.nextInt();


            System.out.println("Add more items? (y/n)");
            String add = scan.next();

            System.out.println(menu.get(input));
            if (!add.equals("y")) {
                break;
            }


        }


    }


    public static void main(String[] args) {
        HashMap1 obj = new HashMap1();
        obj.map();


    }
}

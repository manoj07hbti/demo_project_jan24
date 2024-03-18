package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {


    public void demo1() {

        ArrayList<String> mylist = new ArrayList();
        mylist.add("ram");
        mylist.add("sita");
        mylist.add("lakshman");
        mylist.add("hanuman");
        mylist.add("ravan");
        mylist.add("lanka");


        //TODO print all element of list using for, while , do while and advance for loop
        // list.size();// it will give size of list
        //TODO find index of any given String only if you are able to find


        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i) + "  index at = " + i);
        }
        System.out.println("Printing with for loop" + "\n");

        int k = 0;
        while (k <= mylist.size() - 1) {
            System.out.println(mylist.get(k) + "  index at = " + k);
            k++;

        }
        System.out.println("Printing with while loop" + "\n");


        int j = 0;
        do {
            System.out.println(mylist.get(j) + "  index at = " + j);
            j++;

        } while (j <= mylist.size() - 1);
        System.out.println("Printing with Do while loop" + "\n");


        for (String element : mylist) {
            System.out.println(element);
        }
        System.out.println("Printing with enhanced for loop" + "\n");


    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.demo1();
    }
}




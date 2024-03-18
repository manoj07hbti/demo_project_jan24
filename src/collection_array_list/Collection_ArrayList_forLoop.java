package collection_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_ArrayList_forLoop {

    //TODO print all element of list using for, while , do while and advance for loop


    public void element() {

        // ClassName objName = new ClassName();

        ArrayList list = new ArrayList();

        list.add("Oxygen");//0 INDEX
        list.add("Carbon"); // 1 INDEX
        list.add("Water"); // 2 INDEX
        list.add("Hydrogen"); // 3 INDEX
        list.add("Air"); // 4 INDEX
        list.add("Calcium"); // 5 INDEX

        // TODO USING For LOOP

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // TODO USING WHILE LOOP

        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        // TODO USING DO WHILE LOOP

        int a = 0;

        do {
            System.out.println(list.get(a));
            a++;
        } while (a <= 5);

        // TODO USING ADVANCE FOR LOOP

        for (Object var : list) {
            System.out.println("Printing Using Advanced Loop:" + var);
        }
    }

    public static void main(String[] args) {
        Collection_ArrayList_forLoop obj = new Collection_ArrayList_forLoop();
        obj.element();
    }

}

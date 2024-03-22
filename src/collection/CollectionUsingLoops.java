package collection;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionUsingLoops {

    //TODO printing all Places list using for loop,
    // //while loop,do while loop and advance for loop

    public void place() {
        //ClassName objName = new ClassName();

        ArrayList list = new ArrayList();

        list.add("Agra");   //0
        list.add("Aligarh");//1
        list.add("Delhi");  //2
        list.add("Haryana");//3
        list.add("Panjab"); //4
        list.add("Pune");   //5

        //ODO print all element of list using for, while , do while and advance for loop
        // list.size();...find list size

        // TODO find index of any given String only if you are able to find

        for (int i = 0; i < list.size();i++ ) {
            System.out.println(list.get(i)+"index ="+i);
        }
        System.out.println("Printing with FOR LOOP "+"\n");





        //Using While Loop.......
        int j = 0;
        while (j <=list.size()-1) {
            System.out.println(list.get(j)+"Print intex at ="+j);
            ++j;
        }
        System.out.println("Printing While Loop Index"+"\n");




        //Using Do While Loop.......
        int k = 0;
        do {
            System.out.println(list.get(k));
            k++;
        } while (k <= list.size()-1);
        System.out.println("Printing with Do While Loop "+"\n");





        //Using Advance for loop
        for(Object variable : list){
            System.out.println("Printing AdvanceFor Loop"+variable);
        }

    }

    public static void main(String[] args) {
        CollectionUsingLoops obj = new CollectionUsingLoops();
        obj.place();
    }


}

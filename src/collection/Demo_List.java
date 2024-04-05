package collection;

import java.util.ArrayList;
import java.util.List;

public class Demo_List {

    public void List() {


//        String name1="Rahul";
//        String name2="Amit";
//        String name3="Raja";
//        String name4="Amar";

//for this type of data storing

// we should make the object of ArrayList

        ArrayList obj = new ArrayList();
        obj.add("Rahul");
        obj.add("Amit");
        obj.add("Raja");
        obj.add("Amar");

            System.out.println(obj);

        }


    public static void main(String[] args) {
        Demo_List obj = new Demo_List();
        obj.List();

    }

}



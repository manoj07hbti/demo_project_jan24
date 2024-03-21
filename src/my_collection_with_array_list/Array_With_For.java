package my_collection_with_array_list;

import java.util.ArrayList;

public class Array_With_For {
    public void demo(){

        ArrayList list1= new ArrayList();

        list1.add("prakash");
        list1.add("rakesh");
        list1.add("rakhhi");
        list1.add("1324");
        list1.add("rajeshwar");
        list1.add("rohit");
        System.out.println(list1);
        list1.remove(3);

        System.out.println("After delete " +list1);
        int i=0;
        while (i<list1.size()){
            System.out.println("Printing data in while loop :" +list1.get(i) + " At INDEX "+i);
            i++;
        }
    }

    public static void main(String[] args) {
        Array_With_For obj=new Array_With_For();
        obj.demo();
    }
}

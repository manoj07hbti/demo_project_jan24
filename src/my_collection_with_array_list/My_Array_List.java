package my_collection_with_array_list;

import java.util.ArrayList;

public class My_Array_List {
    public void demo(){
   ArrayList list=new ArrayList<>();

     list.add("rakesh");
     list.add("pramod");
     list.add("mukesh");
     list.add("ram");
    System.out.println(list);
    System.out.println("printing data :"+list.get(1));
      list.remove(0);
      System.out.println("After delete :"+list);
    }

    public static void main(String[] args) {
        My_Array_List obj=new My_Array_List();
        obj.demo();
    }
}

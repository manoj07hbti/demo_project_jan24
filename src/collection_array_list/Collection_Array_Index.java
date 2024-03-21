package collection_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection_Array_Index {

    public void String() {
        //TODO find index of any given String only if you are able to find

        // ClassName objName = new ClassName();

        ArrayList list = new ArrayList();

        list.add("Rajeev");//0 INDEX
        list.add("Dhiraj"); // 1 INDEX
        list.add("Amit"); // 2 INDEX
        list.add("Anoop"); // 3 INDEX
        list.add("Nitin"); // 4 INDEX
        list.add("Shruti"); // 5 INDEX

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        for (int i= 0; i<list.size(); i++){
            if(string.equals(list.get(i)))
                System.out.println("Printing data :" + i);
        }
    }

    public static void main(String[] args) {
        Collection_Array_Index obj = new Collection_Array_Index();
        obj.String();
    }


}

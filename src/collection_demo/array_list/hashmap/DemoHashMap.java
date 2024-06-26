package collection_demo.array_list.hashmap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createMap(){
//HashMap <DataType_Key, DataType_Value> objName= new HashMap();
        HashMap<Integer,String> map= new HashMap<>();

        // adding values to map

        map.put(1,"Java");
        map.put(2,"Spring");
        map.put(123,"Spring Boot");
        map.put(1,"Java8");
        map.put(null,"Cloud");
        map.put(null,"AWS");

        System.out.println(map);

        // read data from map
        System.out.println(map.get(123));
        System.out.println( map.get(2));
// how to print hashmap using loop
    // Set<Integer> keys= map.keySet();

     for(Integer var: map.keySet()){

         System.out.println("Printing map using keys :"+map.get(var));
     }


    }

    public static void main(String[] args) {

        DemoHashMap obj= new DemoHashMap();
        obj.createMap();
    }

}

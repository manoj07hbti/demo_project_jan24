package collection_demo.array_list.hashmap;

import java.util.HashMap;

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

    }

    public static void main(String[] args) {

        DemoHashMap obj= new DemoHashMap();
        obj.createMap();
    }

}

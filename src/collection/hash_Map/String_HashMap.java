package collection.hash_Map;

import java.util.HashMap;

public class String_HashMap {

    //TODO create  a HashMap of String key with String value.
    public void Map_String(){

        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();
        HashMap<String,String >mapDoctor = new HashMap<>();

        // Insertion data...

        mapDoctor.put("Adesh","Neurologist");
        mapDoctor.put("Sidharth","Orthopedic");
        mapDoctor.put("Vijay","cancer");
        mapDoctor.put("Ritesh","General");
        mapDoctor.put("Saurbh","Dentist");

        System.out.println(mapDoctor);


        //if reading data from Map

        System.out.println(mapDoctor.get("Ritesh"));


       // search data...............
        if(mapDoctor.containsKey("Adesh")){
            System.out.println("Doctor name is available in mapDoctor");
        }else{
            System.out.println("Doctor name is not available in mapDoctor");

            System.out.println(mapDoctor.get("Vijay")); // key exists
            System.out.println(mapDoctor.get("Pankaj")); // key does not exist
        }


    }

    public static void main(String[] args) {
        String_HashMap object = new String_HashMap();
        object.Map_String();
    }



}

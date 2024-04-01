package collection_array_list.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_String {

        // TODO create a hashMap of String key and String value.

    public void Map_String(){
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        LinkedHashMap<String , String> mapDoctor = new LinkedHashMap<>();

        // adding value to map

        mapDoctor.put("Manish" , "Dentist");
        mapDoctor.put("Mahaveer" , "General");
        mapDoctor.put("Sanjay Verma" , "Child Specialist");
        mapDoctor.put("Sanjeev Jain" , "Cancer");
        mapDoctor.put("Vinay Agarwal" , "Child Care");

        System.out.println(mapDoctor);

        // read dta from map

        System.out.println(mapDoctor.get("Manish"));
        System.out.println(mapDoctor.get("Vinay Agarwal"));


    }

    public static void main(String [] args){
        HashMap_String obj = new HashMap_String();
        obj.Map_String();

    }



}

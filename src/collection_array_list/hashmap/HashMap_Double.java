package collection_array_list.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_Double {

    public void Map_Double(){

        LinkedHashMap<String , Double> mapSalary = new LinkedHashMap<>();

        mapSalary.put("Rajeev" , 98765.67);
        mapSalary.put("Nitin" , 104855.98);
        mapSalary.put("Anoop" , 88787.87);
        mapSalary.put("Yogesh" , 120877.98);

        System.out.println(mapSalary);


        // read dta from map

        System.out.println(mapSalary.get("Rajeev"));
        System.out.println(mapSalary.get("Nitin"));


    }

    public static void main(String [] args){
        HashMap_Double obj = new HashMap_Double();
        obj.Map_Double();
    }




}

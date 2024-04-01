package collection.hash_Map;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Double_HashMap {
    //TODO create  a HashMap of String key with String value.
    public void Double_HashMap() {

        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();
        HashMap<Integer, Double> mapSalary = new HashMap<>();

        // Insertion data...
        mapSalary.put(1,12234.99);
        mapSalary.put(2,44218.77);
        mapSalary.put(3,22541.12);
        mapSalary.put(4,31223.87);
        mapSalary.put(5,44213.56);

        System.out.println(mapSalary);

// if data find from Map
        System.out.println(mapSalary.get(4));
    }

    public static void main(String[] args) {
        Double_HashMap object = new Double_HashMap();
        object.Double_HashMap();
    }
}
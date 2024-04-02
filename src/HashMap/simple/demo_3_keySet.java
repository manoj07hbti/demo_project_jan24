package HashMap.simple;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class demo_3_keySet {

    public void hashmap() {
        HashMap<String, Double> set = new HashMap<>();

        set.put("A", 854.6);
        set.put("B", 85241.852);
        set.put("C", 85241.3625);
        set.put("D", -524.541);


        /*Set<String> keys = set.keySet();*/


        for (String var : set.keySet()){
            System.out.println(set.get(var));
        }

    }

    public static void main(String[] args) {
        demo_3_keySet obj = new demo_3_keySet();
        obj.hashmap();

    }
}

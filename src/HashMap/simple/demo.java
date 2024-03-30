package HashMap.simple;

import java.util.HashMap;
import java.util.Scanner;

public class demo {
   /* create a hashMap of String key and Double value*/

    public void hashmap() {
        HashMap<String, Double> set = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        set.put("A", 854.6);
        set.put("B", 85241.852);
        set.put("C", 85241.3625);
        set.put("D", -524.541);

        String input = scan.next();
        System.out.println(set.get(input));
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.hashmap();

    }
}

package HashMap.simple;

import java.util.HashMap;
import java.util.Scanner;
/*create a hashMap of String key and String value*/
public class demo2 {
    public void hashmap() {
        HashMap<String, String> set = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        set.put("A", "a");
        set.put("B", "b");
        set.put("C", "c");
        set.put("D", "d");

        String input = scan.next();
        System.out.println(set.get(input));
    }

    public static void main(String[] args) {
        demo2 obj = new demo2();
        obj.hashmap();

    }


}

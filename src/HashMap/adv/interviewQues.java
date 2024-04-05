package HashMap.adv;

import java.util.HashMap;
import java.util.Scanner;

public class interviewQues {
    /*find put number of occurrence Alphabets in a String
    Java : J-1 , a-2 , v-1*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char[] set = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char var : set) {
            if (map.containsKey(var)) {
                map.put(var, map.get(var) + 1);
            } else {
                map.put(var, 1);
            }
        }
        for (char key: map.keySet()){
            System.out.println(key + " = "+ map.get(key));
        }
    }
}

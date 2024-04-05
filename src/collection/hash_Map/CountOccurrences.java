package collection.hash_Map;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Input..");
        String s = scan.nextLine();

        
        // string type  convert to Character type
        char ar[] = s.toCharArray();// string to convert Character Array

        Arrays.sort(ar);
        String t = new String(ar);//again string type convert to Array
        int  c = 1;

        for (int i = 0; i < t.length() - 1; i++) {
            if (t.charAt(i) == t.charAt(i + 1)) {c++;
            } else {
                System.out.println(t.charAt(i) + "---------->" + c);
                c=1;
            }
        }System.out.println(t.charAt(t.length()-1)+"---------->"+c);

    }
}
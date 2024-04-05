package third_Test;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FactorialCode {

    //  write a code for factorial.....
    public void fact() {
        //Using scanner
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int a = 1;
        for (int i = 1; i <= input; i++) {
            a = a * i;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        FactorialCode test = new FactorialCode();
        test.fact();
    }
}

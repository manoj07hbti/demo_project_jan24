package Test.March_31;

import java.util.Scanner;

public class Q2 {
    /*  write a code for factorial*/
    public void fact() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int f = 1;
        for (int i = 1; i <= input; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        Q2 test = new Q2();
        test.fact();
    }
}

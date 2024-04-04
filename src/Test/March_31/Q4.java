package Test.March_31;

import java.util.Scanner;

public class Q4 {
    // 4.	write a code to print square of number between 1 to 10

    public void square() {

        for (int i = 1; i <= 10; i++) {
            int sq = i * i;
            System.out.println(sq);
        }
    }
    public static void main(String[] args) {
        Q4 sqt = new Q4();
        sqt.square();
    }
}

package Test.March_31;

import java.util.Scanner;

public class Q1 {
    /*write a code to check any number between 5 and 150 which is divisible by 3, and it should not be even number*/
    public void checknum() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num >= 5 && num <= 150 && num % 3 == 0 && num % 2 != 0) {
            System.out.println(num+" num is valid");
        } else {
            System.out.println("Not a valid num");
        }
    }
    public static void main(String[] args) {
        Q1 check = new Q1();
        check.checknum();
    }
}

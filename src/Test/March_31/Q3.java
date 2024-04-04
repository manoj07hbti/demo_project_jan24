package Test.March_31;

import java.util.Scanner;

public class Q3 {
    // 3.	write a code to check any number between 7 to 190 is divisible by 7 and it should not be odd number

    public void test() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input >= 7 && input <= 190 && input % 7 == 0 && input % 2 == 0) {

            System.out.println(input+" is valid ");
        } else {
            System.out.println("invalid num " + input);
        }

    }
    public static void main(String[] args) {
        Q3 test = new Q3();
        test.test();
    }
}

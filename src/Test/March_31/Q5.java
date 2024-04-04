package Test.March_31;

import java.util.Scanner;

public class Q5 {
   // write a code to check any number between 3 to 160 is divisible by 9 and it should not be odd number

    public void test() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input >= 3 && input <= 160 && input % 9 == 0 && input % 2 == 0) {

            System.out.println(input+" is valid ");
        } else {
            System.out.println("invalid num " + input);
        }

    }
    public static void main(String[] args) {
        Q5 test = new Q5();
        test.test();
    }

}

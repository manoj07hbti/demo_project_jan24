package Test.March_31;

import java.util.Scanner;

public class Q7 {
    //write a code to check any number between 8 to 160 is divisible by 11 and it should not be odd number
    public void test() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input >= 8 && input <= 160 && input % 11 == 0 && input % 2 == 0) {

            System.out.println(input+" is valid ");
        } else {
            System.out.println("invalid num " + input);
        }

    }
    public static void main(String[] args) {
        Q7 test = new Q7();
        test.test();
    }
}

package assignment;

public class NotOperator {
    public static void main(String[] args) {


        //TODO Write a code to check Country should not be indian

        String country = "india";
        if (country != "india") {
            System.out.println("Welcome");
        } else {
            System.out.println("User Not Allowed");
        }

        //TODO write a code to check number is divisible by 5 using ! operator

        int num = 565341;
        if (num % 5 != 0) {
            System.out.println("num not divisible by 5");
        } else System.out.println("num is divisible by 5");


        //TODO write a code to check number is even or odd using ! operator

        int n = 8;
        if (n % 2 != 0) {
            System.out.println("num is odd");
        } else {
            System.out.println("num is even");
        }
    }
}

package ConditionalStatements;

public class NotOperator {
    public static void main(String[] args) {


        //TODO Write a code to check Country should not be indian

        String country = "india";
        if (!(country != "india")) {
            System.out.println("Not allowed");
        }

        //TODO write a code to check number is divisible by 5 using ! operator

        int num = 565;
        if (!(num % 5 != 0)) {
            System.out.println("num divisible by 5");
        }


        //TODO write a code to check number is even or odd using ! operator

        int n =5;
        if (!(n % 2 != 0)) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }
    }
}

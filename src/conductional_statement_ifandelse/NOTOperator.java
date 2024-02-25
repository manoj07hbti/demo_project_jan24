package conductional_statement_ifandelse;

public class NOTOperator {
    public static void main(String[] args) {

        // TODO Write a code to check Country name should not be indian

        String Country = "INDIAN";
        if (!(Country != "INDIAN")) {
            System.out.println("Country name Should Not Be INDIAN");
        }


        // TODO write a code to check number is divisible by 5 using ! operator

        int num = 60;
        if (!(num % 5 != 0)) {
            System.out.println("num divisible by 5....");
        }


        // TODO write a code to check number is even or odd using ! operator

        int number = 6;
        if (!(number % 2 != 0)) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}

package test_18_feb;

public class Test2 {
    public static void main(String[] args) {
        //Q1- program to print numbers -3 to +3
        for (int n = -3; n <= 3; n++) {
            System.out.println(n);

        }
//Q2- check prime number between 1 and  20
        int num = 14;
        boolean IsPrime = true;
        for (int l = 2; l < num; l++) {
            if (num % l == 0) {
                IsPrime = false;
            }
        }
        if (IsPrime) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }


        //Q3- program to print star pattern
        for (int k = 0; k < 6; k++) {
            System.out.println(" ");
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");



        //Q5- write a code to check even and odd between 3 to 300

        for (int i = 3; i <= 300; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
            // Check if the number is odd
            else {
                System.out.println(i + " is odd");
            }
        }


//Q7- code to print even number divisible by 10
        int num1 = 25;
        if (num1 % 2 == 0 && num1 % 10 == 0) {
            System.out.println(num1 + "  even number is divisible by 10");
        } else {
            System.out.println(num1 + " is not an even number or not divisible by 10");


        }
    }
}
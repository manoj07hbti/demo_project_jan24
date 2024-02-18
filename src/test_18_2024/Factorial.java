package test_18_2024;

public class Factorial {

    public static void main(String[] args) {

        //TODO write a code to make factorial of number example factorial of 4 will be 4*3*2*1=24

        int numbers = 4;
        int factorial = 1;

        for (int a = 1; a <=4; a++) {
            factorial = factorial * a;

        }

        System.out.println("Factorial of " + numbers + " is: " + factorial);



    }


}

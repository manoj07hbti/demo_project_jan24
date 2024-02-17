package Loop;

public class For_Loops2 {
    public static void main(String[] args) {
       /* write a code to find even number between 100 to 200
        write a code for factorial :
        5 = 5X4X3X2X1
        3= 3X2X1

        write a code to check prime number */


        //TODO For loop conditions
        for (int i = 100; i < 200; i++) {
            if (i % 2 == 0) System.out.println(i);
        }


        int num = 7;
        boolean isPrime = true;

        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        /*write a code for factorial :
        5 = 5X4X3X2X1*/

        int number = 5;
        int factorial = 1;

        for (int k = 1; k <= number; k++) {
            factorial = factorial * k;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);


        //TODO  3= 3X2X1

        int n = 3;
        int f = 1;
        for (int a = 1; a <= n; a++) {
            f *= a;

        }
        System.out.println(f);


    }
}

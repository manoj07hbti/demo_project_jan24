package Test_18_Feb;

public class Q2 {
    public static void main(String[] args) {
        //Q2-write a program to check prime numbers between 1 to 20


        int n = 10;
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("num is prime = " + n);
        } else {
            System.out.println("num is not prime = " + n);
        }
    }
}






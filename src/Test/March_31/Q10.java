package Test.March_31;

public class Q10 {
    //write a code to check prime number between 10 to 20

    public static void main(String[] args){

        for (int i=10; i<=20; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }

        }

    }
}

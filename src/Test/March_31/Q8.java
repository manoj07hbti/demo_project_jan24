package Test.March_31;

public class Q8 {
    //write a code to check prime number between 1 to 10
    public static void main(String[] args){

        for (int i=2; i<=10; i++) {
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

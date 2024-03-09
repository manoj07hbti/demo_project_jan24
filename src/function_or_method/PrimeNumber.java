package function_or_method;

public class PrimeNumber {
    public void PrimeNumber() {

        int a = 5;
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                b++;
            }
        }
        if (b == 2) {
            System.out.println(" THIS IS A PRIME NUMBER");
        } else {
            System.out.println(" THIS IS NOT A PRIME NUMBER");
        }
    }

    public static void main(String[] args) {
        PrimeNumber object = new PrimeNumber();
        object.PrimeNumber();
    }
}
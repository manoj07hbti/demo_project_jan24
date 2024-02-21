package Loops.For_Loops;

public class Checking_prime_Num {
    public static void main(String[] args) {
        int num = 5;
        int pr =0;

        for ( int i=1 ; i<=num;i++) {
            if (num % i == 0) {
                pr++;
            }
        }
            if (pr++ ==2){
                System.out.println("number is Prime number");
            }else {
                System.out.println("number is not a Prime number");
            }

    }
}

package function_or_method;

public class CheckPrimeNoRT {
    public String checkPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }
        if(isPrime){
            return "Number is prime number: " + number;
        }else {
            return "Number is not a prime number: " + number;
        }
    }

    public static void main(String[] args) {
        CheckPrimeNoRT obj=new CheckPrimeNoRT();
        String number= obj.checkPrime(4);
        System.out.println(number);

    }
}

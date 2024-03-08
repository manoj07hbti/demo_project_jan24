package function_or_method;

public class CheckPrimeReturnType {

    public String CheckPrime(int number){
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
        CheckPrimeReturnType obj=new CheckPrimeReturnType();
        String number= obj.CheckPrime(8);
        System.out.println(number);
    }



}

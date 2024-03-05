package function_or_method;

public class DemoInputParam {

    // write a code to check given number is prime or not

    public void checkPrime(int number) {

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
            }

        }

        if (isPrime) {
            System.out.println("Number is prime number: " + number);
        } else {

            System.out.println("Number is NOT prime number: " + number);
        }

    }

    public void checkVote(String city, int age) {

        if (age >= 18 && city.equals("Agra")) {

            System.out.println("Person is eligible for voting in Agra...");
        } else {
            System.out.println("Person is NOT eligible for voting in Agra...");
        }

    }

    public void factorial(int number){
        int factorial=1;

        for(int i=number; i>0; i--){
           factorial=factorial*i;

        }

        System.out.println("Factorial of given number is: "+factorial);


    }

    public static void main(String[] args) {

        DemoInputParam obj = new DemoInputParam();
        obj.checkPrime(9);
        obj.checkPrime(34);
        obj.checkPrime(56);

        obj.checkVote("Pune", 21);
        obj.checkVote("Agra", 21);

        obj.factorial(6);
    }


}

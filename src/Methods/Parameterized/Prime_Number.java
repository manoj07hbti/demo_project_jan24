package Methods.Parameterized;

public class Prime_Number {

   public void PrimeNumber(int number){
       int f=0;
       for (int i=1;i<=number;i++){
           if (number % i==0){
               f++;
           }
       }
       if (f<=2){
           System.out.println("number is prime number");
       }else {
           System.out.println("number is not a prime number");
       }
   }

    public static void main(String[] args) {
        Prime_Number primeNumber=new Prime_Number();
        primeNumber.PrimeNumber(991);
    }
}

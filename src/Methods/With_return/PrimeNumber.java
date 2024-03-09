package Methods.With_return;

public class PrimeNumber {

    public String prime(int Num){
        int k =0;
        for (int i =1;i<=Num;i++){
            if (Num % i ==0){
                k++;
            }
        }if (k<=2){
            return "Number is prime number";
        }else {
            return "Number is not a prime number";
        }
    }
    public static void main(String[] args) {
        PrimeNumber primeNumber=new PrimeNumber();
        String j=primeNumber.prime(1246775676);
        System.out.println(j);
    }
}

package function_or_method;

import java.util.PrimitiveIterator;

public class PrimeNumber {

    public void PrimeNumber(){

        int p = 3;
        int n = 0;
            for (int i = 1 ;i<=p ; i++){
                if (p%i==0){
                    n++;
                }
            }
            if (n==2){
                System.out.println("This Is A Prime Number");
            }else {
                System.out.println("This Is not a Prime Number");
            }
        }

        public static void main(String[] args) {
            PrimeNumber obj =new PrimeNumber();
            obj.PrimeNumber();



    }



}

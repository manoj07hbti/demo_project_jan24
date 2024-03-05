package Methods.non_parameterized;

public class Prime {

    int p = 53;
    public void prime(){

        int n = 0;

        for (int i = 1 ;i<=p ; i++) {
                   if (p%i==0){
                       n++;
                   }
        }
        if (n==2){
            System.out.println("Prime number");
        }else {
            System.out.println("not a prime number");
        }
    }

    public static void main(String[] args) {
        Prime prime =new Prime();
        prime.prime();
    }
}

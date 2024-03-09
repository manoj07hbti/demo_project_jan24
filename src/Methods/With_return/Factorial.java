package Methods.With_return;

public class Factorial {

    public int factorial(int num){
        int fact= 1;
        for (int i =num;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int i=factorial.factorial(4);
        System.out.println("Factorial is "+i);
        int j = factorial.factorial(5);
        System.out.println("Factorial : "+j);
    }
}

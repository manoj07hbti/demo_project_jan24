package function_or_method;

public class FactorialReturnType {

    public int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++) {
            f = f *i;
        }
        return f;
    }

    public static void main(String[] args) {
        FactorialReturnType obj=new FactorialReturnType();
        int number= obj.factorial(7);
        System.out.println("We Are Printing Factorial of N Number :"+number);
    }


}

package function_or_method;

public class FactorialMethod {
    public void fac(int a, int b) {


        for (int c = 1; c <= a; c++) {
            b = b * c;
        }
        System.out.println("We Are Printing Factorial Of a is :" + b);

    }

    public static void main(String[] args) {
        FactorialMethod obj = new FactorialMethod();
        obj.fac(4, 1);
    }
}
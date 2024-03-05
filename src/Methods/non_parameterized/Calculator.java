package Methods.non_parameterized;

public class Calculator {

    int a = 10;
    int b = 5;
    public void add(){
        int c =a+b ;
        System.out.println("addition = "+c);
    }
    public void sub(){
        int c =a-b;
        System.out.println("Subtraction = "+c);
    }
    public void mul(){
        int c = a*b;
        System.out.println("Multiplication = "+c);
    }
    public void div(){
        double c =( double )(a / b);
        System.out.println("Division = "+c);
    }

    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        calculator.add();
        calculator.sub();
        calculator.div();
        calculator.mul();
    }
}

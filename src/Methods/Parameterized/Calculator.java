package Methods.Parameterized;

public class Calculator {
    public void Cal(int num , int num1){
             int add = num+num1;
             int sub = num-num1;
             int mul = num*num1;
             double div =(double) num/num1;

        System.out.println("Addition = " +add);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+div);
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.Cal(5,4);
    }
}
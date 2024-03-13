package scanner_input;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int multiply(int a , int b){
        return a*b;
    }
    public double divide(int a , int b){
        return (double) a/b;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter Value Of a");
        int a= scanner.nextInt();
        System.out.println("Please Enter Value Of b");
        int b= scanner.nextInt();

        CalculatorApp obj=new CalculatorApp();
        int result= obj.add(a,b);
        System.out.println("Add is :"+result);
        result= obj.sub(a,b);
        System.out.println("Sub is :"+result);
        result= obj.multiply(a,b);
        System.out.println("Mul is :"+result);
        double res= obj.divide(a,b);
        System.out.println("Divide is :"+res);

    }


}

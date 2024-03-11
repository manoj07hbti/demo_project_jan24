package ScannerWithInput;

import java.util.Scanner;

/*
2.Calc with user Input*/

public class CalculatorApp {


    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input your number A");
        int a = scan.nextInt();
        System.out.println("please input your number B");
        int b = scan.nextInt();

        CalculatorApp obj = new CalculatorApp();
        int res = obj.add(a, b);
        System.out.println(res + " result of addition");

        int re = obj.minus(a, b);
        System.out.println(re + " result of minus");

        int r = obj.multi(a, b);
        System.out.println(r + " result of multiplication");

        double d = obj.divide(a, b);
        System.out.println(d + " result of division");

    }


}

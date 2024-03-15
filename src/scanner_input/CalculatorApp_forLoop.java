package scanner_input;

import java.util.Scanner;

public class CalculatorApp_forLoop {

    public int add(int a ,int b){
        return a+b;
    }
    public int sub(int a ,int b){
        return a-b;
    }
    public int multiply(int a ,int b){
        return a*b;
    }
    public double divide(int a ,int b){
        return (double) a/b;
    }

    public static void main(String[] args) {
        CalculatorApp_forLoop obj = new CalculatorApp_forLoop();
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        for (int i=1 ; i>0;){
            System.out.println("Please Enter Value Of a");
            int a = scanner.nextInt();
            System.out.println("Please Enter Value Of b");
            int b = scanner.nextInt();
            System.out.println("Please Enter 1: Add , 2: Sub , 3: Mul And 4: Divide ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = obj.add(a, b);
                    System.out.println("Addition is :" + result);
                    break;
                case 2:
                    result = obj.sub(a, b);
                    System.out.println("Subtraction is :" + result);
                    break;
                case 3:
                    result = obj.multiply(a, b);
                    System.out.println("Multiply is :" + result);
                    break;
                case 4:
                    double divide = obj.divide(a, b);
                    System.out.println("Divide is :" + divide);
                    break;
                default:
                    System.out.println("invalid Choice Enter... Please Enter 1,2,3, or 4 only");
                    break;

            }

            System.out.println("Please Enter y To Continue Or Press Any Other Key For EXIT From App...");
            String userinfo  = scanner.next();
            if (!userinfo.equals("Y"));
        }
    }




}

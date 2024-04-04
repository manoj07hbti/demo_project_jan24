package Test.March_31;

import ScannerWithInput.Advance_calC_ForLoop;

import java.util.Scanner;

public class Q11 {
    //Write a calculator App with Scanner
    //ask user for choice : 11 for addition 22 for subtraction , 33 - for multiply and 44 for divide

    public int add(int a, int b) {
        return a + b;

    }

    public int minus(int a, int b) {
        return a - b;

    }

    public int multi(int a, int b) {
        return a * b;

    }

    public double divide(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        Q11 obj = new Q11();
        Scanner scan = new Scanner(System.in);
        double result = 0;


        for (int i = 1; i > 0; ) {
            System.out.println("Please enter A");
            int a = scan.nextInt();

            System.out.println("Please enter B");
            int b = scan.nextInt();

            System.out.println("Please enter 11: Add , 22 :sub, 33:multi and 44:Divide ");
            int choice = scan.nextInt();

            switch (choice) {
                case 11:
                    result = obj.add(a, b);
                    break;

                case 22:
                    result = obj.minus(a, b);
                    break;

                case 33:
                    result = obj.multi(a, b);
                    break;

                case 44:
                    result = obj.divide(a, b);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;

            }
            System.out.println("Result = " + result);
            System.out.println("choose y to continue");
            String userinput = scan.next();

            if (!userinput.equals("y")) break;


        }

    }


}

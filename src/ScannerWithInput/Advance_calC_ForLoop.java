package ScannerWithInput;

import java.util.Scanner;

public class Advance_calC_ForLoop {

      /*  you need to create calc with break statement and without while loop
1- for loop
2- do while loop*/

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
        Advance_calC_ForLoop obj = new Advance_calC_ForLoop();
        Scanner scan = new Scanner(System.in);
        double result = 0;


        for (int i = 1; i > 0; ) {
            System.out.println("Please enter A");
            int a = scan.nextInt();

            System.out.println("Please enter A");
            int b = scan.nextInt();

            System.out.println("Please enter 1: Add , 2 :sub, 3:multi and 4:Divide ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    result = obj.add(a, b);
                    break;

                case 2:
                    result = obj.minus(a, b);
                    break;

                case 3:
                    result = obj.multi(a, b);
                    break;

                case 4:
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

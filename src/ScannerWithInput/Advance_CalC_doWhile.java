package ScannerWithInput;

import java.util.Scanner;

public class Advance_CalC_doWhile {

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

    public double divide(int a, int b) {
        return (double) a / b;
    }


    public static void main(String[] args) {
        Advance_CalC_doWhile obj = new Advance_CalC_doWhile();

        String revert = "y";
        do {
            double result = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("please input your number A");
            int a = scan.nextInt();
            System.out.println("please input your number B");
            int b = scan.nextInt();

            System.out.println("Please enter 1: Add , 2 :sub, 3:multi and 4:Divide ");
            int choise = scan.nextInt();
            switch (choise) {
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

            System.out.println("Result: " + result);

            System.out.println("Please enter y to continue or press any other to key for EXIT from App...");
            revert = scan.next();
            if (!revert.equals("y")) {
                break;
            }


        } while (true);


    }
}

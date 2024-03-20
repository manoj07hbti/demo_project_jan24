package scanner_with_input;

import java.util.Scanner;

public class AdvanceCalculatorDoWhile {

    //using DoWhile loop...........


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

        AdvanceCalculatorDoWhile obj=new AdvanceCalculatorDoWhile();

        String revert ="Y";
        do {
            int result = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please Enter Value Of a");
            int a = scanner.nextInt();
            System.out.println("Please Enter Value Of b");
            int b = scanner.nextInt();





            //TODO we have option to select which operation you want to perform and based on user choice out put should come

            System.out.println("Please Enter 1: Add , 2: Sub , 3: Mul And 4: Divide ");


            //TODO it should repeatedly ask for choice and based on choice it should
            // exit the program otherwise keep asking for choice of calculator


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
            System.out.println("Please Enter Y To Continue Or Press Any Other Key For EXIT From App...");

            revert = scanner.next();

            if (!revert.equals("y")) {
                break;
            }
        }while (true);
    }



}





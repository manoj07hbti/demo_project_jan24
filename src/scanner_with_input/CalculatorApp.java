package scanner_with_input;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a,int b){

        return a+b;
    }

    public int sub(int a,int b){

        return a-b;
    }

    public int multi(int a,int b){

        return a*b;
    }

    public double divide(int a,int b){

        return (double) a/b;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b=scanner.nextInt();

        CalculatorApp obj= new CalculatorApp();
        int result= obj.add(a,b);

        System.out.println("Addition is : "+result);

        //TODO call all methods and print output in main method

    }


}

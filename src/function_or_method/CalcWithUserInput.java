package function_or_method;

import java.util.Scanner;

public class CalcWithUserInput {


    public int addition(int a, int b) {
        return a + b;
    }

    public int Subtraction(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        CalcWithUserInput obj = new CalcWithUserInput();
        int result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("enter value of b: ");
        int b = scanner.nextInt();
        System.out.println("please enter 1: add, 2: sub, 3: multi, 4: div ");
        int choice= scanner.nextInt();


        switch (choice){
            case 1: result=obj.addition(a,b);
                System.out.println("adddition is :"+result);
                break;
            case 2: result=obj.Subtraction(a,b);
                System.out.println("Subtraction is :"+result);
                break;
            case 3: result =obj.multiply(a,b);
                System.out.println("multiply is :"+result);
                    break;
            case 4: double divide=obj.division(a,b);
                System.out.println("division is :"+divide);
                break;
            default:
                System.out.println("invalid user input......");

        }
    }
}

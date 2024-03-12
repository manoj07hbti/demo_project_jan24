package Scanner;

import java.util.Scanner;

public class Calc {
    private int Add(int num1,int num2){
        return num1+num2;
    }
    private int sub(int num1,int num2){
        return num1-num2;
    }
    private double div(double num1,double num2){
        return num1/num2;
    }
    private int Multi(int num1,int num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        System.out.println("1 : Addition.");
        System.out.println("2 : Subtraction.");
        System.out.println("3 : Multiplication.");
        System.out.println("4 : Division");
        System.out.println("Enter Option : ");

        int j =scanner.nextInt();
        switch (j){
            case 1 :
                System.out.println("Enter First Number : ");
                int i = scanner.nextInt();
                System.out.println("Enter Second Number : ");
                int n = scanner.nextInt();
                System.out.println(i+" + "+n+" = "+ calc.Add(i,n));
                break;
            case 2 :
                System.out.println("Enter First Number : ");
                int a = scanner.nextInt();
                System.out.println("Enter Second Number : ");
                int b = scanner.nextInt();
                System.out.println(a+" - "+b+ " = "+calc.sub(a,b));
                break;
            case 3 :
                System.out.println("Enter First Number : ");
                int s = scanner.nextInt();
                System.out.println("Enter Second Number : ");
                int d = scanner.nextInt();
                System.out.println(s+" * "+d+ " = "+calc.Multi(s,d));
                break;
            case 4 :
                System.out.println("Enter First Number : ");
                double x = scanner.nextDouble();
                System.out.println("Enter Second Number : ");
                double y = scanner.nextDouble();
                System.out.println(x+" / "+y+ " = "+calc.div(x,y));
        }
        System.out.println();
        System.out.println(" == ☻ ThankYou ☻ ==");
        scanner.close();
    }
}

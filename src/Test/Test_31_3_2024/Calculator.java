package Test.Test_31_3_2024;

import java.util.Scanner;

public class Calculator {
//    Write a calculator App with Scanner
//    ask user for choice : 11 for addition 22 for subtraction , 33 - for multiply and 44 for divide

    private int add(int a , int b){
        return a+b;
    }
    private int sub(int a,int b){
        return a-b;
    }
    private int multi(int a , int b){
        return a*b;
    }
    private double div(double a,double b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        Scanner scanner=new Scanner(System.in);
        String u="Y";
        while (u.equalsIgnoreCase("Y")){
            System.out.println("1) Addition ");
            System.out.println("2) Subtraction ");
            System.out.println("3) Multiplication ");
            System.out.println("4) Division ");
            int p =scanner.nextInt();
            if (p==1){
                System.out.println("Enter first Number : ");
                int a =scanner.nextInt();
                System.out.println("Enter second Number : ");
                int b = scanner.nextInt();
                System.out.println("Addition of "+ a+" - "+b +" = "+calculator.add(a,b));
            } else if (p==2) {
                System.out.println("Enter first Number : ");
                int a =scanner.nextInt();
                System.out.println("Enter second Number : ");
                int b = scanner.nextInt();
                System.out.println("Subtraction of "+ a+" - "+b +" = "+calculator.sub(a,b));
            } else if (p==3) {
                System.out.println("Enter first Number : ");
                int a =scanner.nextInt();
                System.out.println("Enter second Number : ");
                int b = scanner.nextInt();
                System.out.println("Multiplication of "+ a+" * "+b +" = "+calculator.multi(a,b));
            } else if (p==4) {
                System.out.println("Enter first Number : ");
                double a =scanner.nextDouble();
                System.out.println("Enter second Number : ");
                double b = scanner.nextDouble();
                System.out.println("Addition of "+ a+" / "+b +" = "+calculator.div(a,b));
            }else
                System.out.println("Enter correct Option");
scanner.nextLine();
            System.out.println("To Continue enter y");
            u=scanner.nextLine();
        }
    }
}

package function_or_method;

import java.util.Scanner;

public class CalcWithScanner {


        public int addition(int a,int b){
            return a+b;
        }
        public int Subtraction(int a,int b){
            return a-b;
        }
        public int multiply(int a,int b){
            return a*b;
        }
        public double division(int a,int b){
            return (double)a/b;
        }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter value of a: ");
            int a=scanner.nextInt();
            System.out.println("enter value of b: ");
            int b=scanner.nextInt();
            CalcWithScanner obj=new CalcWithScanner();
            int add=obj.addition(a,b);
            System.out.println("addition is :"+add);
            int sub= obj.Subtraction(a,b);
            System.out.println("subtraction is :"+sub);
            int multi=obj.multiply(a,b);
            System.out.println("multiply is :"+multi);

            double div=obj.division(a,b);
            System.out.println("division is :"+div);
        }


    }




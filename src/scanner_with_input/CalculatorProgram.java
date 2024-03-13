package scanner_with_input;

import java.util.Scanner;

public class CalculatorProgram {
    public int add(int a, int b){
        return  a+b;
    }


    public int sub(int a , int b){
        return a-b;
    }


    public int multi(int a, int b){

        return a*b;
    }


    public double divide( int a, int b){
        return(double) a/b;

    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter value of a :");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b :");
        int b=scanner.nextInt();





        CalculatorProgram obj =new CalculatorProgram();

        int result =obj.add(a,b);
        System.out.println("Addition is : "+result);

        result=obj.sub(a,b);
        System.out.println("Subtraction is :"+result);

        result=obj.multi(a,b);
        System.out.println("Multiplication is :"+result);

        double results =obj.divide(a,b);
        System.out.println("Divide is :"+results);


    }


}

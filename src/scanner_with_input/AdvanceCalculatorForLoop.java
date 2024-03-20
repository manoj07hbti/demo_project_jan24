package scanner_with_input;

import java.util.Scanner;

public class AdvanceCalculatorForLoop {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multi(int a,int b){
        return a*b;

    }
    public double divide(int a,int b){
       return  (double) a/b;
    }


    public static void main(String[] args) {
        AdvanceCalculatorForLoop obj= new AdvanceCalculatorForLoop();
        Scanner scanner=new Scanner(System.in);
        double result=0;


        for (int i=1; i>0;){
            System.out.println("Please Enter value of a");
            int a =scanner.nextInt();
            System.out.println("Please Enter value of b");
            int b =scanner.nextInt();
            System.out.println("Please Enter 1:Add , 2:sub,3: Multi,4:divide");
        }

        int choice = scanner.nextInt();


    }
}

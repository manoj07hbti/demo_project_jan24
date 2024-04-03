package test_1_april_2024;

import function_or_method.Factorial;

import java.util.Scanner;

public class factorial {

    // TODO write a code for factorial .

    public void fac(int a , int b){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number for factorial ");
        String number =scanner.nextLine();
        System.out.println("User has entered:" +number);

        for(int c=1; c<=a; c++){
            b=b*c;
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please Enter Y To Continue Or Press Any Other Key For EXIT From App...");

        String userinfo  = scanner2.next();
        if (!userinfo.equals("Y"));

    }

    public static void main(String[] args){
        factorial obj = new factorial();
        obj.fac(4,1);


    }



}

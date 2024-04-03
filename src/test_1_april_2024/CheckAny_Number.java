package test_1_april_2024;

import scanner_input.DemoScannerClass;

import java.util.Scanner;

public class CheckAny_Number {

// TODO write a code to check any number between 5 to 150 which is divisible by 3 and it should not be even number

    public void ScannerClass(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number for check number ");
        String number =scanner.nextLine();
        System.out.println("User has entered:" +number);
        int num = 5;
        if (!(num%3!=150)){
            System.out.println("num divisible by 3....");
        }else {
            System.out.println("num not divisible by 3....");
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please Enter Y To Continue Or Press Any Other Key For EXIT From App...");

        String userinfo  = scanner2.next();
        if (!userinfo.equals("Y"));


    }

    public static void main(String[] args){
        CheckAny_Number obj = new CheckAny_Number();
        obj.ScannerClass();


    }



}

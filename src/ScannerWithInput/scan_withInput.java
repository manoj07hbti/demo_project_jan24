package ScannerWithInput;

import java.util.Scanner;

public class scan_withInput {
/*
1.create DemoScanner class , take string input and read it , double, integer*/



    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String name = scan.nextLine();
        System.out.println("User has entered " + name);


        System.out.println("Please enter your Salary ");
        double Salary = scan.nextDouble();
        System.out.println("User has entered " + Salary);


        System.out.println("Please enter your age ");
        int age = scan.nextInt();
        System.out.println("User has entered " + age);


    }




    public static void main(String[] args) {
        scan_withInput obj = new scan_withInput();
        obj.input();


    }


}

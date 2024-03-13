package scanner_with_input;

import java.util.Scanner;

public class DemoScannerClass {
    public void ScannerClass(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter your Name :");
        String name=scanner.nextLine();
        System.out.println("User has entered :"+name);


        System.out.println("Please enter your salary :");
        double salary=scanner.nextDouble();
        System.out.println("User has entered Salary :"+salary);


        System.out.println("Please enter Employ code :");
        int EmpCode=scanner.nextInt();
        System.out.println("User has entered EmpCode : "+EmpCode);


        System.out.println("Please enter your location :");
        int location=scanner.nextInt();
        System.out.println("User has entered location :"+location);


    }
    public static void main(String[] args) {
        DemoScannerClass obj= new DemoScannerClass();
        obj.ScannerClass();
    }

}

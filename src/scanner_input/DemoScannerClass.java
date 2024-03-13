package scanner_input;

import java.util.Scanner;

public class DemoScannerClass {

    public void ScannerClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name =scanner.nextLine();
        System.out.println("User has entered:" +name);

        System.out.println("Please enter your Salary ");
        double Salary = scanner.nextDouble();
        System.out.println("User has entered: " + Salary);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter your EmpCode");
        String EmpCode= scanner2.nextLine()  ;
        System.out.println("User has entered :"+ EmpCode);



    }

    public static void main(String[] args) {
        DemoScannerClass obj = new DemoScannerClass();
        obj.ScannerClass();


    }


}

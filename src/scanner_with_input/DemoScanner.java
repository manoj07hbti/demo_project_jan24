package scanner_with_input;

import java.util.Scanner;

public class DemoScanner {


    // this method will take String input into you program
    public void demoStringInput(){
        // create object of Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name= scanner.nextLine();// it reads String input and give it back
        System.out.println("User has entered "+name);
    }

    public void demoIntInput(){
        // create object of Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
       int age= scanner.nextInt();// reads integer value and give it back

        System.out.println("User has enter age as : "+age);
    }

    public void demoDoubleInput(){
        // create object of Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary :");
       double salary= scanner.nextDouble(); // reads decimal values and give it back
        System.out.println("Salary is :"+salary);

    }


    public static void main(String[] args) {
        DemoScanner obj= new DemoScanner();
        obj.demoStringInput();
        obj.demoIntInput();
        obj.demoDoubleInput();


    }
}

package third_Test;

import java.util.Scanner;

public class CalculatorWithScanner {

    public static void main(String[] args) {

        // calculator Using Scanner asking choice...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur Choice ; press 11 for Addition,press 22 for Subtraction,Press 33 for multiply, press 44 for Divide");
        int choice =scanner.nextInt();

        System.out.println("Enter First No :");
        int firstNo = scanner.nextInt();

        System.out.println("Enter Second No :");
        int secondNo = scanner.nextInt();

        int result = 0;
                switch (choice){
                    case 11:
                        result = firstNo+secondNo;
                    break;

                    case  22:
                        result = firstNo-secondNo;
                    break;

                    case 33:
                        result = firstNo*secondNo;
                    break;

                    case 44:
                        result=firstNo/secondNo;
                    break;
                    default:
                        System.out.println("Invalid choice");

                }
        System.out.println("Result is :"+result);

    }
}

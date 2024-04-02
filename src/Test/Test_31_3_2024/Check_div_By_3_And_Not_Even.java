package Test.Test_31_3_2024;

import java.util.Scanner;

public class Check_div_By_3_And_Not_Even {
/*    write a code to check any number between 5 to 150 which is divisible by 3 and it should not be even number
    write a code for factorial
**/
    private int DivBy3(int Num1 , int Num2){
        for (int i=Num1;i<=Num2;i++){
            if (i%3==0 && i%2 !=0) {

                System.out.print(i+", ");
            }
        }
        return 0;
    }
    private int Factorial(int Num1){
        int k=1;
        for (int i=Num1;i>0;i--){
            k=k*i;
        }
        System.out.print("Factorial of "+Num1+" is ");
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String u = "Y";
        while (u.equalsIgnoreCase("Y")) {
            System.out.println("======================================");
            System.out.println("1) Find Number is odd and divisible by 3");
            System.out.println("2) Find factorial ");
            System.out.println("=======================================");
            System.out.println("Enter Your required Option : ");
            int e = scanner.nextInt();
            Check_div_By_3_And_Not_Even check = new Check_div_By_3_And_Not_Even();
            switch (e) {
                case 1:
                    System.out.println("Enter initial Number : ");
                    int n = scanner.nextInt();
                    System.out.println("Enter ending Number : ");
                    int m = scanner.nextInt();
                    System.out.println("====== Printing Odd number and divisible by 3 ======");
                    System.out.println(check.DivBy3(n, m));

                    break;
                case 2:
                    System.out.println("Enter Number : ");
                    int t = scanner.nextInt();
                    System.out.println(check.Factorial(t));
                    break;
                default:
                    System.out.println("Enter correct Option : ");
            }
            scanner.nextLine();
            System.out.println("To use again Enter Y : ");
             u=scanner.nextLine();
        }
        scanner.close();
    }
}

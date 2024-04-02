package Test.Test_31_3_2024;

import java.util.Scanner;

public class Chicking_all_program {
//    write a code to check any number between 7 to 190 is divisible by 7 and it should not be odd number

private void DivBy7(int Num1 , int Num2){
    for (int i=Num1;i<=Num2;i++){
        if (i%7==0 && i%2 ==0) {

            System.out.print(i+", ");
        }
    }
}
    //write a code to print square of number between 1 to 10 like  1 , 4, 9, 16 ,25 ....100
    private void square(int Num1 ,int Num2){

        for (int i=Num1;i<=Num2;i++){
          int  k =i*i;
            System.out.println(k);
        }
    }
//    write a code to check any number between 3 to 160 is divisible by 9 and it should not be odd number
private void DivBy9(int Num1 , int Num2){
    for (int i=Num1;i<=Num2;i++){
        if (i%7==0 && i%2 ==0) {

            System.out.print(i+", ");
        }
    }
}
//    write a code to print cube of number starting from 1 to 10 like 1, 8 , 27, 64 ....1000

    private void cube(int Num1 ,int Num2){
       for (int i=Num1;i<=Num2;i++){
           int k=i*i*i;
           System.out.println(k);
       }
    }
//    write a code to check any number between 8 to 160 is divisible by 11 and it should not be odd number


    private void DivBy11(int Num1 , int Num2){
        for (int i=Num1;i<=Num2;i++){
            if (i%11==0 && i%2 ==0) {

                System.out.print(i+", ");
            }
        }
    }
    //    write a code to check prime number between 1 to 10
    private void prime(int num1,int Num2 ){

         for (int i =num1;i<=Num2;i++){
             int p=0;
             for (int j=1;j<=i;j++) {
                 if (i % j == 0) {
                     p++;
                 }
             }
             if (p==2){
                 System.out.println(i);
             }
         }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String u = "Y";
        while (u.equalsIgnoreCase("Y")) {
            System.out.println("======================================");
            System.out.println("1) Find Number is even and divisible by 7");
            System.out.println("2) Find squares between two number : ");
            System.out.println("3) Find Number is not odd and divisible by 9");
            System.out.println("4) Find cube between two numbers ");
            System.out.println("5) find prime number ");
            System.out.println("6) find number divisible by 11 and not odd number : ");
            System.out.println("=======================================");
            System.out.println("Enter Your required Option : ");
            int e = scanner.nextInt();
            Chicking_all_program checking = new Chicking_all_program();
            switch (e) {
                case 1:
                    System.out.println("Enter initial Number : ");
                    int n = scanner.nextInt();
                    System.out.println("Enter ending Number : ");
                    int m = scanner.nextInt();

                    System.out.println("====== Printing Not Odd number and divisible by 3 ======");
                    checking.DivBy7(n,m);

                    break;
                case 2:
                    System.out.println("Enter Number : ");
                    int t = scanner.nextInt();
                    System.out.println("Enter second Number : ");
                    int v =scanner.nextInt();
                    checking.square(t,v);
                    break;
                case 3:
                    System.out.println("Enter initial Number : ");
                    int a = scanner.nextInt();
                    System.out.println("Enter ending Number : ");
                    int b = scanner.nextInt();
                    System.out.println("====== Printing not Odd number and divisible by 9 ======");
                    checking.DivBy9(a, b);
                    break;
                case 4:
                    System.out.println("Enter initial Number : ");
                    int z = scanner.nextInt();
                    System.out.println("Enter ending Number : ");
                    int x = scanner.nextInt();
                    System.out.println("====== Printing Cube between two number ======");
                    checking.cube(z, x);
                    break;
                case 5:
                    System.out.println("Enter initial Number : ");
                    int q = scanner.nextInt();
                    System.out.println("Enter ending Number : ");
                    int w = scanner.nextInt();
                    System.out.println("====== Printing prime number ======");
                    checking.prime(q,w);
                    break;
                case 6:
                    System.out.println("Enter initial Number : ");
                    int r = scanner.nextInt();
                    System.out.println("Enter ending Number : ");
                    int y= scanner.nextInt();
                    System.out.println("====== Printing Cube between two number ======");
                    checking.DivBy11(r, y);
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


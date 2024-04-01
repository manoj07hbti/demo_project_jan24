package test;

import java.util.Scanner;

public class DivisibleBy9AndNotOdd {
    public static boolean isInRange(int num) {
        return num >= 3 && num <= 160;

    }

    public static boolean isDivisibleBy9(int num) {
        return num % 9 == 0;
    }

    public static boolean isNotOdd(int num) {
        return num % 2 != 0;
    }
    public static void cubeNumbers(){

        for (int i = 1; i <= 10; i++) {
            int cube = i * i * i;
            System.out.print(cube);
            if (i < 10) {
                System.out.println(" ,");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number between 3 to 160: ");
        int number = scanner.nextInt();
        if (isInRange(number) && isDivisibleBy9(number) && !isNotOdd
                (number)) {
            System.out.println(number + " is divisible by 9 or it's  not odd.");
        } else {
            System.out.println(number + " is not divisible by 9 or divisible by 9 or it's odd.");
        }
        System.out.println(" cube of numbers 1 to 10:");
        cubeNumbers();

    }

    //public static void cubeNumbers(){

      //  for (int i = 1; i <= 10; i++) {
         //   int cube = i * i * i;
         //   System.out.print(cube);
          ////  if (i < 10) {
           ////     System.out.println(" ,");

    }


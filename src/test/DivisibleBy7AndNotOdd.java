package test;

import java.util.Enumeration;
import java.util.Scanner;

public class DivisibleBy7AndNotOdd {
    public static boolean isInRange(int num){
        return num>=7 && num<=190;
    }
    public static boolean isIsDivisibleBy7(int num) {
     return num % 7==0;
    }
    public static boolean isOdd(int num){
        return num % 2 ==0;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println( " Enter a number between 7 and 190: ");
        int number=scanner.nextInt();
        if(isInRange(number) && isIsDivisibleBy7(number) && isOdd(number)){
            System.out.println( number + " is divisible by 7 and not odd");
        }else {
            System.out.println( number + " is  divisible by 7 and it's  odd");
        }
    }
}
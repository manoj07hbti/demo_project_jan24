package test;

import java.util.Scanner;

public class NumberCheck {
    public static boolean isInRange(int num){
        return num>=8 && num<=160;
    }
    public static boolean isIsDivisibleBy7(int num) {
        return num % 11==0;
    }
    public static boolean isNotOdd(int num){
        return num % 2 ==0;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println( " Enter a number between 11 and 160: ");
        int number=scanner.nextInt();
        if(isInRange(number) && isIsDivisibleBy7(number) && isNotOdd(number)){
            System.out.println( number + " is divisible by 11 and not odd");
        }else {
            System.out.println( number + " is  divisible by 11 and it's  odd");
        }
    }
}


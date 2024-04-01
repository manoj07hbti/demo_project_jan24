package test;

import java.util.Scanner;

public class DivisibleBy3AndNotEven {

    public static boolean isInRange(int num){
        return num>=5 && num<=150;

    }
    public static boolean isDivisibleBy3(int num){
        return num % 3 == 0;
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter a number between 5 to 150: ");
        int number=scanner.nextInt();
        if(isInRange(number) && isDivisibleBy3(number) && !isEven(number)){
            System.out.println(number+ " is divisible by 3 or it's  not even.");
        }else {
            System.out.println(number+ " is not divisible by 3 or it's even.");
        }
    }
}

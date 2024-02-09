package assignment;

public class Nested_IF {
    public static void main(String[] args) {


        //TODO write a code which can find even and odd numbers which is greater than 0.

        int number = 3;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("num is greater then 0 and its even");
            } else {
                System.out.println("num is greater not then 0 and its odd");
            }

        } else {
            System.out.println("num is not greater then 0");
        }
        // TODO write a code which can check any number divisible by 3 and greater than 0
        int num2 = 5;
        if (num2 > 0) {
            if (num2 % 3 == 0) {
                System.out.println("num2 is greater then 0 and divisiable by 3 = " + num2);
            } else {
                System.out.println("num2 is greater then 0 but not div by 3 = " + num2);
            }
        } else {
            System.out.println("not greater then 0");
        }

        // TODO write a code which can check any number divisible by 7 and greater than 0
        int p = -7;
        if (p > 0) {
            if (p % 7 == 0) {
                System.out.println("numb is great than 0 and div by 7");
            } else {
                System.out.println("numb is great than 0 and not div by 7");
            }
        } else System.out.println("numb is not great than 0 ");


    }
}




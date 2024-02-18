package Loops.while_Loop;

public class Factorial {
    public static void main(String[] args) {

        //finding factorial of 5 using while loop
        int number = 5;

        int factorial = 1;
        int i = 1 ;

        while (i <= number){
            factorial =factorial*i;
            i++;
        }

        System.out.println("Factorial of "+number+" is "+factorial);

        System.out.println("=======================================");

        int num = 3;

        int fact = 1;
        int i1 = 1 ;

        while (i1<=num){
            fact = fact * i1;
            i1++;
        }
        System.out.println("Factorial of "+num+ " is "+fact);
    }
}
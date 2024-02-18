package Loops.Do_while_Loop;

public class Factorial_test {
    public static void main(String[] args) {

        int num =5;
        int fact = 1;
        int i =1;
        do {
            i++;
            fact=fact*i;

        }while (i<num);
        System.out.println( "Factorial of 5 is "+ fact);

        System.out.println("================================");

        int num1 = 3;
        int fact1 =1;
        int i1 = 1;
        do {
            i1++;
            fact1 =fact1*i1;

        }while (i1<num1);
        System.out.println("Factorial of 3 is "+ fact1);
    }
}

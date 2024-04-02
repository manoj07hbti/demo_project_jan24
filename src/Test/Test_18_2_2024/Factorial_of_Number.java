package Test.Test_18_2_2024;

public class Factorial_of_Number {
    public static void main(String[] args) {
        int num = 4;
        int fact =1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factdorial of 4 is "+fact);
    }
}

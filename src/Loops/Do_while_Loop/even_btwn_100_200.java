package Loops.Do_while_Loop;

public class even_btwn_100_200 {
    public static void main(String[] args) {
        System.out.println("Printing all even number between 100 to 200");
        int num= 100;

        do {
           // int i = num%2;
            num=num+2;
            System.out.print(num+", ");
        }while (num<200);
    }
}

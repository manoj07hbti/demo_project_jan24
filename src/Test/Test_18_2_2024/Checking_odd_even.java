package Test.Test_18_2_2024;

public class Checking_odd_even {
    public static void main(String[] args) {
        System.out.println("Even number between 3 to 300 ");
        for (int i=3;i<=300;i++){
            if (i % 2 ==0){
                System.out.print( " "+ i);
            }
        }
        System.out.println();
        System.out.println("=====================================================================================================================");
        System.out.println(" Odd numbers between 3 to 300 ");
        for (int i=3;i<=300;i++){
            if (i % 2 !=0){
                System.out.print( " " +i);
            }
        }
    }
}

package Test.Test_18_2_2024;

public class Even_num_div_by_10 {
    public static void main(String[] args) {
        System.out.println("printing numbers which is even number and divisible by 10 between 1 to 100");
        for (int i=1;i<=100;i++){
            if (i % 2==0 && i % 10==0){
                System.out.print(" "+i);
            }
        }
    }
}
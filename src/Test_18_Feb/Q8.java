package Test_18_Feb;

public class Q8 {
    public static void main(String[] args) {
        // write a code to print even number which is also divisible by 10  between 1 to 100.


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 10 == 0) System.out.println(i);

        }
    }
}

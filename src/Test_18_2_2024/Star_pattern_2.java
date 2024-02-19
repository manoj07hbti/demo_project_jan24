package Test_18_2_2024;

public class Star_pattern_2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i > j) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i1 = 1; i1 <= 5; i1++) {
            for (int j1 = 1; j1 <= 5; j1++) {
                if (i1 < j1) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
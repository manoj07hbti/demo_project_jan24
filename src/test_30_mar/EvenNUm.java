package test_30_mar;

import java.util.Scanner;

public class EvenNUm {
public void EvenCheck() {
    Scanner scanner = new Scanner(System.in);
    int j = scanner.nextInt();
    // Loop through numbers from 5 to 150
    for (int i = 5; i <= 150; i++) {
        // Check if the number is divisible by 3 and not even
        if (i % 3 == 0 && i % 2 != 0) {
            System.out.println(i + " is divisible by 3 and not even.");
        }
    }
}






        // Method to check divisibility by 7 and not being odd
        public static void checkDivisibility() {
    Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the starting number of the range: ");
            int v = scanner.nextInt();
            System.out.print("Enter the ending number of the range: ");
            int u = scanner.nextInt();

            for (int i = v; i <= u; i++) {
                if (i % 7 == 0 && i % 2 == 0) {
                    System.out.println(i + " is divisible by 7 and not odd.");
                }
            }
        }


    public static void main(String[] args) {
       EvenNUm obj=new EvenNUm();
       obj.EvenCheck();
       obj.checkDivisibility();

            }
        }




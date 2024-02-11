package conditional_statements.nested;

public class Odd_Even {
    public static void main(String[] args) {
    //Finding Odd even number which is greater then zero

        int i=30;

        if (i > 0) {
            if (i % 2 == 0) {
                System.out.println("Number is even");
            }else {
                System.out.println("Number is Odd");
            }
        }else {
            System.out.println("Number is not a positive number");
        }

    }
}

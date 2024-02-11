package conditional_statements.nested;

public class DivBy3 {
    public static void main(String[] args) {
      //checking number which is divisible by 3 and greater then zero
        int i = 10 ;

        if (i > 0 ) {
            if (i % 3 == 0 ) {
                System.out.println("Number is Divisible by 3");
            }else {
                System.out.println("Number is not Divisible by 3");
            }
        }else {
            System.out.println("Number is not positive number");
        }
    }
}

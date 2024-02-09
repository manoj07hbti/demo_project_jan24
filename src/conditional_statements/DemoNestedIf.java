package conditional_statements;

public class DemoNestedIf {

    public static void main(String[] args) {

        int number=5;

        if(number>0){

            if(number%5 ==0){

                System.out.println("Number is greater than Zero and Divisible by 5");
            } else {
                System.out.println("Number is greater than Zero But NOT  Divisible by 5");
            }

        } else {
            System.out.println("Number is not greater than Zero...");
        }


    }
}

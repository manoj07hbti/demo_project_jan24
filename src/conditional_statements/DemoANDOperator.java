package conditional_statements;

public class DemoANDOperator {

    public static void main(String[] args) {
//if(condition1 && condition2)
// 1- AND Operator   1.   TRUE && TRUE = TRUE

        int number=2;

// TODO write a code to check number is greater than zero and should be divisible by 2
   if(number>0 && number%2==0){

       System.out.println("Number is greater than Zero and divisible by 2...");
   } else {
       System.out.println("Number is either less than Zero or not divisible by 2...");
   }

//2.   TRUE && FALSE= FALSE
      number=3;

        if(number>0 && number%2==0){

            System.out.println("Number is greater than Zero and divisible by 2...");
        } else {
            System.out.println("Number is either less than Zero or not divisible by 2...");
        }

 //3.   FALSE && TRUE= FALSE

        number=-2;

        if(number>0 && number%2==0){

            System.out.println("Number is greater than Zero and divisible by 2...");
        } else {
            System.out.println("Number is either less than Zero or not divisible by 2...");
        }

  // 4.   FALSE && FALSE= FALSE
        number=-3;
        if(number>0 && number%2==0){

            System.out.println("Number is greater than Zero and divisible by 2...");
        } else {
            System.out.println("Number is either less than Zero or not divisible by 2...");
        }


    }
}

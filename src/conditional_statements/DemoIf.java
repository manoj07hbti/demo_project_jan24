package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {

    /*    SYNTAX:
        if(expression/condition){
            //CODE
        }            */

    //TODO - Write a code to check given number is positive number or not

     int number=3;

     if(number>0){
         System.out.println("Give number is greater than Zero so it is positive number: "+number);
     }

     if(number<0){
         System.out.println("Number is less than Zero so it is Negative number: "+number);
     }

     // TODO find a given is even number or odd number

      if(number%2 == 0) {

          System.out.println("Given number is EVEN number:"+number);
      }

      if(number%2 !=0){

          System.out.println("Give number is odd Number:"+number);
      }

    }
}

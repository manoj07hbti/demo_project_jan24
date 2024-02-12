package my_conditional_statement;

public class NotOperator {
    public static void main(String[] args) {

        String country="India";
        if(country!="India"){

            System.out.println("you are Indian");
        }else {
            System.out.println("you are not a Indian");
        }
       // write a code to check number is divisible by 5 using ! operator
        int number=15;
       if(!(number%5!=0)){
           System.out.println("Number is divisible by 5...");
       }else{
           System.out.println("Number is not divisible by 5....");
       }
        int number1=15;
        if(number1%5!=0){
            System.out.println("Number is divisible by 5...");
        }else{
            System.out.println("Number is not divisible by 5....");
        }
        //write a code to check number is even or odd using ! operator
        int number2=4;
        if(!(number2%2!=0)){
            System.out.println("Number is Even.....");
        }else{
            System.out.println("Number is Odd...");
        }
        int number3=5;
        if(!(number3%2!=0)){
            System.out.println("Number is Even.....");
        }else{
            System.out.println("Number is Odd...");
        }

    }
}

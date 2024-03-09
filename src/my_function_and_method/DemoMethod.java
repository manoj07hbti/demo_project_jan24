package my_function_and_method;

public class DemoMethod {
    public void to_makeSquare(){
        int number=8;
        int square=number*number;

        System.out.println("Square of given number 8 is :"+square);

    }

    public void for_voting(){

        // age should be >= 18

        int age=25;

        if(age>=18){
            System.out.println("Eligible for voting...");
        }else {
            System.out.println("Not eligible for voting...");
        }

    }

    public void Even_and_Odd_Number(){
        int number=65;

        if(number%2==0){

            System.out.println("This is Even number: "+number);
        }else {
            System.out.println("This is ODD Number: "+number);
        }

    }

    public static void main(String[] args) {

        DemoMethod obj= new DemoMethod();
        obj.to_makeSquare();

        obj.for_voting();
        obj.Even_and_Odd_Number();
    }


}

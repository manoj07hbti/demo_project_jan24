package function_or_method;

public class DemoMethod {

// Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void makeSquare(){
        int number=6;
        int square=number*number;

        System.out.println("Square of given number is :"+square);

    }

    public void vote(){

        // age should be >= 18

        int age=17;

        if(age>=18){
            System.out.println("eligible for voting...");
        }else {
            System.out.println("Not eligible for voting...");
        }

    }

    public void evenOddNumber(){
        int number=30;

        if(number%2==0){

            System.out.println("This is Even number: "+number);
        }else {
            System.out.println("This is ODD Number: "+number);
        }

    }

    public static void main(String[] args) {

        DemoMethod obj= new DemoMethod();
        obj.makeSquare();

        obj.vote();
        obj.evenOddNumber();
    }


}

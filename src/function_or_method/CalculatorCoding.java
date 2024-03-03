package function_or_method;

public class CalculatorCoding {

                 //method of adding
    public void addition() {

        int a = 9;
        int b = 17;
        int result = a + b;

        System.out.println("Printing addition..A and B :" + result);

    }
               //method of subtraction
    public void subtract() {

        int a = 93;
        int b = 13;
        int result = a - b;

        System.out.println("Printing Subtraction A and B :" + result);


    }
            //method of multiplication
    public void multi() {
        int a = 7;
        int b = 3;
        int result = a * b;

        System.out.println("Printing multiplication A and B :"+result);

    }
            //method of dividend
    public void dividend(){

        int a=24;
        int b=6;
        int result=a/b;

        System.out.println("Printing divident A  and B :"+result);


    }
                //method of square
    public void square(){

        int a=3;
        int result=a*a;
        System.out.println("Printing square of A : "+result);

    }
                //method of cube
    public void cube(){
        int a=9;
        int result=a*a*a;
        System.out.println("Printing cube of A :"+result);


    }

    public static void main(String[] args) {
        CalculatorCoding obj1 = new CalculatorCoding();

        obj1.addition();
        obj1.subtract();
        obj1.multi();
        obj1.dividend();
        obj1.square();
        obj1.cube();
    }
}






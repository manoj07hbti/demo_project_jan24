package function_or_method;

public class CalculatorApp {

    // We are Adding
    public void addition(){

        int a=4;
        int b=6;
        int result=a+b;
        System.out.println("We Are Adding A And B :"+result);
    }

    // We Are Sub
    public void sub(){
        int a=10;
        int b=3;
        int result=a-b;
        System.out.println("We are sub from a and b :"+result);
    }

    // We are dividing
    public void divide(){
        int a=18;
        int b=2;
        int result=a/b;
        System.out.println("we are dividing in a and b :"+result);
    }

    // We are multiplying

    public void multiply(){
        int a=4;
        int b=5;
        int result=a*b;
        System.out.println("we are multiply in a and b:"+result);
    }

    // We Are Cube
    public void cube(){
        int a=4;
        int cube=a*a*a;
        System.out.println("We are printing cube of a :"+cube);
    }

    public static void main(String[] args) {

        CalculatorApp obj= new CalculatorApp();
        obj.addition();
        obj.sub();
        obj.divide();
        obj.multiply();
        obj.cube();
    }

}

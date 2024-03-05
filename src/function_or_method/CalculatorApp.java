package function_or_method;

public class CalculatorApp {

    // We are Adding
    public void addition(int a , int b){
        int result=a+b;
        System.out.println("We Are Adding A And B :"+result);
    }

    // We Are Sub
    public void sub(int a , int b){
        int result=a-b;
        System.out.println("We are sub from a and b :"+result);
    }

    // We are dividing
    public void divide(int a ,int b){
        int result=a/b;
        System.out.println("we are dividing in a and b :"+result);
    }

    // We are multiplying

    public void multiply(int a , int b){
        int result=a*b;
        System.out.println("we are multiply in a and b:"+result);
    }

    // We Are Cube
    public void cube(int a){
        int cube=a*a*a;
        System.out.println("We are printing cube of a :"+cube);
    }

    // we have required percentage

    public void per(int a , int b){
        double per = (double)a*b/100; // number*percentage/100
        System.out.println("We Required a percentage :"+per);
    }

    public static void main(String[] args) {

        CalculatorApp obj= new CalculatorApp();
        obj.addition(4 , 6);
        obj.sub(8 , 4);
        obj.divide(8 , 4);
        obj.multiply(3 , 5);
        obj.cube(4);
        obj.per(350, 10);
    }

}

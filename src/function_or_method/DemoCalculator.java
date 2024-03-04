package function_or_method;

public class DemoCalculator {

    public void addition(){
        int a=23;
        int b=21;

        int result=a+b;

        System.out.println("Addition of given number is :"+result);
    }

    // subtraction
    // multiply
    // divide

    public static void main(String[] args) {

        DemoCalculator obj= new DemoCalculator();
        obj.addition();
    }
}

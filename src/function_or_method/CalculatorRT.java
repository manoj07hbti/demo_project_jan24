package function_or_method;

public class CalculatorRT {
    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public int sub(int c, int d) {
        int sub= c-d;
        return sub;
    }

    public double div(int e, int f) {
        double div = (double) e/f;
        return div;
    }
    public int multi(int a, int b){
        int multi= a*b;
        return multi;
    }

    public static void main(String[] args) {

        CalculatorRT object = new CalculatorRT();
        int add=object.add(5,9);
        System.out.println("Printing Addition :"+add);

        int sub=object.sub(9,5);
        System.out.println("Printing Subtraction :"+sub);

        double div = object.div(8,4);
        System.out.println("Printing Divided :"+div);


        int multi = object.multi(4,7);
        System.out.println("Printing Multiply"+multi);
    }



}



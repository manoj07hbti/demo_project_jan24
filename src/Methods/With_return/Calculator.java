package Methods.With_return;

public class Calculator {

    public int Add(int num1,int num2){
       return  num1+num2;
    }
    public int Sub(int num1,int num2){
        return num1-num2;
    }
    public int Mul(int num1,int num2){
        return num1*num2;
    }
    public double Div(int num1,int num2){
        return  (double) num1/num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int  i=calculator.Add(10,2);
        System.out.println(i);

        int j=calculator.Sub(90,20);
        System.out.println(j);

        int h=calculator.Mul(3,5);
        System.out.println(h);
        
        double k = calculator.Div(15,5);
        System.out.println(k);
    }
}

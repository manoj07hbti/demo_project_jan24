package function_or_method;

public class CalculatorReturnType {

    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int sub(int c, int d) {
        int sub = c - d;
        return sub;
    }
    public double div(int e, int f) {
        double div = (double) e/f;
        return div;
    }
    public static void main(String[] args) {
        CalculatorReturnType obj=new CalculatorReturnType();
        int add = obj.add(4,6);
        System.out.println("We Are printing Add:"+add);
        int sub = obj.sub(6,4);
        System.out.println("We Are printing sub:"+sub);
        double div = obj.div(9,2);
        System.out.println("We Are printing div:"+div);
    }

}

package function_or_method;

public class DemoCalculator {

   /* Calculator App:
   add, sub , divide and multi*/

    public void add() {
        int a = 85;
        int b = 74;
        int sum = a + b;
        System.out.println(sum);
    }

    public void sub() {
        int a = 85;
        int b = 74;
        int sub = a - b;
        System.out.println(sub);
    }

    public void divide() {
        int a = 85;
        int b = 74;
        Double divide = (double) a / b;
        System.out.println(divide);
    }

    public void multi() {
        int a = 85;
        int b = 74;
        int multi = a * b;

        System.out.println(multi);
    }

    public static void main(String[] args) {
        DemoCalculator obj = new DemoCalculator();
        obj.add();
        obj.sub();
        obj.divide();
        obj.multi();
    }


}

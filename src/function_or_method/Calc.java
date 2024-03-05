package function_or_method;

public class Calc {

    public void addition(){
        int a=10;
        int b=15;
        int add=a+b;

        System.out.println("addition of given number is :"+add);

    }

    public void subtraction(){
        int a=20;
        int b=10;
        int sub=a-b;
        System.out.println("subtraction of given number is :"+sub);
    }

    public void multiply(){
        int a=5;
        int b=7;
        int multi=a*b;
        System.out.println("multiplication of given number is :"+multi);
    }

    public void division(){
        int a=20;
        int b=5;
        double div=(double)a/b;
        System.out.println("division of given number is :"+div);

    }
    public static void main(String[] args) {
        Calc obj=new Calc();
        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.division();
    }
}

package oops.polymorphism;

public class MethodOverLoading {


    public void m1(){
        System.out.println("This is m1 method with zero parameters...");
    }

    public void m1(int a){
        System.out.println("Overloaded  m1 method with one int parameters..."+a);
    }
    public void m1(String a){
        System.out.println("Overloaded  m1 method with one String parameters..."+a);
    }

    public void m1(int a, String b){
        System.out.println("Overloaded  m1 method with one String parameters..."+a +b);
    }

    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();
        obj.m1();
        obj.m1("A");
        obj.m1(3);
        obj.m1(3,"ABC");

    }

}

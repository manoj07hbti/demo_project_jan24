package oops.abstraction;

public class DemoChild extends DemoAbstraction{
    @Override
    public void m1() {

        System.out.println("This is m1 method implementation in child class ....");
    }

    public static void main(String[] args) {

        DemoChild obj= new DemoChild();
        obj.m1();
        obj.m2();
    }
}

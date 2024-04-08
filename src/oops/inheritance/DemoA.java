package oops.inheritance;


public class DemoA {

    protected void m1(){
        System.out.println("This is m1 method of DemoA class ...");
    }
    public void m2(){
        System.out.println("This is m2 method of DemoA class ...");
    }
    public void m3(){
        System.out.println("This is m3 method of DemoA class ...");
    }

    public static void main(String[] args) {


        DemoA obj = new DemoA();
        obj.m1();
    }
}

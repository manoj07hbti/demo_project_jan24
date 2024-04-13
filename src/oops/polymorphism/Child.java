package oops.polymorphism;

public class Child extends Parent {

    @Override
    public void m1(){
        System.out.println("This is method of Child class....");
    }

    public static void main(String[] args) {

        Parent obj= new Parent();
        obj.m1();

        Parent obj2= new Child();

        obj2.m1();

     /*   Child obj3= new Parent(); // compile time error
        obj3.m1();*/



    }
}

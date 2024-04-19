package imp_keywords;

public class DemoStatic {

    int age=21;
    public static void m1(){

        System.out.println("This is m1 static method...");
    }

    public static void m1(int a){
        System.out.println("This is m1 static method..."+a);
    }

    public static void main(String[] args) {

        //ClassName.methodName();

        DemoStatic.m1();
    }

}

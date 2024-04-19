package imp_keywords;

public class ChildStatic extends DemoStatic{


    public static void m1(){
        System.out.println("This is m1 static method in child class...");
    }

    public static void main(String[] args) {
        ChildStatic.m1();
    }
}

package Test_11_2_2024;

public class swapping_2_Numbers {
    public static void main(String[] args) {

        int a = 45;
        int b =23;

        System.out.println("before swapping number");
        System.out.println("a "+a);
        System.out.println("b "+b);

         a = a+b;
         b = a-b;
         a = a-b;

        System.out.println("After swapping");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}

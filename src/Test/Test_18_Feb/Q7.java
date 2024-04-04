package Test.Test_18_Feb;

public class Q7 {
    public static void main(String[] args) {
        //write a code to make factorial of number example factorial of 4 will be 4*3*2*1=24


        int i = 4;
        int f = 1;
        int j = 1;
        while (j <= i) {
            f = f * j;
            j++;
        }
        System.out.println(f);
    }
}

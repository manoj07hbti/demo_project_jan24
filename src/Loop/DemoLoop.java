package Loop;

public class DemoLoop {
    public static void main(String[] args) {
        /*TODO Print table of 5 and 10 using for loop*/

        int n = 5;
        for (int p = 1; p <= 10; p++) {
            System.out.println(n + " x " + p + " = " + n * p);
        }


        int o = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(o + " x " + i + " = " + o * i);
        }

        // TODO Print all even number between 1 to 100
        int y = 2;
        for (int k = 1; k <= 100; k++) {
            if (k % y == 0)
                System.out.println(k);
        }

        // TODO Print all odd number between 1 to 100
        for (int q = 1; q <= 100; q++) {
            if (q % y != 0)
                System.out.println(q);


        }


    }
}



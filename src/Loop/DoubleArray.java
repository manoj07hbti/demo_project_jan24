package Loop;

public class DoubleArray {
    public static void main(String[] args) {
        double h[] = {3.5, 5.5, 6.6, 4.6, 1.3, 4.6, 7.2};

        //For loop
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i]);
        }
        System.out.println("printing with for loop" + "\n");

        //advance for loop
        for (double b : h) {
            System.out.println(b);
        }
        System.out.println("printing with advance for loop" + "\n");

        int j = 0;
        while (j < h.length) {
            System.out.println(h[j]);
            j++;
        }
        System.out.println("printing with while loop" + "\n");

        int k = 0;
        do {
            System.out.println(h[k]);
            k++;

        } while (k < h.length);
        System.out.println("printing with Do while loop" + "\n");


    }
}

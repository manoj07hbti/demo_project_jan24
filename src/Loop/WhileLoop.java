package Loop;

public class WhileLoop {
    public static void main(String[] args) {
         /* write a code to find even number between 100 to 200
        write a code for factorial :
        5 = 5X4X3X2X1
        3= 3X2X1
        write a code to check prime number */


        int i = 100;
        while (i <= 200) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }

       /* write a code for factorial :
        5 = 5X4X3X2X1*/

        int j = 5;
        int k = 1;
        int m = 1;
        while (m <= j) {
            k = k * m;
            m++;

        }
        System.out.println(k);


        // 25 fac
        long ab = 25;
        long fac = 1;
        long v = 1;
        while (v <= ab) {
            fac = fac * v;
            v++;

        }
        System.out.println(fac);


        // 3 factorial
        int x = 3;
        int fa = 1;
        int s = 1;
        while (s <= x) {
            fa = fa * s;
            s++;
        }
        System.out.println(fa);



        //write a code to check prime number */

        int num = 11;

            boolean Prime = true;
            int g = 2;

            while (g <= num / 2) {
                if (num % g == 0) {
                    Prime = false;
                    break;
                }
                g++;
            }
            if (Prime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }

        int r = 5;
        if (r <= 1) {
            System.out.println("not prime");
        } else {
            boolean pr = true;
            int f = 2;
            while (f <= r/2 ) {
                if (r % f == 0) {
                    pr = false;
                    break;
                }
                f++;
            }
            if (pr) {
                System.out.println(r + " is prime");
            } else System.out.println(r + "is not prime");
        }












        }


    }


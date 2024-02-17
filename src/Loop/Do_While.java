package Loop;

public class Do_While {
    public static void main(String[] args) {

        /* write a code to find even number between 100 to 200
        write a code for factorial :
        5 = 5X4X3X2X1
        3= 3X2X1
        write a code to check prime number */


        //todo write a code to find even number between 100 to 200
        int p = 100;
        do {
            if (p % 2 == 0)
                System.out.println(p);
            p++;

        } while (p <= 200);


        // TODO write a code for factorial : 5

        int n = 5;
        int f = 1;
        int k = 1;


        do {
            f = f * k;
            System.out.println(f);
            k++;

        } while (k <= n);

        // TODO write a code for factorial : 3

        int ab = 3;
        int ac = 1;
        int ad = 1;

        do {
            ac = ac * ad;
            System.out.println(ac);
            ad++;
        } while (ad <= ab);


        // TODO write a code for factorial : 8

        int ba = 8;
        int bb = 1;
        int bc = 1;
        do {
            bb = bb * bc;
            System.out.println(bb);
            bc++;

        } while (bc <= ba);


        //write a code to check prime number */

        int y = 10;
        int m = 2;
        boolean prime = true;
        if (y <= 1) System.out.println(y + " is not prime");
        else {
            do {
                if (y % m == 0) prime = false;
                break;
            } while (m <= y / 2);
            m++;
            if (prime) System.out.println(y +" is prime");
            else System.out.println(y + " is not prime");

        }
    }
}

package Loop;

public class IntArray {
    public static void main(String[] args) {

        int Distance[] = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int i = 0; i < Distance.length; i++) {
            System.out.println(Distance[i]);
        }
        System.out.println("printing with for loop" + "\n");


        for (int Dis : Distance) System.out.println(Dis);
        System.out.println("printing with advance for loop" + "\n");


        int k = 0;
        while (k < Distance.length) {
            System.out.println(Distance[k]);
            k++;
        }
        System.out.println("printing with while loop" + "\n");


        int j = 0;
        do {
            System.out.println(Distance[j]);
            j++;

        } while (j < Distance.length);
        System.out.println("printing with Do while loop" + "\n");


    }
}

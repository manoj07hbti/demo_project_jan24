package Loop;

public class StringArrayWithLoops {
    public static void main(String[] args) {
        /*String array country
        int array distance
        double array height
        while loop
        do while
        for loop
        advanced loop
        Write logic to find data*/

        String country[] = {"india", "africa", "japan", "america", "south  Korea"};

        for (int i = 0; i < country.length; i++) {
            System.out.println(country[i]);

        }
        System.out.println("printing with for loop" + "\n");

        // advance for loop
        for (String co : country) {
            System.out.println(co);
        }
        System.out.println("printing with advance for loop" + "\n");

        //while loop
        int j = 1;
        while (j < country.length) {
            System.out.println(country[j]);
            j++;
        }
        System.out.println("printing with while loop" + "\n");

        //do while loop

        int k = 1;
        do {
            System.out.println(country[k]);
            k++;
        } while (k < country.length);
        System.out.println("printing with Do while loop" + "\n");


        //finding index number
        String c_name="japan";
        for (int n=1; n<country.length; n++){
            if (country[n].equals(c_name)) System.out.println("data at "+n);
        }


    }
}

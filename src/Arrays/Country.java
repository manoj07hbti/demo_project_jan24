package Arrays;

public class Country {
    public static void main(String[] args) {

        String[] country ={"India ", " Banladesh " , " Sri lanka "," Pakistan "," Afganistan "," Nepal" };

        System.out.println();
        System.out.println("========================For Loop================================");
        for (int i=0;i< country.length;i++){
            System.out.print(country[i]);
        }
        System.out.println();
        System.out.println("========================Advance Loop================================");
        System.out.println("Printing arreylist using var loop:--");
        for (String var:country){
            System.out.print(var);
        }
        System.out.println();
        System.out.println("=========================While Loop===============================");

        int i =0;
        while (i < country.length){
            System.out.print(country[i]);
            i++;
        }
        System.out.println();
        System.out.println("=========================Do While Loop===============================");
        try {
            do {
                i++;
                System.out.println(country[i]);
                // i++;
            } while (i < country.length);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" *");
        }
    }
}

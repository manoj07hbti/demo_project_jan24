package Arrays;

public class Country {
    public static void main(String[] args) {

        String[] country ={"India ", " Banladesh " , " Sri lanka "," Pakistan "," Afganistan "," Nepal" };

        System.out.println("Printing array list using for loop:---");
        for (int i=0;i< country.length;i++){
            System.out.print(country[i]);
        }
        System.out.println();
        System.out.println("========================================================");
        System.out.println("Printing arreylist using var loop:--");
        for (String var:country){
            System.out.print(var);
        }
    }
}

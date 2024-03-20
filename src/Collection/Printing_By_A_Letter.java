package Collection;

import java.util.ArrayList;

public class Printing_By_A_Letter {

    private void PrintbySearch(){
        ArrayList<String> names =new ArrayList<>();
        names.add("Jabbar");
        names.add("Azad");
        names.add("Altaf");
        names.add("Mobin");
        names.add("Kadir");
        names.add("Atif");
        names.add("Nurudin");
        names.add("Ali");
        names.add("Mohammad");
       // System.out.println(names);
        //Printing name which is starting with latter "A";
        for (int i=0;i<names.size();i++){
           // System.out.println(names.get(i));
            if(names.get(0).equalsIgnoreCase("A")){
                System.out.println(names.get(i));
            }

        }
    }

    public static void main(String[] args) {
        Printing_By_A_Letter naam = new Printing_By_A_Letter();
        naam.PrintbySearch();
    }
}

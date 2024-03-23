package Collection.ArrayList;

import java.util.ArrayList;

public class Printing_By_A_Letter {

    private void Print_bySearch(){
        ArrayList<String> names =new ArrayList<>();
        names.add("Jabbar");
        names.add("Azad");
        names.add("Altaf");
        names.add("Mubarak");
        names.add("Kadir");
        names.add("Atif");
        names.add("Nurudin");
        names.add("Ali");
        names.add("Mohammad");

        for (String var:names){
            if(var.startsWith("A")){
                System.out.println(var);
            }

        }
    }

    public static void main(String[] args) {
        Printing_By_A_Letter n = new Printing_By_A_Letter();
        n.Print_bySearch();
    }
}

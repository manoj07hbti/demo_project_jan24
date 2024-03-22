package collection;

import java.util.ArrayList;

public class PrintingLetterA {
    public void Print_bySearch(){

    // create a String arrayList
        ArrayList<String> name = new ArrayList<>();

        name.add("Anuj");
        name.add("Virath");
        name.add("Vivek");
        name.add("Sidharth");
        name.add("Sarthak");
        name.add("Anil");
        name.add("Kartik");
        name.add("Rohan");
        name.add("Aditya");

        for(String  var:name){
            if(var.startsWith("K")){
                System.out.println(var);
            }
        }
    }

    public static void main(String[] args) {
        PrintingLetterA name = new PrintingLetterA();
        name.Print_bySearch();
    }
}

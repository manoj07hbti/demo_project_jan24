package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArrayIndex {
    public void String() {
        //TODO find index of any given String only if u r find

        // ClassName objName = new ClassName();
        ArrayList <String >list = new ArrayList();

        list.add("Rohan");  //0
        list.add("Vipin");  //1
        list.add("Arjeet"); //2
        list.add("Vikrant");//3
        list.add("Vaibhav");//4
        list.add("Virath"); //5

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        // using for loop....

        for (int i = 0; i <= list.size(); ++i) {
            System.out.println("Print data : " + i);

        }
    }
    public static void main(String[] args) {
        CollectionArrayIndex obj = new CollectionArrayIndex();
        obj.String();
    }




}

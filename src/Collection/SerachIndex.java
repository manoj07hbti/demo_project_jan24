package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SerachIndex {


    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList();
        mylist.add("ram");
        mylist.add("sita");
        mylist.add("lakshman");
        mylist.add("hanuman");
        mylist.add("ravan");
        mylist.add("lanka");
        //TODO find index of any given String only if you are able to find


        Scanner scan = new Scanner(System.in);
        String search = scan.next();
        for (int i = 0; i <= mylist.size() - 1; i++) {
            if (search.equals(mylist.get(i)))
                System.out.println("Found at a index of " + i);


        }


    }


}

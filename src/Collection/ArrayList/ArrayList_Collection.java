package Collection.ArrayList;

import java.util.ArrayList;


 class ArrayList_Collection {
    private void coll() {
        ArrayList<String> List = new ArrayList<>();

        List.add("Atif");
        List.add("Idd");
        List.add("mohammad");
        List.add("Eid");
        List.add("Rakesh");

        System.out.println("=====printing All Names=====");
        for (int i =0 ;i< List.size();i++){
            System.out.println("Index "+i + " = "+List.get(i));
        }


        System.out.println("===printing values using while loop===");

        int j= 0;
        while (j<List.size()){
            System.out.println("Index "+j + " = "+List.get(j));
            j++;
        }


        System.out.println("==Printing all values using do-while loop==");
         int k =0;
        do {
            System.out.println("Index "+k + " = "+List.get(k));
            k++;
        }while (k< List.size());
    }


       public static void main(String[] args) {
       ArrayList_Collection arrayList = new ArrayList_Collection();
        arrayList.coll();
    }
}

package collection.hash_Map;

import model.Engineer;

import java.util.ArrayList;
import java.util.HashMap;

public class EngineerData {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Engineer>>set = new HashMap<>();
        Engineer engg1 = new Engineer("Aman","CS","AGRA","AM");
        Engineer engg2 = new Engineer("Ajay","IT","AJMER","AAO");
        Engineer engg3 = new Engineer("Arman","ME","DELHI","GM");
        Engineer engg4 = new Engineer("Rohan","EE","PUNE","UDC");

        ArrayList<Engineer>Govt1 = new ArrayList<>();
        Govt1.add(engg1);
        Govt1.add(engg2);


        ArrayList<Engineer>Govt2 = new ArrayList<>();
        Govt1.add(engg3);
        Govt1.add(engg4);


        set.put("x",Govt1);
        set.put("Y",Govt2);

        //using for loop

        for(String key : set.keySet()){
            for(Engineer eng: set.get(key)){
                if(key.equals(Govt1)){
                    System.out.println(eng.getLocation());
                }else{
                    System.out.println(eng.getLocation());
                }
            }
        }


    }
}

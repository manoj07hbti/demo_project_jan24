package HashMap.adv;

import model.Engineer;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo_Engineer {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Engineer>> set = new HashMap<>();
        Engineer eng1 = new Engineer("raj",25);
        Engineer eng2 = new Engineer("prafful",26);
        Engineer eng3 = new Engineer("RAhul",24);
        Engineer eng4 = new Engineer("Abhi",22);

        ArrayList<Engineer> company1 = new ArrayList<>();
        company1.add(eng3);
        company1.add(eng4);
        ArrayList<Engineer> company2 = new ArrayList<>();
        company1.add(eng1);
        company1.add(eng2);

        set.put("A",company1);
        set.put("B",company2);

        for (String var : set.keySet()){

            for (Engineer eng: set.get(var)){
                if (var.equals(company1)){
                    System.out.println(eng.getName());

                }else {
                    System.out.println(eng.getName());
                }

            }
        }



    }
}

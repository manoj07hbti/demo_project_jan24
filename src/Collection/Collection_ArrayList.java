package Collection;

import java.util.ArrayList;

public class Collection_ArrayList {
    /*  1. String list : CountryName
  2. Country Population : Long
  3. Salary:Double*/
    public ArrayList<String> list() {
        ArrayList<String> countryName = new ArrayList<String>();
        countryName.add("india");
        countryName.add("pokki");
        countryName.add("japan");
        countryName.add("america");
        countryName.add("africa");
        return countryName;

    }

    public ArrayList<Long> list2() {

        ArrayList<Long> population = new ArrayList<Long>();

        population.add(68541851L);
        population.add(68541829651L);
        population.add(68545842451L);
        population.add(6854174451L);

        return population;
    }

    public ArrayList<Double> S() {
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(8561.6655);
        salary.add(852561.695);
        salary.add(855261.695);
        salary.add(18561.695);
        salary.add(128561.695);

        return salary;
    }


    public static void main(String[] args) {
        Collection_ArrayList obj = new Collection_ArrayList();
        ArrayList<String> countryName = obj.list();

        for (String var : countryName) {
            System.out.println(var);
        }

        ArrayList<Long> list2 = obj.list2();
        for (Long v : list2) {
            System.out.println(v);
        }


        ArrayList<Double> S = obj.S();
        for (double o : S) {
            System.out.println(o);

        }


    }
}

package Set;

import java.util.HashSet;

public class Hash_Set {

   /* list 1 - String
    list 2 - Integer
    list 3 - Double*/

    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("ram");
        name.add("sita");
        name.add("ram");
        name.add("sita");

        for (String o : name) {
            System.out.println(o);
        }


        HashSet<Integer> age = new HashSet<>();
        age.add(5);
        age.add(6);
        age.add(6);
        age.add(7);

        for (Integer p : age) {
            System.out.println(p);
        }


        HashSet<Double> salary = new HashSet<>();
        salary.add(45.9652);
        salary.add(541.452);
        salary.add(54.3);
        salary.add(54.3);

        for (Double s : salary) {
            System.out.println(s);
        }


    }


}

package Set;

import model.Engineer;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset_Of_Engineer {

    public HashSet<Engineer> eng() {
        HashSet<Engineer> set = new HashSet<Engineer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to number of eng");
        int num;
        num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Name of eng");
            String name = scan.next();
            System.out.println("Age of eng");
            int age = scan.nextInt();

            Engineer eng1 = new Engineer(name, age);
            set.add(eng1);


        }

        return set;


    }

    public static void main(String[] args) {
        Hashset_Of_Engineer obj = new Hashset_Of_Engineer();
        HashSet<Engineer> s = obj.eng();

        for (Engineer eng : s) {
            System.out.println(eng.getName() + "\n" + eng.getAge());
        }

    }


}

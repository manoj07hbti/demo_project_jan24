package HashMap.adv;

import model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class demo_Student {

    public static void main(String[] args) {


        /* Assignment: create Employee,Doctor,Engineer HashMap */

        HashMap<String, ArrayList<Student>> set = new HashMap<>();


        Student Student_1 = new Student("raj", 25, "singh");
        Student Student_2 = new Student("Rahul", 26, "kumar");
        Student Student_3 = new Student("Raja", 27, "nana");
        Student Student_4 = new Student("Rajkumar", 28, "singh");

        ArrayList<Student> secA = new ArrayList<>();
        secA.add(Student_1);
        secA.add(Student_3);
        ArrayList<Student> secB = new ArrayList<>();
        secB.add(Student_2);
        secB.add(Student_4);

        set.put("A", secA);
        set.put("B", secB);


        for (String key : set.keySet()) {

            for (Student Student : set.get(key)) {

                if (key.equals("A")) {
                    System.out.println("Printing sec A " + Student.getName());
                } else {
                    System.out.println("Printing sec B " + Student.getName());
                }
            }

        }

    }


}

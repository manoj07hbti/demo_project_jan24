package collection_demo.array_list.set;

import java.util.HashSet;

public class DemoHashSet {

    public static void main(String[] args) {

        HashSet <String> course= new HashSet<>();
        course.add("Java");
        course.add("Spring");
        course.add("Java");
        course.add("Spring");

        System.out.println(course);

        for(String var:course){
            System.out.println("Printing set data: "+var);
        }


    }
}

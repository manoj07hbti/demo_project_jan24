package collection_demo.array_list.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> course= new LinkedHashSet<>();
        course.add("Java");
        course.add("Spring");
        course.add("Java");
        course.add("Spring");
        course.add("Spring Boot");
        course.add("Microservice");

        System.out.println(course);

        for(String var:course){
            System.out.println("Printing set data: "+var);
        }


    }
}

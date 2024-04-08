package collection_demo.array_list.hashmap;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentHashMap {


    public static void main(String[] args) {

        //I want to store section wise student data
        HashMap<String,  ArrayList<Student>> studentHashMap= new HashMap<>();

        // create student data
        Student student1 = new Student("Raj",1,"CS");
        Student student2 = new Student("Rakesh",2,"CS");
        Student student3 = new Student("Rahul",3,"CS");
        Student student4 = new Student("Mukesh",4,"CS");

        // create student list of section A
        ArrayList<Student> sectionA= new ArrayList<>();
        sectionA.add(student1);
        sectionA.add(student2);
        ArrayList<Student> sectionB= new ArrayList<>();
        sectionB.add(student3);
        sectionB.add(student4);

        // I want to add 2 student in section A and 2 student in section B

        studentHashMap.put("A",sectionA);
        studentHashMap.put("B",sectionB);


        for(String key : studentHashMap.keySet()){

            for(Student student: studentHashMap.get(key)){
                {
                    if(key.equals("A")){
                    System.out.println("Printing Student of A Section:"+student.getName());
                    } else{
                    System.out.println("Printing Student of B Section:"+student.getName());
                    }
                }

            }

        }

    }
}

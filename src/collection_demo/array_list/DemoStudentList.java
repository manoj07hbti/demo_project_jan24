package collection_demo.array_list;

import model.Student;

import java.util.ArrayList;

public class DemoStudentList {

    public ArrayList <Student> createStudentList(){

        //TODO Ask user to give input like how many students you want to add :n
        // it will ask n times to enter student information Name, rollNo and Section

        // //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <Student> studentArrayList= new ArrayList<>();

        // create student data
        Student student1 = new Student("Raj",1,"CS");
        Student student2 = new Student("Raj",2,"CS");
        Student student3 = new Student("Rahul",3,"CS");
        Student student4 = new Student("Mukesh",4,"CS");

        //add data to list
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        return studentArrayList;
    }

    public static void main(String[] args) {

        DemoStudentList obj= new DemoStudentList();
        ArrayList <Student> students= obj.createStudentList();

        for(Student var: students){

            System.out.println("Printing student info Name : "+var.getName()+ " Rollno: "+var.getRollNo()+" Section: "+var.getDept());
        }

    }

}

package collection_demo;

import java.util.ArrayList;

public class Demo {

    public void demo(){
        // I want to store student names of a college

       /* String name1="Raj";
        String name2="Rahul";
        String name3="Jatin";*/

        //array :

        ArrayList list= new ArrayList();

        // Adding data to list
        list.add("Raj");// 0 INDEX
        list.add("Ramesh");// 1 INDEX
        list.add("Mukesh");// 2 INDEX
        list.add("Mohit");//3 INDEX

        //TODO print all element of list using for, while , do while and advance for loop
        // list.size();// it will give size of list
        //TODO find index of any given String only if you are able to find
        System.out.println(list);
        //getting data from Arraylist get(INDEX);
        System.out.println("Printing data: "+list.get(1));

        // delete remove(INDEX)

        list.remove(0);

        System.out.println("After deletion : "+list);



    }


    public static void main(String[] args) {
      Demo obj= new Demo();
      obj.demo();


    }
}

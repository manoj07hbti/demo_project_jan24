package collection_array_list.hashmap;

import model.Doctor;
import model.Engineer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Engineer_HashMap {

    public static void main(String[] args){

        LinkedHashMap<String , ArrayList<Engineer>> Engineer_HashMap = new LinkedHashMap<>();

        // create Engineers Data

        Engineer engineer1 = new Engineer("Ankur", "ME" , "Mumbai", "Sr Eng");

        Engineer engineer2 = new Engineer("Akash", "ME" , "Mumbai", "Sr Eng");

        Engineer engineer3 = new Engineer("Amit", "ME" , "Pune" , "Developer");

        Engineer engineer4 = new Engineer("Rajeev" , "IT", "Pune" ,"Sr Developer");

        Engineer engineer5 = new Engineer("Suraj" , "IT", "Pune" ,"Sr Developer");

        Engineer engineer6 = new Engineer("Dhiraj" , "IT", "Pune" ,"Sr Developer");

        // Create Engineers List Of Branch Wise

        ArrayList<Engineer> BranchA = new ArrayList<>();
        BranchA.add(engineer1);
        BranchA.add(engineer2);
        BranchA.add(engineer3);

        ArrayList<Engineer> BranchB = new ArrayList<>();
        BranchB.add(engineer4);
        BranchB.add(engineer5);
        BranchB.add(engineer6);

        // I want to add Engineers Branch Wise.
        Engineer_HashMap.put("A" , BranchA);
        Engineer_HashMap.put("B" , BranchB);

        for(String key : Engineer_HashMap.keySet()){

            for(Engineer engineer: Engineer_HashMap.get(key)) {

                if (key.equals("A")) {
                    System.out.println("Printing Engineers Of Branch A:" +engineer.getBranch());
                } else {
                    System.out.println("Printing Engineers Of Branch B:" + engineer.getBranch());
                }
            }
        }


    }



}

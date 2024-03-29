package collection_array_list.hashset;

import model.Doctor;
import model.Engineer;

import java.util.HashSet;

public class Engineer_HashSet {

    public HashSet<Engineer> EngineerSet() {

        HashSet<Engineer> engineerHashSet = new HashSet<>();

        Engineer engineer1 = new Engineer("Gaurav", "ME" , "Mumbai", "Sr Eng");
        System.out.println("HashCode of engineer1:"+engineer1.hashCode());

        Engineer engineer2 = new Engineer("Gaurav", "ME" , "Mumbai", "Sr Eng");
        System.out.println("HashCode of engineer2:"+engineer2.hashCode());

        Engineer engineer3 = new Engineer("Nitin", "IT" , "Pune" , "Developer");
        System.out.println("HashCode of engineer3:"+engineer3.hashCode());

        Engineer engineer4 = new Engineer("Rajeev" , "IT", "Pune" ,"Sr Developer");
        System.out.println("HashCode of engineer4:"+engineer4.hashCode());

        Engineer engineer5 = new Engineer("Rajeev" , "IT", "Pune" ,"Sr Developer");
        System.out.println("HashCode of engineer5:"+engineer5.hashCode());

        engineerHashSet.add(engineer1);
        engineerHashSet.add(engineer2);
        engineerHashSet.add(engineer3);
        engineerHashSet.add(engineer4);
        engineerHashSet.add(engineer4);

        return engineerHashSet;

    }

    public static void main(String[] args){

        Engineer_HashSet obj = new Engineer_HashSet();

            for(Engineer var : obj.EngineerSet()){
                System.out.println("Printing Of Set :"+var.getName());
            }

    }


}

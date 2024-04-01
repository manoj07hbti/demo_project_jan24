package collection.hashset;

import model.Doctor;
import model.Engineer;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Engineer_HashSet {

    public LinkedHashSet<Engineer> EngineerSet() {

        LinkedHashSet<Engineer> engineerHashSet = new LinkedHashSet<>();

        Engineer engineer1 = new Engineer("Hirdesh", "EE" , "AGRA", "TA");
        System.out.println("HashCode of engineer1:"+engineer1.hashCode());

        Engineer engineer2 = new Engineer("YOGESH", "CS" , "NOIDA", "SSE");
        System.out.println("HashCode of engineer2:"+engineer2.hashCode());

        Engineer engineer3 = new Engineer("NEERAJ", "IT" , "DELHI" , "AM");
        System.out.println("HashCode of engineer3:"+engineer3.hashCode());

        Engineer engineer4 = new Engineer("VIKAS" , "EE", "GOA" ,"PR");
        System.out.println("HashCode of engineer4:"+engineer4.hashCode());

        Engineer engineer5 = new Engineer("YOGESH" , "AI", "DELHI" ,"AM");
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

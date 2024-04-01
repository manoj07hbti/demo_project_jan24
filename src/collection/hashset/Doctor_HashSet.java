package collection.hashset;

import model.Doctor;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Doctor_HashSet {

    public LinkedHashSet<Doctor> DoctorSet(){

        LinkedHashSet<Doctor> doctorHashSet = new LinkedHashSet<>();

        // create Doctor data with Hashset

        Doctor doctor1 = new Doctor("Pavan" , "9927324417" , "AGRA" , "OrthoPedic");
        System.out.println("HashCode of doctor1:"+doctor1.hashCode());



        Doctor doctor2 = new Doctor("Kartik" , "98979232144" , "Aligarh" , "Dentist");
        System.out.println("HashCode of doctor2:"+doctor2.hashCode());



        Doctor doctor3 = new Doctor("Vinay", "9927324417" , "Delhi" , "Seasonal");
        System.out.println("HashCode of doctor3:"+doctor3.hashCode());



        Doctor doctor4 = new Doctor("Sexana" , "8821346621" ,"Goa" ,"Dermatologist");
        System.out.println("HashCode of doctor4:"+doctor4.hashCode());



        Doctor doctor5 = new Doctor("Vinay" , "9944556112" ,"Mathura" ,"Neurologist");
        System.out.println("HashCode of doctor5:"+doctor5.hashCode());









        // add data to list
        doctorHashSet.add(doctor1);
        doctorHashSet.add(doctor2);
        doctorHashSet.add(doctor3);
        doctorHashSet.add(doctor4);
        doctorHashSet.add(doctor5);

        return doctorHashSet;

    }

    public static void main(String[] args){

        Doctor_HashSet obj = new Doctor_HashSet();

        for(Doctor var : obj.DoctorSet()){

            System.out.println("Printing HashSet:"+var.getName());
        }

    }

}

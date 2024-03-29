package collection_array_list.hashset;

import model.Doctor;

import java.util.HashSet;

public class Doctor_HashSet {

    public HashSet<Doctor> DoctorSet(){

        HashSet<Doctor> doctorHashSet = new HashSet<>();

        // create Doctor data

        Doctor doctor1 = new Doctor("Manish" , "9876543267" , "Agra" , "Dentist");
        System.out.println("HashCode of doctor1:"+doctor1.hashCode());

        Doctor doctor2 = new Doctor("Manish" , "9876543267" , "Agra" , "Dentist");
        System.out.println("HashCode of doctor2:"+doctor2.hashCode());

        Doctor doctor3 = new Doctor("Mahaveer", "8630597864" , "Tundla" , "Seasonal");
        System.out.println("HashCode of doctor3:"+doctor3.hashCode());

        Doctor doctor4 = new Doctor("Sanjay Verma" , "9876566788" ,"Tundla" ,"Seasonal");
        System.out.println("HashCode of doctor4:"+doctor4.hashCode());

        Doctor doctor5 = new Doctor("Sanjay Verma" , "9876566788" ,"Tundla" ,"Seasonal");
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

            System.out.println("Printing Set:"+var.getName());
        }

    }

}

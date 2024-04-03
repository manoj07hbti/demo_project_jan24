package collection_array_list.hashmap;

import model.Doctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Doctor_HashMap {

    public static void main(String[] args){

        HashMap<String , ArrayList<Doctor>> Doctor_HashMap = new HashMap<>();

        // Create Doctor Data
        Doctor doctor1 = new Doctor("Manish" , "9876543267" , "Agra" , "Dentist");

        Doctor doctor2 = new Doctor("Kapil" , "9876543265" , "Kuberpur" , "Cancer");

        Doctor doctor3 = new Doctor("Mahaveer", "8630597864" , "Agra" , "Child Specialist");

        Doctor doctor4 = new Doctor("Sanjay Verma" , "9876566788" ,"Kuberpur" ,"Seasonal");

        Doctor doctor5 = new Doctor("Jain" , "9876566789" ,"Agra" ,"General");

        Doctor doctor6 = new Doctor("Manik" , "9876586789" ,"Kuberpur" ,"Health");

        // Create Doctors List Of Location Wise

        ArrayList<Doctor> locationA = new ArrayList<>();
        locationA.add(doctor1);
        locationA.add(doctor2);
        locationA.add(doctor3);

        ArrayList<Doctor> locationB = new ArrayList<>();
        locationB.add(doctor4);
        locationB.add(doctor5);
        locationB.add(doctor6);

        // I want to add Doctors Location Wise.
        Doctor_HashMap.put("A" , locationA);
        Doctor_HashMap.put("B" , locationB);

        for (String key : Doctor_HashMap.keySet()){

            for(Doctor doctor: Doctor_HashMap.get(key)){

                if(key.equals("A")){
                System.out.println("Printing Doctor Of Location A:"+doctor.getLocation());
                }else{
                    System.out.println("Printing Doctor Of Location B:"+doctor.getLocation());
                }

            }

        }


    }



}

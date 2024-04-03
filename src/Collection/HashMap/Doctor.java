package Collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Doctor {
    public static void main(String[] args) {
        Doctor doctor=new Doctor();
        doctor.useDoctor();
    }
    private void useDoctor(){
        HashMap<String, ArrayList<DoctorDetails>>Doct=new HashMap<>();
        ArrayList<DoctorDetails>Dept_A=new ArrayList<>();
        ArrayList<DoctorDetails>Dept_B=new ArrayList<>();
        DoctorDetails doctorDetails1=new DoctorDetails("Akash",676,"Dental");
        DoctorDetails doctorDetails2=new DoctorDetails("Ankit",677,"Dental");
        DoctorDetails doctorDetails3=new DoctorDetails("Akhilesh",678,"Dental");
        DoctorDetails doctorDetails4=new DoctorDetails("Akhil",679,"Dental");
        DoctorDetails doctorDetails5=new DoctorDetails("Amit",680,"Dental");
        DoctorDetails doctorDetails6=new DoctorDetails("Asis",681,"Dental");

        Dept_A.add(doctorDetails1);
        Dept_A.add(doctorDetails2);
        Dept_A.add(doctorDetails3);
        Dept_B.add(doctorDetails4);
        Dept_B.add(doctorDetails5);
        Dept_B.add(doctorDetails6);
        Doct.put("A",Dept_A);
        Doct.put("B",Dept_B);

        for (String Doctors: Doct.keySet()){
            for (DoctorDetails doctors:Doct.get(Doctors)){
                System.out.println("=====================================");
                System.out.println(" Name : "+doctors.getName()+"\n Id : "+doctors.getId()+"\n Specialist : "+doctors.Specialist);
            }
        }
    }
}
 class DoctorDetails{

    String name;
    int id;
    String Specialist;

     public DoctorDetails(String name, int id, String specialist) {
         this.name = name;
         this.id = id;
         this.Specialist = specialist;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getSpecialist() {
         return Specialist;
     }

     public void setSpecialist(String specialist) {
         this.Specialist = specialist;
     }
 }
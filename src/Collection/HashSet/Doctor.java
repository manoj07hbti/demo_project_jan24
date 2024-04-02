package Collection.HashSet;

import java.util.HashSet;

public class Doctor {
    String name;
    int IdNo;
    String dept;

    public Doctor(String name, int rollNo, String dept) {
        this.name = name;
        this.IdNo = rollNo;
        this.dept = dept;
    }
}
class DrUser{

    public HashSet<Doctor> Dr(){
        HashSet<Doctor>doctors=new HashSet<>();
        Doctor doctor= new Doctor("idd",1,"Dental");
        Doctor doctor1= new Doctor("idu",2,"Cardiologist");
        Doctor doctor2= new Doctor("iddMD",3,"Emergency");
        Doctor doctor3= new Doctor("MD idd",4,"Urologist");
        Doctor doctor4= new Doctor("idd Mohammad",5,"Dialysis");

        doctors.add(doctor);
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);

        return doctors;
    }

    public static void main(String[] args) {
        DrUser drUser=new DrUser();

        for (Doctor doctor: drUser.Dr()){
            System.out.println("--------------------------------");
            System.out.println(" Name : "+ doctor.name
                              +"\n ID  : "+doctor.IdNo
                              +"\n Dept : "+doctor.dept);
        }
    }
}
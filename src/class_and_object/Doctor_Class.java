package class_and_object;

public class Doctor_Class {
    String specialist="Neurologist";
    String name="Dr. Mathur";
    int age=30;
    String qualification="MBBS";

    public static void main(String[] args) {
        Doctor_Class obj1= new Doctor_Class ();
        System.out.println("Doctor name; "+obj1.name+" age; "+obj1.age+" qualification; "+obj1.qualification+" specialist; "+obj1.specialist);

        Doctor_Class  obj2= new Doctor_Class();
        System.out.println("Doctor name; "+obj2.name+" age; "+obj2.age+" qualification; "+obj2.qualification+" specialist; "+obj2.specialist);

        Doctor_Class obj3= new Doctor_Class();
        System.out.println("Doctor name; "+obj3.name+" age; "+obj3.age+" qualification; "+obj3.qualification+" specialist; "+obj3.specialist);

        Doctor_Class obj4= new  Doctor_Class();
        System.out.println("Doctor name; "+obj4.name+" age; "+obj4.age+" qualification; "+obj4.qualification+" specialist; "+obj4.specialist);

        Doctor_Class obj5= new Doctor_Class();
        System.out.println("Doctor name; "+obj5.name+" age; "+obj5.age+" qualification; "+obj5.qualification+" specialist; "+obj5.specialist);


    }
}
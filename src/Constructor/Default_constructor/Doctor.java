package Constructor.Default_constructor;

public class Doctor {

    int Id =7;
    String name = "Sayed";
    double height =5.9;
    String Specialist = "Surgeon";
    String Branch ="Cardiologists";

    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        System.out.println("Doctor Id         : " +doctor.Id);
        System.out.println("Doctor Name       : " +doctor.name);
        System.out.println("Doctor Height     : " +doctor.height);
        System.out.println("Doctor Specialist : " +doctor.Specialist);
        System.out.println("Doctor Branch     : " +doctor.Branch);
    }
}

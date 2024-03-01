package Constructor.parametric_constructor;

public class Doctor {
    int Id;
    String name;
    double height;
    String Specialist;
    String Branch;

    public Doctor(int id, String name, double height, String specialist, String branch) {
       this.Id = id;
        this.name = name;
        this.height = height;
        this.Specialist = specialist;
        this.Branch = branch;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor(1,"Umar",5.9,"Surgeon","Cardiologist");

        System.out.println("====Doctor Details===="+"\nName        : "+doctor.name+"\nID No.      : "+doctor.Id+
                "\nHeight      : "+doctor.height+"\nSpecialist  : "+doctor.Specialist+"\nBranch      : "+doctor.Branch+"\n");

        Doctor doctor1 = new Doctor(2,"Sayed",5.5,"Surgeon","Cardiologist");

        System.out.println("====Doctor Details===="+"\nName        : "+doctor1.name+"\nID No.      : "+doctor1.Id+
                "\nHeight      : "+doctor1.height+"\nSpecialist  : "+doctor1.Specialist+"\nBranch      : "+doctor1.Branch+"\n");

    }
}

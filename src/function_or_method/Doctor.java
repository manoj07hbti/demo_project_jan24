package function_or_method;

public class Doctor {
    String Name;
    String specialist;
    String location;

    // Surgery
    // prescription
    // Sleep

    public void Surgery (){
        System.out.println("This is Surgery Methods");
    }
    public void prescription (){
        System.out.println("This is prescription Methods");
    }
    public void Sleep (){
        System.out.println("This is Sleep Methods");
    }
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.Surgery();
        doctor.prescription();
        doctor.Sleep();



    }


}

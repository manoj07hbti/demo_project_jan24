package function_or_method;

public class Doctor {

    public void specialization(){
        System.out.println("nuro surgen ");
    }
public void degree(){
    System.out.println("MBBS");

    }
    public void age(){
        System.out.println(" age 42 ");
    }

    public static void main(String[] args) {
        Doctor obj=new Doctor();
        obj.specialization();
        obj.age();
        obj.degree();
    }

}

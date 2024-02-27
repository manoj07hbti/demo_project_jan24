package Class_Object;

public class Doctor {
/*
    Default Constructor:
    Employee class and 5 Object
    Doctor class and 5 Object
    Engineer class and 5 Object*/

    String Dr="Ram";
    int age =42;
    double salary = 56234;
    String sp ="heart";

    public static void main(String[] args) {
        Doctor Doc=new Doctor();
        System.out.println("printing   =  "+Doc.Dr+" "+Doc.age+" "+Doc.salary+" "+Doc.sp);
    }

}

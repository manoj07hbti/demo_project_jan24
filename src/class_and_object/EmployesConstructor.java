package class_and_object;

public class EmployesConstructor {
    String name;

    String post;

    String location;

    double salary;

    int empID;

    public EmployesConstructor(String name, String post, String location, double salary, int empID) {
        this.name = name;
        this.post = post;
        this.location = location;
        this.salary = salary;
        this.empID = empID;
    }
       //Parameterized constructor
    public static void main(String[] args) {

         EmployesConstructor employee1 =new EmployesConstructor("Pankaj Singh","UDC","Delhi",55902,546);

        System.out.println("Printing Employee Name :"+employee1.name);
        System.out.println("Printing Employee Post :"+employee1.post);
        System.out.println("Printing Employee location :"+employee1.location);
        System.out.println("Printing Employee salary : "+employee1.salary);
        System.out.println("Printing Employee empID :"+employee1.empID);
    }
}

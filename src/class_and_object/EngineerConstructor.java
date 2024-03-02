package class_and_object;

public class EngineerConstructor {

    String name;
    String post;
    String location;
    double salary;
    int empId;

    // Use parameterized constructor

    public EngineerConstructor(String name, String post, String location, double salary, int empId) {
        this.name = name;
        this.post = post;
        this.location = location;
        this.salary = salary;
        this.empId = empId;
    }

    public static void main(String[] args) {
        EmployesConstructor emp1= new EmployesConstructor("Siddharth Manhottra","Director","Banglore",256173,811);
        System.out.println("Printing Employee Name :"+emp1.name);
        System.out.println("Printing Employee post :"+emp1.post);
        System.out.println("Printing Employee location :"+emp1.location);
        System.out.println("Printing Employee salary :"+emp1.salary);
        System.out.println("Printing Employee ID :"+emp1.empID);
    }
}

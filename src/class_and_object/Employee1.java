package class_and_object;

public class Employee1 {
    String name;
    String designation;
    String location;
    double Salary;
    int empId;

    public Employee1(String name, String designation, String location, double salary, int empId) {
        this.name = name;
        this.designation = designation;
        this.location = location;
        Salary = salary;
        this.empId = empId;
    }

    public static void main(String[] args) {
        Employee1 employee2 = new Employee1("Rajeev","Credit","Agra",30675.65,1322);
        System.out.println("Printing Employee Name :"+employee2.name);
        System.out.println("Printing Employee designation :"+employee2.designation);
        System.out.println("Printing Employee location :"+employee2.location);
        System.out.println("Printing Employee salary :"+employee2.Salary);
        System.out.println("Printing Employee empId :"+employee2.empId);






    }





}

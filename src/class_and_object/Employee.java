package class_and_object;

public class Employee {

    //properties : data member

    String name = "Rajeev";
    String designation = "Credit";
    String location = "Agra";
    double Salary = 30657.56;
    int empid = 1322;

    public static void main(String[] args) {

        //ClassName objName= new ClassName(); // Default Constructor

        Employee employee1 = new Employee();

        System.out.println("Printing Employee Name :" +employee1.name + " designation:" +employee1.designation + " location:" +employee1.location + " Salary:" + employee1.Salary + " empid:" + employee1.empid);



    }



}

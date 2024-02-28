package class_and_object;

public class Employee {

    String name;
    int empId;
    String dept;

    //param constructor


    public Employee(String name, int empId, String dept) {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
    }

    public static void main(String[] args) {

        Employee employee1= new Employee("rahul",1,"IT");

        System.out.println(employee1.name);

    }
}

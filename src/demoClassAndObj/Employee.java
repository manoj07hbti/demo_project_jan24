package demoClassAndObj;

public class Employee {

    String name="Rahul";
    int age=35;
    String department="HR";

    public static void main(String[] args) {
        Employee obj1=new Employee();
        System.out.println("name: "+obj1.name + "age: "+obj1.age + "department: "+obj1.department);

        Employee obj2=new Employee();
        Employee obj3=new Employee();
        Employee obj4=new Employee();
        Employee obj5=new Employee();

    }
}

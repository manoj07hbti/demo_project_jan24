package class_and_object;

public class Employee_Param_Constructor {
    String name;
    int age;
    double salary;

    public Employee_Param_Constructor(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee_Param_Constructor obj1=new Employee_Param_Constructor("Rakesh",27,25000);
        System.out.println("Name: "+obj1.name+" age: "+obj1.age+" salary: "+obj1.salary);

        Employee_Param_Constructor obj2=new Employee_Param_Constructor("Bhandari",30,30000);
        System.out.println("Name: "+obj2.name+" age: "+obj2.age+" salary: "+obj2.salary);

        Employee_Param_Constructor obj3=new Employee_Param_Constructor("Sachdeva",24,3004);
        System.out.println("Name: "+obj3.name+" age: "+obj3.age+" salary: "+obj3.salary);

        Employee_Param_Constructor obj4=new Employee_Param_Constructor("Mukesh",23,24000);
        System.out.println("Name: "+obj4.name+" age: "+obj4.age+" salary: "+obj4.salary);

        Employee_Param_Constructor obj5=new Employee_Param_Constructor("Sukhdev",35,40000);
        System.out.println("Name: "+obj5.name+" age: "+obj5.age+" salary: "+obj5.salary);
    }
}

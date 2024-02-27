package Constructor.Default_constructor;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Employee {

    int id = 1;
    String name = "Atif";
    double weight = 45.8;
    long mobile = 9084764647L;
    String bloodgroup ="AB";

    public static void main(String[] args) {
        Employee employee1 = new Employee();

        System.out.println("Employee Id       :   "+ employee1.id);
        System.out.println("Employee Name     :   "+employee1.name);
        System.out.println("Employee Blood group : "+employee1.bloodgroup);
        System.out.println("Employee Weight   :   "+employee1.weight);
        System.out.println("Employee Mobile   :   "+employee1.mobile);
    }
}

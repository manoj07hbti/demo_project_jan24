package function_or_method;

import demoClassAndObj.Employee;

public class Employee2 {

    public void name(){
        System.out.println("employee name is Rahul ");
    }
    public void Work(){
        System.out.println("He is manager ");
    }
    public void salary(){
        System.out.println("his Salary is 60000");
    }

    public static void main(String[] args) {
        Employee2 obj = new Employee2();
        obj.name();
        obj.Work();
    obj.salary();
    }

}

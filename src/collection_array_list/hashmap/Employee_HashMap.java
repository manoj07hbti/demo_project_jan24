package collection_array_list.hashmap;

import model.Employee;
import model.Engineer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Employee_HashMap {

    public static void main(String[] args) {

        LinkedHashMap<String , ArrayList<Employee>> Employee_HashMap = new LinkedHashMap<>();

        // create Employee Data

        Employee employee1 = new Employee("Ramesh", "Sales" , "Agra", 89658.45);

        Employee employee2 = new Employee("Rahul", "Credit" , "Agra", 56895.23);

        Employee employee3 = new Employee("Anoop", "RCU" , "Agra", 89657.56);

        Employee employee4 = new Employee("Amit", "Operations" , "Agra", 78459.81);

        Employee employee5 = new Employee("Rakesh", "Sales" , "Agra", 96584.24);

        Employee employee6 = new Employee("Akash", "Credit" , "Agra", 65894.78);

        // Create Employee List Of Designation Wise

        ArrayList<Employee> DesignationA = new ArrayList<>();
        DesignationA.add(employee1);
        DesignationA.add(employee2);
        DesignationA.add(employee3);

        ArrayList<Employee> DesignationB = new ArrayList<>();
        DesignationB.add(employee4);
        DesignationB.add(employee5);
        DesignationB.add(employee6);

        // I want to add Employee Designation Wise.
        Employee_HashMap.put("A" , DesignationA);
        Employee_HashMap.put("B" , DesignationB);

        for(String key : Employee_HashMap.keySet()){

            for(Employee employee: Employee_HashMap.get(key)) {

                if (key.equals("A")) {
                    System.out.println("Printing Employee Of Designation A:" +employee.getDesignation());
                } else {
                    System.out.println("Printing Employee Of Designation B:" + employee.getDesignation());
                }
            }
        }






    }





}

package model;

import java.util.Objects;

public class Employee {

    String Name;

    String Designation;

    String Location ;

    Double Salary ;

    // override hashcode and equals method


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Name.equals(employee.Name) && Designation.equals(employee.Designation) && Location.equals(employee.Location) && Salary.equals(employee.Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Designation, Location, Salary);
    }

    // param Construction;


    public Employee(String name, String designation, String location, Double salary) {
        Name = name;
        Designation = designation;
        Location = location;
        Salary = salary;
    }

    // getter and setter


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}

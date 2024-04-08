package model;

import java.util.Objects;

public class EmployeeD {

    String Name;

    int Salary;

    int Id;

    // override hashcode and equals method


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeD employee1 = (EmployeeD) o;
        return Salary == employee1.Salary && Id == employee1.Id && Name.equals(employee1.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Salary, Id);
    }

    // // param Construction;

    public EmployeeD(String name, int salary, int id) {
        Name = name;
        Salary = salary;
        Id = id;
    }


    // getter and setter


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}

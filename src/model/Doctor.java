package model;

import java.util.Objects;

public class Doctor {

    String name ;
    int age ;
    double salary;

    String dep;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Double.compare(salary, doctor.salary) == 0 && Objects.equals(name, doctor.name) && Objects.equals(dep, doctor.dep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, dep);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Doctor(String name, int age, double salary, String dep) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dep = dep;
    }
}

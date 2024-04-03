package model;

import java.util.Objects;

public class Student {

    String name;
    int age;
    String Last;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(Last, student.Last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Last);
    }



    public Student(String name, int age, String sec) {
        this.name = name;
        this.age = age;
        this.Last = sec;
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

    public String getLast() {
        return Last;
    }

    public void setLast(String last) {
        this.Last = last;
    }
}

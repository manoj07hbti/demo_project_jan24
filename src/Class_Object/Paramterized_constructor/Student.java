package Class_Object.Paramterized_constructor;

public class Student {
    String n;
    Double salary ;
    int clas;
    String sub;
    int marks;

    public Student(String n, Double salary, int clas, String sub, int marks) {
        this.n = n;
        this.salary = salary;
        this.clas = clas;
        this.sub = sub;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student obj1 = new Student("ram",6541.6451,12,"cs",56);
        System.out.println(obj1.n);
    }
}

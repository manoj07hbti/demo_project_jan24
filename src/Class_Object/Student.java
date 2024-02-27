package Class_Object;

public class Student {
/*
    Default Constructor:
    Employee class and 5 Object
    Doctor class and 5 Object
    Engineer class and 5 Object*/


    static String name= "pappu";
    Double salary = 256622.45;
    int clas= 5;
    String sub="maths";
    int marks=52;

    public static void main(String[] args) {
        Student obj =new Student();
        System.out.println(obj.name+obj.salary+obj.clas+obj.sub+obj.marks);
    }


}

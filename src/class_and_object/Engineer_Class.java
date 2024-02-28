package class_and_object;

public class Engineer_Class {
    String name="Ram";
    int age=25;
    String qualification="B.Tech";
    double salary=250000;

    public static void main(String[] args) {
        Engineer_Class obj1=new Engineer_Class();
        System.out.println("Engineer name: "+obj1.name+" age: "+obj1.age+" Qualification: "+obj1.qualification+" Salary: "+obj1.salary);

        Engineer_Class obj2=new Engineer_Class();
        System.out.println("Engineer name: "+obj2.name+" age: "+obj2.age+" Qualification: "+obj2.qualification+" Salary: "+obj2.salary);

        Engineer_Class obj3=new Engineer_Class();
        System.out.println("Engineer name: "+obj3.name+" age: "+obj3.age+" Qualification: "+obj3.qualification+" Salary: "+obj3.salary);

        Engineer_Class obj4=new Engineer_Class();
        System.out.println("Engineer name: "+obj4.name+" age: "+obj4.age+" Qualification: "+obj4.qualification+" Salary: "+obj4.salary);

        Engineer_Class obj5=new Engineer_Class();
        System.out.println("Engineer name: "+obj5.name+" age: "+obj5.age+" Qualification: "+obj5.qualification+" Salary: "+obj5.salary);

    }
}

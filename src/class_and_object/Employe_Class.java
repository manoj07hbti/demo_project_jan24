package class_and_object;

public class Employe_Class {
    String name="Rudra pratap singh";
    int age=22;
    String qualification="B.Tech";
    double salary=100000;

    public static void main(String[] args) {
        //ClassName objName= new ClassName();
        Employe_Class obj1= new Employe_Class();
        System.out.println("Employee name "+obj1.name +" age "+obj1.age + " Qualification " + obj1.qualification+" Salary " + obj1.salary );

        Employe_Class obj2= new Employe_Class();
        System.out.println("Employee name "+obj2.name +" age "+obj2.age + " Qualification " + obj2.qualification+" Salary " + obj2.salary );

        Employe_Class obj3= new Employe_Class();
        System.out.println("Employee name "+obj3.name +" age "+obj3.age + " Qualification " + obj3.qualification+" Salary " + obj3.salary );

        Employe_Class obj4= new Employe_Class();
        System.out.println("Employee name "+obj4.name +" age "+obj4.age + " Qualification " + obj4.qualification+" Salary " + obj4.salary );

        Employe_Class obj5= new Employe_Class();
        System.out.println("Employee name "+obj5.name +" age "+obj5.age + " Qualification " + obj5.qualification+" Salary " + obj5.salary );


    }
}

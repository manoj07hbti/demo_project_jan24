package class_and_object;

public class Engineer_Param_Constructor {
    String name;
    int age;
    String qualification;

    public Engineer_Param_Constructor(String name, int age, String qualification) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
    }

    public static void main(String[] args) {
        Engineer_Param_Constructor obj1=new Engineer_Param_Constructor("Ram",25,"B,tech");
        System.out.println("Engineer name: "+obj1.name+" age: "+obj1.age+" Qualification: "+obj1.qualification);

        Engineer_Param_Constructor obj2=new Engineer_Param_Constructor("pramod",22,"B.tech");
        System.out.println("Engineer name: "+obj2.name+" age: "+obj2.age+" Qualification: "+obj2.qualification);

        Engineer_Param_Constructor obj3=new Engineer_Param_Constructor("raju",33,"b.tech");
        System.out.println("Engineer name: "+obj3.name+" age: "+obj3.age+" Qualification: "+obj3.qualification);


}
}

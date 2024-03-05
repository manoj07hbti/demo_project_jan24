package Class_Object.Paramterized_constructor;

public class Doc {

    String Dr;
    int age;
    double salary;
    String sp ;

    public Doc(String dr, int age, double salary, String sp) {
        Dr = dr;
        this.age = age;
        this.salary = salary;
        this.sp = sp;
    }

    public static void main(String[] args) {
        Doc obj1 = new Doc("Ram",45,4855.5481,"heart");
        System.out.println(obj1.Dr+" \n"+obj1.age+"\n"+obj1.salary+"\n"+obj1.sp);
    }


}

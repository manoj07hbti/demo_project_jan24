package Class_Object;

public class Employee {

   /* Default Constructor:
    Employee class and 5 Object
    Doctor class and 5 Object
    Engineer class and 5 Object*/


    String name="ramji";
    int salary = 65212;
    String position = "SE2";
    int exp = 2;

    public static void main(String[] args) {
        Employee em = new Employee();
        System.out.println(em.name+"\n"+em.exp+"\n"+em.position+"\n"+em.salary);
    }
}

package function_or_method;

public class Employee {

    String Name;
    int empId;
    String Branch;

    //functions or methods

    //works
    //leave
    //eat

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void works(){
        System.out.println("This is works functions");
    }
    public void leave(){
        System.out.println("This is leave functions");
    }

    public void eat(){
        System.out.println("This is eat functions");
    }

    public static void main(String[] args) {

        /* step 1: create Object
        step 2: objName.MethodName();*/

        Employee employee = new Employee();
        employee.works();
        employee.leave();
        employee.eat();


    }


}

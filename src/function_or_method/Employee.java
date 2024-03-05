package function_or_method;

public class Employee {

  /*  Create Employee class and create methods
            Create Doctor class and create methods
            create Engineeer class and create methods*/
    String name;
    int salary;
    int age ;
    String work;

    // method syntax
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}


    public void empname(){
        System.out.println("this is emp name");

    }

    public void empsalary(){
        System.out.println("this is salary");

    }

    public void empage (){

        System.out.println("this is emp age");
    }


    public static void main(String[] args) {

           /* step 1: create Object
        step 2: objName.MethodName();*/

        Employee Data =new Employee();
        Data.empname();
        Data.empsalary();
    }




}

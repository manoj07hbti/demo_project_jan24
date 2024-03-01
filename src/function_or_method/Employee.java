package function_or_method;

public class Employee {
    // data member
     String name;
     String location;
     int salary;

     //function and method
            //work
            //Rest
            //leave

    //Syntax : access _specifier   return_type   method_name(Parameter){CODE}

    public void work(){
        System.out.println("This is Work Method");

    }
    public void Rest(){
        System.out.println("This is Rest Method");

    }
    public void leave(){
        System.out.println("Printing is leave method");
    }

    public static void main(String[] args) {

        // step 1 create object
        // step two objName.method();

        Employee object = new Employee();
        object.work();
        object.Rest();
        object.leave();




    }





}

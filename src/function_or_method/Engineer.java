package function_or_method;

public class Engineer {
    // date member

    String name;
    String post;
    String location;
    int salary;

    // function and method
            //design
            //work
            //salary
    //Syntax : access _specifier   return_type   method_name(Parameter){CODE}

    public void design(){
        System.out.println("This is design method");

    }
    public void work(){
        System.out.println("This is work method");

    }

    public void salary(){
        System.out.println("This is salary method");


    }

    public static void main(String[] args) {

        // step 1 create object
        // step two objName.method();

        Engineer object = new Engineer();

        object.design();
        object.work();
        object.salary();


    }

}

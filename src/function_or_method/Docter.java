package function_or_method;

public class Docter {
            // data member

    String name;
    String specialist;
    String location;
    int fees;
    // function and method....
        //operation
        //medicine
        //treatment

    //Syntax : access _specifier   return_type   method_name(Parameter){CODE}

    public void operation(){
        System.out.println("This is operation method");

    }public void medicine(){
        System.out.println("This is medicine method");
    }

    public void treatment(){
        System.out.println("This is treatment method");

    }

    public static void main(String[] args) {


        Docter obj1 = new Docter();
        obj1.operation();
        obj1.medicine();
        obj1.treatment();
    }


}

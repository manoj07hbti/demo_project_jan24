package function_or_method;

public class Book {

    //data member

    String name;
    int price;
    String subject;

    // function or method

    //Read
    //Write
    //Sale

    //Syntax : access_specifier  return_type  method_name( parameter){CODE...}

    public void  demoread(){

        System.out.println("This is demo Read method ");
    }


    public void demoWrite(){
        System.out.println("This is demo Write method ");
    }


     public void demoSale(){
         System.out.println("This is demo Sale method ");
     }

    public static void main(String[] args) {

        // step 1 create object
        // step two objName.method();

         Book obj = new Book();
         obj.demoread();    //calling method one
         obj.demoWrite();   //calling method two
         obj.demoSale();    //calling method three
    }
}



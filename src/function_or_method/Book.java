package function_or_method;

public class Book {
    //data member
    String name;
    int page;
    String writerName;

    //functions or methods

    // read
    //write
    // sale

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void demoRead(){

        System.out.println("This is demo Read method");
    }

    public void demoWrite(){
        System.out.println("This is demo Write method...");
    }

    public void DemoSale(){
        System.out.println("This is demo Sale method...");
    }

    public static void main(String[] args) {
       /* step 1: create Object
        step 2: objName.MethodName();*/
        Book obj= new Book(); // STEP 1
        obj.demoRead();// STEP 2

        obj.demoWrite(); // we are calling another method
        obj.DemoSale();// we are calling third method

    }

}

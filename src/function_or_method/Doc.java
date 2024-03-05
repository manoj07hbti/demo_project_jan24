package function_or_method;

public class Doc {

    String name ;
    int age;
    int salary ;


    //method

    public void name (){

        System.out.println("This is name");
    }

    public void age (){

        System.out.println("This is age");
    }


    public void salary  (){

        System.out.println("This is salary");
    }


    public static void main(String[] args) {
        Doc Data = new Doc();

          Data.name();
          Data.salary();
          Data.age();
    }





}

package variables;

public class VariableDay1 {

    public static void main(String[] args) {

        //1. declare a variable SYNTAX : Datatype varName;
         String name; // we have declared a variable of String datatype with name name

        //2. how to assign data into variable  varName=value;
          name="Java"; // we need to use " " with String data
      // 3.how to print a variable  System.out.println("Message : " +varName);
        System.out.println("Printing variable name: "+name);

         int age; // we have declared a variable of int datatype with name age
         age=23;
        System.out.println("Printing age :"+age);

        double salary; //we have declared a variable of double datatype with name salary
        salary=25634.56;
        System.out.println("Printing salary : "+salary);
  //TODO you can not create duplicate variables in Java ...

       String cityName; // declare variable with name cityName
       cityName="Agra"; // we have assigned Agra value to cityName variable

        System.out.println("Printing city name: "+cityName);




    }
}

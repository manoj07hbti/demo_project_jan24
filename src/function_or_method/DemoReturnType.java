package function_or_method;

public class DemoReturnType {

    // Write a method to give welcome message
    public String welcome(String name) {

        String msg = "Welcome to return type of method : " + name;

        return msg;
    }

    // write a method to create cube of given number

    public int makeCube(int number) {

        int cube = number * number * number;

        return cube;

    }

    // write  a code which can tell eligible voter in Agra

    public String voting(int age, String city) {

        if (age >= 18 && city.equals("Agra")) {

            return "Person is eligible for voting in Agra...";
        } else {
            return "Person is NOT eligible for voting in Agra...";
        }

    }

    public static void main(String[] args) {
        DemoReturnType obj = new DemoReturnType();
        String output = obj.welcome("raj");

        System.out.println(output);

        int cube = obj.makeCube(4);
        System.out.println("Cube of given number is :" + cube);

        String vote = obj.voting(17, "Agra");

        System.out.println(vote);

    }

}

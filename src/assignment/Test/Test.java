package assignment.Test;

public class Test {
    public static void main(String[] args) {

        //todo write a code to swap two numbers a and b without using any third variable.
        //Wrtie a code to check % of Student

        int a = 50;

        if (a >= 33 && a <= 60) {
            System.out.println("Student gets 2nd division");
        }

        int b = 65;

        if (b >= 60 && b <= 75) {
            System.out.println("Student gets 1st division");
        }

        int c = 95;

        if (c >= 75) {
            System.out.println("Student gets Gold");
        }


        //todo Write a code to check Age group

        int x = 15;

        if (x > 0 && x <= 18) {
            System.out.println("Child");
        }

        int y = 20;

        if (y >= 18 && y <= 40) {
            System.out.println("Young");
        }

        int z = 61;

        if (z >= 60) {
            System.out.println("Old age");
        }


        //todo Write a code to identify  number which is not divisible by 3.
        int g = 40;
        if (g % 3 == 0) {
            System.out.println("Num is divisible by 3");
        } else {
            System.out.println("num is not divisible by 3");
        }


        //todo Write a code to check eligible voter in Pune
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }

        // todo Write a code to find percentage of given number example: 5% of 500

        int n = 500;
        int p = 5;
        int per = n * p / 100;
        System.out.println(per);

        //todo write a code to check if any given number is  even or odd number
        int numb = 51;
        if (numb % 2 == 0) {
            System.out.println("this numb is even");
        } else System.out.println("this numb is odd");


        //todo write a code to check person nationality , if nationality is India then check state should be
        // Maharashtra then print both Nationality and state and if person is from different nation it should print
        // that as well in else par


        String nation = "India";
        String state = "maharastra";

        if (nation == "India") {
            if (state == "maharastra") {
                System.out.println("Person is indian and from maharastra");
            }
        } else {
            System.out.println("not indian " + state);
        }


    }
}

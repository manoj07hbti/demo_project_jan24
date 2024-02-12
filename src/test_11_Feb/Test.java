package test_11_Feb;

public class Test {
    public static void main(String[] args) {


        //Q1- write a code to check eligible voter in pune

        int age = 22;
        String city = "Pune";
        if (age >= 18 && city == "Pune") {
            System.out.println("Candidate is eligible for voting ");
        } else {
            System.out.println("candidate is not eligible for voting ");
        }
        //Q2- percentage of given number

        int num = 500;
        double result = num * 5 / 100;
        System.out.println("5% of 500 is : " + result);

        //Q3- checking for even or odd
        int j = 20;
        if (j % 2 == 0) {
            System.out.println("number is even ");
        } else {
            System.out.println("number is odd ");
        }

        //Q4- checking nationality
        String nationality = "India";
        String State = "Maharashtra";
        if (nationality == "India") {
            if (State == "Maharashtra") {
                System.out.println("person's nationality : " + nationality + ",and State is :  " + State);
            }
        } else {
            System.out.println("person is from diffrent nation ");
        }

        //Q6- code for checking position of student
        int per = 65;

        if (per >= 33 || per <= 60) {
            System.out.println("Second division");
        }
        if (per >= 60 || per <= 75) {
            System.out.println("first division");
        }
       if (per > 75) {
            System.out.println("gold medalist");
        }

        //Q7-code for checking age group
        int Age = 36;
        if (Age > 0 || Age < 18) {
            System.out.println("this age is child Age");
        }
        if (Age >= 18 || Age <= 40) {
            System.out.println("this age is young age ");
        }
        if (Age >= 60) {
            System.out.println("this age is Old age");
        }

//Q8-code for numbers which is not divisible by 3
        int number=20;
        if(number%3!=0) {
            System.out.println("number is not divisible by 3 ");
        }else{
            System.out.println("number is divisible by 3");
        }

    }
}

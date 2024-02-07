package assignment;

public class If_ElseConditions {
    public static void main(String[] args) {

        int marks = 60;
        if (marks >= 60) {

            System.out.println("You got first division = " + marks);


            int mark = 5;
            if (mark <= 33) {
                System.out.println("You Failed");
            }


            int price = 5000;
            if (price >= 5000) {
                System.out.println("costly product");
            }

            int sales = 4535;
            if (sales <= 5000) {
                System.out.println("average price product");
            }


            String nation = "India";
            if (nation == "India") {
                System.out.println("You are indian");
            }

            String Notnation = "africa";
            if (Notnation != "India") {
                System.out.println("You not indian");
            }

            //checking even or odd
            int t = 60;
            if (t % 2 == 0) {
                System.out.println("this is even number " + t);
            }

            int y = 61;
            if (y % 2 != 0) {
                System.out.println("this is odd number " + y);
            }


            int o = 50;
            if (o >= 60) {
                System.out.println("You got 1st division");
            } else {
                System.out.println("you failed");
            }


            int p = 300;
            if (p >= 33) {
                System.out.println("Passed");
            } else {
                System.out.println("Not Passed");
            }

            int l = 500;
            if (l >= 5000) {
                System.out.println("Costly");
            } else {
                System.out.println("Not costly");
            }

            String country = "USA";
            if (country.equals("india")) {
                System.out.println("You are indian");
            } else {
                System.out.println("Not indian");
            }


        }

    }
}

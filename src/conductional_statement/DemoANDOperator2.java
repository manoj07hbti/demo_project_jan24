package conductional_statement;

public class DemoANDOperator2 {
    public static void main(String[] args) {

        //if(condition1 && condition2)
        // 1- AND Operator 1.   TRUE & TRUE = TRUE     1*1= 1

        //// TODO write a code which tell which student got 60% marks in science stream?

        int marks = 60;
        String section = "science";
        if (marks>=60 && section=="science") {
            System.out.println("Student got 60 marks in science stream");
        } else {
            System.out.println("Either Student got less than 60 marks in science stream");
        }


        // 2.   TRUE & FALSE= FALSE    1*0= 0
        int marks2 = 60;
        String section2 = "English";
        if (marks>=60 && section=="English") {
            System.out.println("Student got 60 marks in science stream");
        } else {
            System.out.println("Either Student got less than 60 marks in science stream");
        }


        //3.   FALSE & TRUE= FALSE    0*1= 0
        int marks3 = 50;
        String section3 = "english";
        if (marks>=60 && section3=="science") {
            System.out.println("Student got 60 marks in science stream");
        } else {
            System.out.println("Either Student got less than 50 marks in english stream");
        }


        //4.   FALSE & FALSE= FALSE   0*0= 0
        int marks4 = -50;
        String section4 = "english";
        if (marks>=50 && section=="english") {
            System.out.println("Student got 60 marks in science stream");
        } else {
            System.out.println("Either Student got less than 50 marks in Hindi stream");
        }
    }
}


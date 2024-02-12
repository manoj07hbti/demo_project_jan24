package my_conditional_statement;

public class AndfOperator {
    public static void main(String[] args) {
        int marks = 60;
        String section = "science";
        if (marks >= 60 && section == "science") {
            System.out.println("Student got 60 marks in science stream");
        } else {
            System.out.println("Either Student got less than 60 marks in science stream");
        }
        int marks1 = 60;
        String section1 = "english";
        if (marks1 >= 60 && section1 == "hindi") {
            System.out.println("Student got 60 marks in science stream");
        } else {
            System.out.println("Either Student got less than 60 marks in science stream");
        }
        int marks2 = 45;
        String section2 = "english";
        if (marks2 >= 60 && section2 == "science") {
            System.out.println("Student got 65 marks in science stream");
        } else {
            System.out.println("Either Student got less than 45 marks in english stream");
        }
        int marks3 = -40;
        String section3 = "english";
        if (marks3 >= 40 && section3 == "english") {
            System.out.println("Student got 60 marks in science stream");
        } else {
            System.out.println("Either Student got less than 45 marks in Hindi stream");
        }

        int age = 17;
        String State = "UP";
        if (age >= 18 && State == "UP"){
            System.out.println("Voter age is 18 and eligible for vote in UP");
        } else{
            System.out.println("Voter age is Not 18 and Not eligible for vote in UP");
        }

        int age1 = 18;
        String State1 = "UP";
        if (age1 >= 18 && State1 == "UP"){
            System.out.println("Voter age is 20 and eligible for vote in UP");
        } else{
            System.out.println("Voter age is Not 18 and Not eligible for vote in UP");
        }
    }


}


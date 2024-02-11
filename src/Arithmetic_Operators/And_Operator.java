package Arithmetic_Operators;

public class And_Operator {
    public static void main(String[] args) {
  /*      marks>=60 && section ==SCIENCE

        write a code which tell which student got 60% marks in scince stream?
                with all 4 scenario

                TRUE & TRUE = TRUE     1*1= 1
                TRUE & FALSE= FALSE    1*0= 0
                FALSE & TRUE= FALSE    0*1= 0
                FALSE & FALSE= FALSE   0*0= 0


            */

        int marks = 60 ;
        String section = "science";

        if ( marks > 60 && section == "science" ){  //true & true = true
            System.out.println("Student got 60% in science");
        }else {
            System.out.println("Student did not get 60% in science");
        }

        String section1 = "science"; int marks1 = 60;
        if ( section1 == "science" && marks1 <60 ){     //true & false = false
            System.out.println("Student got Less then 60% in science");
        }else {
            System.out.println("Student got greater then 60% marks in science");
        }

        String section2 = "science"; int marks2 = 60; //false & true = false
        if (section2 == "English" && marks2 == 60 ){
            System.out.println("Student got 60% marks in science subject");
        }else {
            System.out.println("Student got 60% marks in other subject");
        }

        String section3 = "social"; int marks3 = 60;  //false & false = false
        if ( section3 == "science" && marks3 == 55 ){
            System.out.println("Student got 60% marks in science");
        }else {
            System.out.println("Student got 55% in science");
        }
    }
}

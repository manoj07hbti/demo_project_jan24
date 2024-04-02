package Test.Test_11_2_2024;

public class Student_Percentage_check {
    public static void main(String[] args) {
        int percentage = 90;

        if (percentage >= 75 ){
            System.out.println("Gold medalist");
        } else if (percentage >= 60 && percentage <= 75) {
            System.out.println("First Devision");
        } else if (percentage >= 33 && percentage <= 60 ) {
            System.out.println("Second Devision");
        }else {
            System.out.println("Fail");
        }
    }
}

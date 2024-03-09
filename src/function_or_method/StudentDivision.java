package function_or_method;

public class StudentDivision {
    public void StudentDivision() {
        int marks = 81;

        String subject1 = "Hindi";
        String subject2 = "English";
        String subject3 = "Math";
        String subject4 = "Science";
        String subject5 = "Computer";
        String subject6 = "Physics";


        if (marks >= 60 && subject1 == "Hindi") {
            System.out.println("If student getting 60% marks in all subject got First Division");
        } else {
            System.out.println("Student getting less than 60% marks get second Division");

        }

    }

    public static void main(String[] args) {
        StudentDivision object = new StudentDivision();
        object. StudentDivision();
    }
}

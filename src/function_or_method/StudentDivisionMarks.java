package function_or_method;

public class StudentDivisionMarks {
    public void StudentDivisionMarks() {
        int marks = 81;

        String subject1 = "Hindi";
        String subject2 = "English";
        String subject3 = "Math";
        String subject4 = "Science";
        String subject5 = "Computer";
        String subject6 = "Physics";


        if (marks >= 60 && subject1 == "Hindi") {
            System.out.println("If student getting 60% marks in all subject got First Division");
        }

    }

    public void StudentDivisionMark() {
        int TotalNumber = 360;
        int TotalSub = 6;
        double per = TotalNumber / 6;


        System.out.println("Total :" + TotalNumber);
        System.out.println("Percentage :" + per);


        if (per >= 60)
        {
            System.out.println("First Division.");
        }
        else if     (per >= 45 && per <= 59.99) {
            System.out.println("Second Division.");
        }
        else if (per >= 33 && per <= 44.99) {
            System.out.println("Third  Division.");
        }
        else {
            System.out.println("Student got less than 60% marks got Second Division");
            System.out.println("Fail.");

        }

    }

    public static void main(String[] args) {
        StudentDivisionMarks object = new StudentDivisionMarks();
        object.StudentDivisionMarks();
    }
}



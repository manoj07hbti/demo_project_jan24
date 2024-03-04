package function_or_method;

public class StudentDivision {

    public void StudentDivision(){
        int marks=65;
        String Subject1= "English";
        String Subject2= "Hindi";
        String Subject3= "Math";
        String Subject4= "Science";
        String Subject5= "SSC";
        String Subject6= "Computer";

        if (marks >= 60 && Subject1 == "English") {
            System.out.println("Student got 60% marks in all Subject got First Division");
        } else {
            System.out.println("Student got less than 60% marks got Second Division");
        }

    }

    public static void main(String[] args) {
        StudentDivision obj = new StudentDivision();
        obj.StudentDivision();



    }

}

package conditional_statements.If_else;

public class Grade {
    public static void main(String[] args) {
        int marks = 10;

        if (marks >= 60 ) {
            System.out.println(" First Devision ");
        }else if (marks >= 45 ) {
            System.out.println(" Second Devision ");
        }else if (marks >= 35 ) {
            System.out.println(" Third Devisionn ");
        }else {
            System.out.println("Not Cleared Exam");
        }
    }
}

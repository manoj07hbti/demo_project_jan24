package function_or_method;

public class StudentDivision {

    public void StudentDivision() {
        int TotalNumber = 360  ;
        int TotalSub = 6;
        double per = (double)TotalNumber/6;
        System.out.println("Total :" + TotalNumber);
        System.out.println("Percentage :" + per);
        if (per >= 60) {
            System.out.println("First Division.");
        } else if (per >= 45 && per <= 59.99) {
            System.out.println("Second Division.");
        } else if (per >= 33 && per <= 44.99) {
            System.out.println("Third  Division.");
        } else {
            System.out.println("Fail.");
        }
    }
        public static void main (String[]args){
            StudentDivision obj = new StudentDivision();
            obj.StudentDivision();
        }
    }

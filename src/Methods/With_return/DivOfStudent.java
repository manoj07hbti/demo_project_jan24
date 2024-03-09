package Methods.With_return;

public class DivOfStudent {
    public String CkeckDivision(double total_marks){
        double percentage = total_marks/6000 *100;
        System.out.println("Student got "+percentage+"%");
        if (percentage <33)
         return "Student not qualified";
        else if (percentage >33 && percentage<45) {
            return "Student qualified with C- grade";
        } else if (percentage >45 && percentage <55) {
            return "Student qualified with B-grade";
        } else if (percentage >55 && percentage <65 ) {
            return "Student qualified with A-grade";
        } else if (percentage >65 && percentage <75) {
            return "Student qualified with A+-grade";
        }else {
            return "Student qualified with O-grade(outstanding)";
        }
    }

    public static void main(String[] args) {
        DivOfStudent div = new DivOfStudent();
        String st1 = div.CkeckDivision(5000);
        System.out.println(st1);
    }
}

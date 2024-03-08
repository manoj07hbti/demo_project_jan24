package function_or_method;

public class CheckDivisionReturnType {
    public String checkDivision(double totalMarks){
        double total=(double)totalMarks/600*100;
        if (total >=60) {
            return ("First Division");
        } else if (total >= 45 && total <= 59.99) {
            return ("Second Division");
        } else if (total >= 33 && total <= 44.99) {
            return ("Third  Division");
        } else if (total < 33);
            return ("Fail");
        }

    public static void main(String[] args) {
        CheckDivisionReturnType obj =new CheckDivisionReturnType();
        String checkDivision = obj.checkDivision(197);
        System.out.println(checkDivision);
    }

    }




package conductional_statement_ifandelse;public class DemoOROperator {

    public static void main(String[] args) {
        int marks = 50;
        String section = "CS";

        //1.    TRUE    || TRUE=TRUE
        if (marks >= 33 || section == "CS") {
            System.out.println("TRUE    || TRUE=TRUE");
        } else {
            System.out.println("ELSE conduction..");

        }


        //2. TRUE || FALSE = TRUE
        section = "IT";
        if (marks >= 33 || section == "CS") {
            System.out.println("TRUE  FALSE || TRUE");
        } else {
            System.out.println("ELSE Conduction");
        }


        //3. FALSE || TRUE=TRUE
        marks = 32;
        section = "CS";
        if (marks >= 33 || section == "CS") {
            System.out.println("TRUE  FALSE || TRUE");
        } else {
            System.out.println("ELSE Conduction");
        }


        //4.FALSE || FALSE=FALSE
        marks = 32;
        section = "IT";
        if (marks >= 33 || section == "CS") {
            System.out.println("inside IF");
        } else {
            System.out.println("ELSE Conduction..FALSE || FALSE=FALSE.");

        }

    }
}
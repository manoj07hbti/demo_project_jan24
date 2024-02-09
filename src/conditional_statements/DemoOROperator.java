package conditional_statements;

public class DemoOROperator {

    public static void main(String[] args) {

        int marks=50;
        String section ="CS";

        // 1.   TRUE  || TRUE = TRUE

        if(marks>=33 || section=="CS"){

            System.out.println("TRUE  || TRUE = TRUE");
        }else {
            System.out.println("ELSE Condition..");
        }

       // 2.   TRUE  || FALSE= TRUE
          section="IT";
        if(marks>=33 || section=="CS"){

            System.out.println("TRUE  || FALSE= TRUE");
        }else {
            System.out.println("ELSE Condition..");
        }

        //3.   FALSE || TRUE=  TRUE
        marks=32; section="CS";
        if(marks>=33 || section=="CS"){

            System.out.println("FALSE || TRUE=  TRUE");
        }else {
            System.out.println("ELSE Condition..");
        }

        //4.   FALSE || FALSE= FALSE
        marks=32; section="IT";
        if(marks>=33 || section=="CS"){

            System.out.println("Inside IF");
        }else {
            System.out.println("ELSE Condition. FALSE || FALSE= FALSE.");
        }

    }
}

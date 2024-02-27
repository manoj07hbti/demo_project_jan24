package loop;

public class BreakLoop {
    public static void main(String[] args) {

        // TODO Month 1 : JANUARY , 2 FEBRUARY 3 ....12
        //  in case of Month is 13 then break from loop

        String monthName[] = {"JAN", "FEB", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUG", "SEPT", "OCT", "NOV", "DEC"};

           for (int i = 1; i <= 15; i++) {
            if (i == 13) {

                System.out.println("Useing break from loop");
                break;
            }
                  System.out.println("Printing monthName :" + monthName[i - 1]);
        }


        // TODO Find a  fail  student :
        //   Print  Student marks in a class and if  find any  with less than 33 marks
        //   then you need break.

               int marks[] = {57, 61, 33, 90, 62, 37, 39, 47, 91, 32};
                for (int i = 1; i < marks.length; i++) {

            if (marks[i] < 33) {

                System.out.println("Student got marks less than 33 than failed :" + marks[i]);
                break;
            }
        }
    }
}
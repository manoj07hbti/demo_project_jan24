package my_loop;

public class BreakInLoop {
    public static void main(String[] args) {
         // Find a class where at least one student got failed :
        //   Print marks of Students in a class and if you find any students with less than 33 marks
        //   then you need break.
        int marks[] = {40, 50, 60, 45, 65, 38, 46, 78, 33, 78, 54, 66, 88};
        for (int var : marks) {
            System.out.println("Printing in advance loop :" + var);
            if (var == 33) {
                break;
            }
        }
        String months[] = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "number", "december"};
        for (String var : months) {
            System.out.println("Printing in advance loop :" + var);
            if (var == "december") {
                break;
            }
        }
        // Find a class where at least one student got failed :
        //   Print marks of Students in a class and if you find any students with less than 33 marks
        //   then you need break.

    }
    }




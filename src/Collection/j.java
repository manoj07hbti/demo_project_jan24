package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class j {

    // Method to create an ArrayList of Integers from user input
    public ArrayList<Integer> createIntList() {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "y";

        while (input.equals("y")) {
            System.out.println("Enter mark:");
            int mark = scan.nextInt();
            marks.add(mark);

            System.out.println("Do you want to continue? (y/n)");
            input = scan.next();
        }

        return marks;
    }

    // Method to find marks between 33 and 44
    public ArrayList<Integer> findMarksInRange(ArrayList<Integer> marks) {
        ArrayList<Integer> marksInRange = new ArrayList<>();

        for (Integer mark : marks) {
            if (mark >= 33 && mark <= 44) {
                marksInRange.add(mark);
            }
        }

        return marksInRange;
    }

    public static void main(String[] args) {
        j obj = new j();
        ArrayList<Integer> marks = obj.createIntList();

        System.out.println("All marks:");
        for (Integer var : marks) {
            System.out.println("Marks is : " + var);
        }

        ArrayList<Integer> marksInRange = obj.findMarksInRange(marks);
        System.out.println("\nMarks between 33 and 44:");
        for (Integer mark : marksInRange) {
            System.out.println("Mark is : " + mark);
        }
    }
}

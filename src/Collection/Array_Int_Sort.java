package Collection;

import java.util.ArrayList;
import java.util.Scanner;


//TODO find out all the marks between 33 to 44
public class Array_Int_Sort {


    public ArrayList<Integer> marks() {
        ArrayList<Integer> marks = new ArrayList<>();

        String input = "y";

        Scanner scan = new Scanner(System.in);
        marks.add(35);
        marks.add(49);
        marks.add(40);
        marks.add(72);


        while (input.equals("y")) {

            System.out.println("Enter student marks:");
            marks.add(scan.nextInt());
            System.out.println("y to add");
            input = scan.next();
        }

        return marks;


    }

    public ArrayList<Integer> sort(ArrayList<Integer> marks) {
        ArrayList<Integer> InRange = new ArrayList<>();

        for (Integer Ann : marks) {
            if (Ann >= 33 && Ann <= 44)
                InRange.add(Ann);
        }


        return InRange;
    }


    public static void main(String[] args) {
        Array_Int_Sort obj = new Array_Int_Sort();

        ArrayList<Integer> marks = obj.marks();
        for (Integer var : marks)
            System.out.println(var);


        System.out.println("***********************");


        ArrayList<Integer> InRange = obj.sort(marks);
        for (Integer d : InRange) {
            System.out.println(d);
        }


    }

}
package Collection.ArrayList;

import java.util.ArrayList;

public class Marks {
    private void FindMarks(){
        ArrayList<Double> marks =new ArrayList<>();
        marks.add(23.5);
        marks.add(34.3);
        marks.add(43.9);
        marks.add(54.5);
        marks.add(34.5);
        marks.add(78.7);
        marks.add(89.8);
        marks.add(67.7);
        marks.add(90.8);
        marks.add(12.4);
        marks.add(66.6);
        for (double var:marks){
            if (var>33 && var <44){
                System.out.println(var);
            }
        }
    }

    public static void main(String[] args) {
        Marks marks=new Marks();
        marks.FindMarks();
    }
}

package Arrays;

public class Student_marks {
    public static void main(String[] args) {

        double[] marks = {78.5, 45.7, 98, 44.7, 43.6, 23.9, 66.5,87.8};

           double m = 23.9;
        for (int i =1;i< marks.length;i++){
            if (marks[i] <= m){
                System.out.println("Student got failed with "+marks[i]+" marks at "+i+"th position");
                break;
            }
            System.out.println(marks[i]);
        }
    }
}

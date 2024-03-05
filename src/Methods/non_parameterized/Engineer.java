package Methods.non_parameterized;

public class Engineer {

    public static void engineer() {
        String Hno = "17265-M-29";
        String name = "Akhlad Khan";
        String Branch = "Mechanical Engineering";
        String semester = "iii";
        String Batch = "2017-20";

        System.out.println("\n====Engineer Detail=====");
         System.out.println("Name           : "+name+"\nHall ticket No.: "+Hno+"\nBranch         : "+Branch+
                "\nSemester       : "+ semester+"\nBatch          : "+ Batch);
    }

    public static void main(String[] args) {
        engineer();
    }
}

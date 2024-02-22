package Loop;

public class Break {
    public static void main(String[] args) {
        /*Month 1 : January , 2 Feb 3 ....12
        in case of Month is 13 then break from loop
        break :*/

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };


        for (int j = 1; j <= 20; j++) {
            if (j == 13) {
                System.out.println("break");
                break;
            }
            System.out.println(monthNames[j - 1]);
        }


        /*Find a class where at least one student got failed :
        Print marks of Students in a class and if you find any students with less than 33 marks
        then you need break.*/

        int[] marks = {50, 60, 54, 35, 33, 32, 98, 74, 65, 45, 85};

        for (int l = 1; l < marks.length; l++) {
            if (marks[l] < 33) {
                System.out.println("found failed with " + marks[l] + " marks at index = " + l);
                break;
            }

            System.out.println(marks[l - 1]);
        }








    }
}

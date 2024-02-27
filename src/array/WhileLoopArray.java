package array;

public class WhileLoopArray {
    public static void main(String[] args) {

        //Datatype varName [] = {value1, value2,value3.......value N}

        String countryName[] = {"JAPAN", "AMERICA", "KORIA", "DUBAI"};

        System.out.println("Printing array country name :" + countryName[0]);

        // TODO Write a Code Array country name using while loop

        int i = 0;
        while (i < countryName.length) {
            System.out.println("Printing array country name using while loop :" + countryName[i]);
            i++;
        }

        // TODO Write a Code Array Distance using for While loop

        int Distance[] = {5, 10, 15, 20, 25};
        int j = 0;
        while (j < Distance.length) {
            System.out.println("Printing array Distance using while loop :" + Distance[j]);
            j++;

        }

        // TODO Write a Code Array Height using for loop

        double height[] = {4.1, 5.1, 6.1, 7.1};
        int k = 0;
        while (k < height.length) {
            System.out.println("Printing array height using while loop :" + height[k]);
        }
    }
}

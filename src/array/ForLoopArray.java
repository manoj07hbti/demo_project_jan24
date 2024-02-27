package array;

public class ForLoopArray {
    public static void main(String[] args) {

        //Datatype varName [] = {value1, value2,value3.......value N};
        //TODO Write a Code Array country name

        String countryName[] = {"JAPAN", "AMERICA", "KORIA", "DUBAI"};

        System.out.println("Printing array country name :" + countryName[0]);
        System.out.println("Printing array country name :" + countryName[3]);

        // TODO Write a Code Array country name using for loop

        for (int i = 0; i < countryName.length; i++) {

            System.out.println("Printing country name using for loop : " + countryName[i]);
        }

        // TODO Write a Code Array Distance using for loop

        int Distance[] = {5, 10, 15, 20, 25};
        for (int i = 0; i < Distance.length; i++) {
            System.out.println("Printing Distance using for loop : " + Distance[i]);
        }

        // TODO Write a Code Array Height using for loop

        double height[] = {4.1, 5.1, 6.1, 7.1};
        for (int i = 0; i < height.length; i++) {
            System.out.println("Printing Height using for loop : " + height[i]);
        }
    }

}
package array;

public class AdvanceLoopArray {
    public static void main(String[] args) {

        //Datatype varName [] = {value1, value2,value3.......value N}


        String countryName[] = {"JAPAN", "AMERICA", "KORIA", "DUBAI"};
        System.out.println("Printing array country name :" + countryName[0]);







        // TODO Write a Code Array country name using Advance loop

        for (String country : countryName) {
            System.out.println("Printing array country name using Advance Loop :" + country);
        }









        // TODO Write a Code Array Distance using Advance loop

        int Distance[] = {5, 10, 15, 20, 25};
        for (int Dis : Distance) {
            System.out.println("Printing array Distance using Advance Loop :" + Dis);
        }




        // TODO Write a Code Array Height using Do While loop

        double height[] = {4.1, 5.1, 6.1, 7.1};
        for (double h : height) {
            System.out.println("Printing array height using Advance Loop :" + h);
        }
    }
}
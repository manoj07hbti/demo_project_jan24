package array;

public class ArrayUsingAdvanceLoopDemo {

    public static void main(String[] args) {

        //Datatype varName [] = {value1, value2,value3.......value N}

        String countryName [] = {"INDIA","AUSTRALIA","PAKISTAN","AMERICA"};

        System.out.println("Printing array country name :"+countryName[0]);

        // TODO Write a Code Array country name using Advance loop

        for(String country : countryName){
            System.out.println("Printing array country name using Advance Loop :"+country);
        }
        // TODO Write a Code Array Distance using Advance loop

        int Distance [] = {10,20,50,60,80};
        for( int Dis : Distance){
            System.out.println("Printing array Distance using Advance Loop :"+Dis);
        }

        // TODO Write a Code Array Height using Do While loop

        double height [] = {3.5,4.0,5.6,6.2};
        for(double h : height){
            System.out.println("Printing array height using Advance Loop :"+h);
        }

    }


}

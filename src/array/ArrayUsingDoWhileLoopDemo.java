package array;

public class ArrayUsingDoWhileLoopDemo {

    public static void main(String[] args) {

        //Datatype varName [] = {value1, value2,value3.......value N}

        String countryName [] = {"INDIA","AUSTRALIA","PAKISTAN","AMREICA"};

        System.out.println("Printing array country name :"+countryName[0]);

        // TODO Write a Code Array country name using Do while loop

        int i=0;
        do{
            System.out.println("Printing array country name using do while loop :"+countryName[i]);
            i++;
        }while(i< countryName.length);

        // TODO Write a Code Array Distance using Do While loop

        int Distance [] = {10,20,50,60,80};
        int j=0;
        do{
            System.out.println("Printing array distance using do while loop :"+Distance[j]);
            j++;
        }while(j<Distance.length);

        // TODO Write a Code Array Height using Do While loop

        double height [] = {3.5,4.0,5.6,6.2};
        int k=0;
        do{
            System.out.println("Printing array height using do while loop :"+height[k]);
            k++;
        }while(k<height.length);


    }



}

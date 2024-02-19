package array;

public class DemoArray {

    public static void main(String[] args) {

        //Datatype varName [] = {value1, value2,value3.......value N};
        //TODO store name of students of a claas

        String studentNames[] ={"Rahul","Rohit","Jatin","Mukesh","Mohit","Manish"};

        // read data from Array  arrayName[INDEX];

        System.out.println("Printing array data : " +studentNames[3]);
        System.out.println("Printing array data : " +studentNames[4]);

        //TODO print all data of array
        for(int i=0; i<studentNames.length; i++){

            System.out.println("Printing array using loop : "+studentNames[i]);
        }

        // TODO do the same using while

        // Advanced for loop
        // for (Datatype varName : arrayName){
        //   //CODE
        // }

        for(String var : studentNames){

            System.out.println("Printing using Advanced loop..."+var);
        }

        //TODO find index of Jatin

        String name="Manish";
        for (int i=0; i<studentNames.length; i++){

            if(studentNames[i]==(name)){

                System.out.println("Data found at index :"+i);
            }else {
                System.out.println("Data not found in array...");
            }

        }


    }
}

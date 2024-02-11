package condition_statement_if_and_if_else;

public class OR_Operator {

    public static void main(String[] args) {

        int marks=80;
        String section="Math";

        //if(condition1 || condition2) 1.   TRUE  || TRUE = TRUE    1+1= 1

        if(marks>=33 || section=="Math" ){

            System.out.println("Marks is greater than 33 in section of Math");
        }else{
            System.out.println("Marks is not greater than 33 in section of Math");
        }

        // 2.   TRUE  || FALSE= TRUE    1+0= 1

        section="English";
        if(marks>=33 || section=="Math" ){

            System.out.println("Marks is greater than 33 in section of Math");
        }else{
            System.out.println("Marks is not greater than 33 in section of Math");
        }

        //4.   FALSE || FALSE= FALSE   0+0= 0
        marks = 32; section="English";
        if(marks>=33 || section=="Math" ){

            System.out.println("Marks is greater than 33 in section of Math");
        }else{
            System.out.println("Marks is not greater than 33 in section of English");
        }

        // TODO Write a code for Laptop brand based on brand name and ram configuration we need show GOod quality or  Not Good Quality

        String Brand="Lenovo";
        int ram=6;
        if(ram>=6 || Brand=="Lenovo" ){
            System.out.println("Brand Name Lenovo Is Good Quality With 6GB Ram");
        }else{
            System.out.println("Brand Name Lenovo Is Not Good Quality With 6GB Ram");
        }



    }


}

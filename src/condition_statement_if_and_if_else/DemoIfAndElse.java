package condition_statement_if_and_if_else;
public class DemoIfAndElse {

    public static void main(String[] args){

    /*   if(condition){
            CODE
        } else{
            CODE
        }  */

        //TODO - write a code given marks is greater or equal to 60 : first division

        int marks=-60;
        if(marks>=60){
            System.out.println("Given marks is greater or equal to 60 so you got first division:"+marks);
        }else{
            System.out.println("Given marks is not greater or equal to 60 so you have not got first division:"+marks);
        }
        //TODO - write a code to check student has cleared exam or not : exam cleared
        int mark =33;
        if(mark>=33){
            System.out.println("Student cleared Exam the with marks: "+mark);
        }else{
            System.out.println("Student did not cleared Exam the with marks: "+mark);
        }
        //TODO - write a code given price is greater or average product
        int price=-5000;
        if (price>=5000){
            System.out.println("Given price is grater than 5000 so costly product :" + price);
        }else{
            System.out.println("Given price is not grater than 5000 so average product :" +price);
        }
        //TODO - write a code for you are INDIAN Or Not Indian
        String nation="INDIAN";
        if(nation=="INDIAN"){
            System.out.println("You are Indian");
        }else{
            System.out.println("You are Not Indian");
        }



    }


}

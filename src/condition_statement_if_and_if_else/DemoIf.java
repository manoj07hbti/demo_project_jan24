package condition_statement_if_and_if_else;

public class DemoIf {

    public static void main(String[] args) {

        /*    SYNTAX:
        if(expression/condition){
            //CODE
        }            */

        //TODO - write a code given marks is greater or equal to 60 : first division

        int marks =60;
        if (marks>=60){
            System.out.println("Given marks is greater or equal to 60 so you got first division :" + marks);
        }
        int mark=33;
        if (mark<33) ;
        {
            System.out.println("given marks is less than 33 so you not cleared exam:" + mark);
        }
        int price = 6000;
        if (price > 5000) {
            System.out.println("Given price is grater than 5000 so costly product :" + price);
        }
        int prices = 4500;
        if (prices < 5000) ;
        {
            System.out.println("Given price is less than 5000 so average price product :" + prices);
        }

        String nation="You Are INDIAN";
        if(nation=="INDIAN");{
            System.out.println("You are living in India :"+nation);
        }
        String Nations="INDIAN";
        if(Nations!="INDIAN");{
            System.out.println("If You are Not INDIAN :"+Nations);
        }

        




    }
}
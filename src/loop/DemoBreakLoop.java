package loop;

public class DemoBreakLoop {

    public static void main(String[] args) {

        // TODO Month 1 : January , 2 Feb 3 ....12
        //  in case of Month is 13 then break from loop

        String monthName [] = {"Jan" , "Feb" , "March" , "April"  , "May" , "June" , "July" , "Aug" , "Sept" , "Oct" , "Nov" , "Dec"};

        for(int i=1; i<=15; i++){
            if(i==13){
                System.out.println("break from loop");
                break;
            }
            System.out.println("Printing monthName :"+monthName[i-1]);
        }
            // TODO Find a class where at
        //  least one student got failed :
        //   Print marks of Students in a class and if you find any students with less than 33 marks
        //   then you need break.

        int marks[] ={45 , 65 ,87 , 76 , 97 , 33 , 89 , 32 , 56 , 98};
        for(int i=1; i< marks.length; i++){
            if(marks[i]<33){
                System.out.println("Student got marks less than 33 than failed :"+marks[i]);
                break;
            }
        }



    }



}

package assignment;

public class AND_OR_Operator {
    public static void main(String[] args) {
        //TODO AND Operator
        // TODO write a code which tell which student got 60% marks in science stream? with all 4 scenario
        // 1.   TRUE & TRUE = TRUE     1*1= 1

        int marks = 65;
        String stream = "CS";
        if (marks >= 60 && stream == "CS") {
            System.out.println("Student got above 60 marks and from CS stream");
        } else {
            System.out.println("either Student not got above 60 marks and from CS stream");
        }

        //TODO we can put above code in any condition below
        //1- AND Operator : mendatory
        // if(condition1 && condition2)
        // 1.   TRUE & TRUE = TRUE     1*1= 1
        // 2.   TRUE & FALSE= FALSE    1*0= 0
        // 3.   FALSE & TRUE= FALSE    0*1= 0
        // 4.   FALSE & FALSE= FALSE   0*0= 0

     //==========================================================================================================


        //todo 2. OR Operator   ||  Optional
        //
        //if(condition1 || condition2)
        //
        // 1.   TRUE  || TRUE = TRUE    1+1= 1
        // 2.   TRUE  || FALSE= TRUE    1+0= 1
        // 3.   FALSE || TRUE=  TRUE    0+1= 1
        // 4.   FALSE || FALSE= FALSE   0+0= 0

     //TODO Wrtie a code for Laptop brand based on brand name and ram configuration we need show GOod quality or Not Good QUality

        String brand="hp";
        int ram=8;

        if (ram>=8 || brand=="hp"){
            System.out.println("Good Quality");}else {
            System.out.println("bad quality");}

        ////TODO we can put above code in any condition



    }
}

package conditional_statements;

public class DemoIfAndElse {

    public static void main(String[] args) {
     /*   if(condition){
            CODE
        } else{
            CODE
        }  */
        //TODO - Write a code to check given number is positive number or not

        int number=-3;

        if(number>0){
            System.out.println("Number is positive number:"+number);
        }else {
            System.out.println("Number is negative number:" + number);
        }

        // TODO find a given is even number or odd number

        if(number%2 ==0){
            System.out.println("Number is EVEN Number:"+number);
        }else {
            System.out.println("Number is ODD Number:"+number);
        }
        // TODO write a code to check whether student has cleared exam or not
        int marks=33;

        if(marks>=33){

            System.out.println("Student cleared Exam the with marks: "+marks);
        }else {
            System.out.println("Student did not clear the Exam with marks: "+marks);
        }



    }
}

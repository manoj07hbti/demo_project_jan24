package exception;

public class ExceptionInterview {

    public static void main(String[] args) {

        //Q1: CAN WE HAVE TRY BLOCK WITHOUT CATCH BLOCK ?
        //ANS-NO, EVERY TRY BLOCK SHOULD HAVE AT LEAST ONE CATCH OR FINALLY BLOCK

        try{
            int a=3;
            int b=4;
            int result= a/b;
            System.out.println("This is sample code..."+result);
        }

        catch (ArithmeticException e){
            System.out.println("This is catch block");
        }
        catch (Exception e){
            System.out.println("This is catch block");
        }

        finally {
            System.exit(1);
            System.out.println("THIS IS FINALLY BLOCK...");

        }

    }
}

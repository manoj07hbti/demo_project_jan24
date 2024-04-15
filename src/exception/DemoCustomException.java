package exception;

public class DemoCustomException {


    public void doVoting(int age) throws AgeNotEligibleException {

        if(age<18){
        //THROW EXCEPTION of AgeNotEligible
         throw new AgeNotEligibleException("Age must be greater or equal to 18");
        }else {
            System.out.println("WELCOME TO VOTING APP...");
        }
    }


    public static void main(String[] args) {
        DemoCustomException obj= new DemoCustomException();

        try {
            obj.doVoting(17);
        } catch (AgeNotEligibleException e) {
            System.out.println("Exception occurred..."+e);
        }

    }
}

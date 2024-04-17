package exceptions;

public class AccountOpening {

    public void openAcc(int amount) throws LessAmountException {

        if(amount<5000){
            //throw exception of LessAmount
            throw new LessAmountException("Minimum balance Required 5000/- rps for account open....");

        }else{
            System.out.println("Welcome To SBI Bank...");
        }

    }

    public static void main(String[] args) {
        AccountOpening obj = new AccountOpening();

        try {
            obj.openAcc(4500);
        } catch (LessAmountException e) {
            System.out.println("Exception Occurred......:"+e);
        }
    }

}

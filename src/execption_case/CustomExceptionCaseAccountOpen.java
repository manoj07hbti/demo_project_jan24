package execption_case;

public class CustomExceptionCaseAccountOpen {
    public void OpenAccount( int amount) throws LessAmountException {
        if (amount<5000){
            //throw exception LessAmount for new opening account

            throw new LessAmountException("Minimum amount should be 5000 rs. for open Account");
        }
        else {
            System.out.println("Welcome to HDFC BANK");
        }
    }

    public static void main(String[] args) {
        CustomExceptionCaseAccountOpen object = new CustomExceptionCaseAccountOpen();
        try {
            object.OpenAccount(5000);
        } catch (LessAmountException e) {
            System.out.println("Exception occurred"+e);
        }
    }
}

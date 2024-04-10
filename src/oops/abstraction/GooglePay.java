package oops.abstraction;

public class GooglePay implements Payment{
    @Override
    public void checkBalance() {

        System.out.println("This is check Balance of google pay");
    }

    @Override
    public void makePayment() {
        System.out.println("This is makePayment of google pay");
    }
}

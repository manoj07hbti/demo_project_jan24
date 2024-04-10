package oops.abstraction;

public class Paytm implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is check Balance of Paytm");
    }

    @Override
    public void makePayment() {
        System.out.println("This is check Balance of Paytm");
    }
}

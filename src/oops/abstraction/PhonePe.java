package oops.abstraction;

public class PhonePe implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is check Balance of PhonePe");
    }

    @Override
    public void makePayment() {
        System.out.println("This is check Balance of PhonePe");
    }
}

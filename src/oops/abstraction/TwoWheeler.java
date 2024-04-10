package oops.abstraction;

public class TwoWheeler extends Vehicle{


    @Override
    public void servicing() {
        System.out.println("Servicing method of Two wheeler");
    }

    @Override
    public void pricing() {
        System.out.println("Pricing method of Two wheeler");
    }

    public static void main(String[] args) {

        TwoWheeler obj= new TwoWheeler();
        obj.displayInformation();
    }
}

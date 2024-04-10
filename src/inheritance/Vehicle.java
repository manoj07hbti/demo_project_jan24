package inheritance;

public class Vehicle {
    private String CompanyName;
    private String model;
    private int year;
    private String fuelType;
    public Vehicle(String companyName, String model, int year, String fuelType) {
        CompanyName = companyName;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

   // private double fuelEfficiency;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
class car extends Vehicle{
private int NumOfSeats;
    public car(String companyName, String model, int year, String fuelType, int numOfSeats) {
        super(companyName, model, year, fuelType);
        NumOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return NumOfSeats;
    }
    public double getMaxSpeed(){
        return 120.0;
    }
}
class Bike extends car{
    @Override
    public String getCompanyName() {
        return super.getCompanyName();
    }

    @Override
    public void setCompanyName(String companyName) {
        super.setCompanyName(companyName);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public String getFuelType() {
        return super.getFuelType();
    }

    @Override
    public void setFuelType(String fuelType) {
        super.setFuelType(fuelType);
    }

    public Bike(String companyName, String model, int year, String fuelType, int numOfSeats) {
        super(companyName, model, year, fuelType, numOfSeats);
    }

    @Override
    public int getNumOfSeats() {
        return super.getNumOfSeats();
    }

    @Override
    public double getMaxSpeed() {
        return super.getMaxSpeed();
    }
}
class clintApp{
    public static void main(String[] args) {
        car car=new car("Mahindra","AX Opt 4-Str",2023,"Diesel",4);
        System.out.println("Model Name   : "+car.getModel());
        System.out.println("Year         : "+car.getYear());
        System.out.println("Company Name : "+car.getCompanyName());
        System.out.println("Fuel Type    : "+car.getFuelType());
        System.out.println("Max speed    : "+car.getMaxSpeed());
        System.out.println("Numb Of Seats: "+car.getNumOfSeats());

        System.out.println("=========================");
        Bike bike=new Bike("Honda","Splendor Plus",2020,"Petrol",2);
        System.out.println("Model Name   : "+bike.getModel());
        System.out.println("Year         : "+bike.getYear());
        System.out.println("Company Name : "+bike.getCompanyName());
        System.out.println("Fuel Type    : "+bike.getFuelType());
        System.out.println("Max speed    : "+bike.getMaxSpeed());
        System.out.println("Numb Of Seats: "+bike.getNumOfSeats());
    }
}
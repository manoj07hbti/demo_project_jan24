package opps.inheritance_demo;

public class Vehicle {

    // Coding For Two Wheeler
    protected void name1() {
        System.out.println("This Vehicle name is Yamaha Bike ...");
    }
    protected void Wheeler() {
        System.out.println("Yamaha have 2 tyree and 4 gears...");
    }
    protected void engine_cc() {
        System.out.println("This Vehicle bike have 150 cc engine...");
    }

    // Coding for Three Wheeler

    public void name2 (){
        System.out.println("This is a tempo......");
    }
    public void driver (){
        System.out.println("Tempo have driver......");
    }
    public void licence (){
        System.out.println("This tempo is a commercial vehicle licence......");
    }

    // Coding for Four Wheeler
    public void name() {
        System.out.println("This Vehicle name is Thar...");
    }
    public void year() {
        System.out.println("This Vehicle purchase year is 2024...");
    }
    public void engine() {
        System.out.println("This Vehicle engine number is CX23156...");
    }


    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.name();
        obj.year();
        obj.engine();
    }


}

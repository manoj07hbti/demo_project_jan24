package oops_Inheritance;

public class Vehicle{

    // create of bike coding
    public void modelA(){
        System.out.println("Vehicle is Honda bike");
    }
    public void power(){
        System.out.println("Two Wheeler bike 125cc");
    }
    public void speed(){
        System.out.println("two wheeler speed up to 180km");
    }



    // create fo Auto wheeler coding
    public void modelB(){
        System.out.println("Auto type vehicle");
    }
    public void CNG(){
        System.out.println("CNG type Auto");
    }
    public void colour(){
        System.out.println("Auto colour is yellow");
    }





    // create of Car coding
    public void modelC(){
        System.out.println("Car Name is CIVIC");
    }
    public void type(){
        System.out.println("This is sedan type car");
    }
    public void engine(){
        System.out.println("This is 1250CC car");
    }




   // Create of Dumper coding
    public void modelD(){
        System.out.println("This type Dumper");
    }public void NoWheeler(){
        System.out.println(" This is dumper of sixteen wheeler");
    }public void Ton(){
        System.out.println("loading capacity 1000ton ");
    }



    public static void main(String[] args) {
        Vehicle object = new Vehicle();
        object.modelA();
        object.colour();
        object.type();
        object.Ton();
    }
}




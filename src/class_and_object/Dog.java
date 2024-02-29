package class_and_object;

public class Dog {
    //properties : data member

    String name = "Polo";
    int age = 3;
    String breedname = "Pit Bull";




public static void main(String[] args) {
    //How to create object :
    // ClassName objName= new ClassName(); // default Constructor

    Dog obj1= new Dog(); // we have create obj1 of Dog class
    Dog obj2= new Dog(); // we have create obj2 of Dog class

    System.out.println("Printing Dog Name : "+obj1.name +" age: "+obj1.age+"Breed :"+obj1.breedname);
    System.out.println("Printing Dog Name : "+obj2.name +" age: "+obj2.age+"Breed :"+obj2.breedname);
}

}


package class_and_object;

public class Dog {

    //properties : data member
    String name="Rocky";
    int age=7;
    String breedName="Husky";

    public static void main(String[] args) {
        // How to create Object :
        //ClassName objName= new ClassName(); // Default Constructor

        Dog obj1= new Dog(); // we have create object obj1 of Dog class
        Dog obj2= new Dog();// we have create object obj2 of Dog class

        System.out.println("Printing OBJ1 Dog Name: "+obj1.name +" age: "+obj1.age +" Breed: "+obj1.breedName);

        System.out.println("Printing OBJ2 Dog Name: "+obj2.name +" age: "+obj2.age +" Breed: "+obj2.breedName);

    }

}

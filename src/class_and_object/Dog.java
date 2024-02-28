package class_and_object;

public class Dog {

    //properties : data member
    String name;
    int age;
    String breedName;

    //Parameterized constructor
    public Dog(String name, int age, String breedName) {
        this.name = name;
        this.age = age;
        this.breedName = breedName;
    }

    public static void main(String[] args) {
        // How to create Object :
        //ClassName objName= new ClassName(); // Default Constructor

        Dog obj1 = new Dog("John", 6, "Labra"); // we have create object obj1 of Dog class
        Dog obj2 = new Dog("Robbie", 7, "German");// we have create object obj2 of Dog class


        System.out.println("Printing OBJ1 Dog Name: " + obj1.name + " age: " + obj1.age + " Breed: " + obj1.breedName);

        System.out.println("Printing OBJ2 Dog Name: " + obj2.name + " age: " + obj2.age + " Breed: " + obj2.breedName);

    }

}

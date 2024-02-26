package class_and_object;

public class Book {

    String name="Java";
    int page=500;
    String writerName="Games Gosling";
    double price=439.56;

    public static void main(String[] args) {

        Book obj1= new Book();
        System.out.println("Printing Book Name: "+obj1.name+" Page: "+obj1.page+" Writer name: "+obj1.writerName);

        Book obj2= new Book();

    }
}

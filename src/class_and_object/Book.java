package class_and_object;

public class Book {

    String name;
    int page;
    String writerName;
    double price;

    public Book(String name, int page, String writerName, double price) {
        this.name = name;
        this.page = page;
        this.writerName = writerName;
        this.price = price;
    }

    public static void main(String[] args) {

        Book obj1= new Book("Java",500,"Games Gosling",232.23);
        System.out.println("Printing Book Name: "+obj1.name+" Page: "+obj1.page+" Writer name: "+obj1.writerName);

        Book obj2= new Book("Spring boot",200,"ABCD",231.11);
        System.out.println("Printing obj2 Book Name: "+obj2.name+" Page: "+obj2.page+" Writer name: "+obj2.writerName);

    }
}
